package com.proper.quiz.hibernate.repository;

import com.proper.quiz.hibernate.entity.AnEntity;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.QueryHint;

public interface AnRepository extends PagingAndSortingRepository<AnEntity, String> {

    @QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value = "true") })
    AnEntity findByUsername(String username);

}
