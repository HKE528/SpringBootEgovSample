package com.example.testGeov.service;

import com.example.testGeov.domain.TestDomain;

import java.util.List;

public interface TestService {
    List<TestDomain> findAllData();
    TestDomain findOne(Long id);
}
