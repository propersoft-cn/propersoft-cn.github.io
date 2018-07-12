package com.proper.quiz.hibernate.entity

import org.hibernate.annotations.CacheConcurrencyStrategy
import org.hibernate.annotations.GenericGenerator

import javax.persistence.*

@Entity
@Table(name = "quiz_an")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
class AnEntity {

    AnEntity() { }

    AnEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    String id

    @Column(unique = true, nullable = false)
    String username

    @Column(nullable = false)
    String password

    String description

}
