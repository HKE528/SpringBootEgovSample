package com.example.testGeov.repository;

import com.example.testGeov.domain.TestDomain;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TestRepository extends PagingAndSortingRepository<TestDomain, Long> {
}
