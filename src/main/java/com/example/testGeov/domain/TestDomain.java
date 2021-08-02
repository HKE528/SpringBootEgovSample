package com.example.testGeov.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class TestDomain {
    @Id @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    private String comment;
}
