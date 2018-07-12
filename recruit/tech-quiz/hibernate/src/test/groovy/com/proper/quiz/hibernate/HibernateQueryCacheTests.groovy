package com.proper.quiz.hibernate

import com.proper.quiz.hibernate.entity.AnEntity
import com.proper.quiz.hibernate.repository.AnRepository
import org.hibernate.Session
import org.hibernate.stat.Statistics
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

import javax.persistence.EntityManager

@Transactional(transactionManager = "jpaTransactionManager")
@ContextConfiguration("/spring/applicationContext.xml")
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
class HibernateQueryCacheTests {

    @Autowired
    private AnRepository repo

    @Autowired
    private EntityManager entityManager

    private Statistics statistics

    @Test
    void checkQueryCache() {
        Session session = (Session) entityManager.getDelegate()
        statistics = session.getSessionFactory().getStatistics()
        statistics.clear()

        repo.save(new AnEntity('abc', '123'))
        AnEntity entity = repo.findByUsername('abc')
        // cache entity after first load
        assertPut 1
        assertMiss 1

        // hit count of cache will be increased after each load operation
        3.times { idx ->
            repo.findByUsername('abc')
            assertHit idx+1
        }

        entity.setDescription('update_account')
        repo.save(entity)
        repo.findByUsername('abc')
        assertPut 2
        assertHit 3
        assertMiss 2
    }

    def assertPut(put) {
        assert statistics.getQueryCachePutCount() == put
    }

    def assertHit(hit) {
        assert statistics.getQueryCacheHitCount() == hit
    }

    def assertMiss(miss) {
        assert statistics.getQueryCacheMissCount() == miss
    }

}
