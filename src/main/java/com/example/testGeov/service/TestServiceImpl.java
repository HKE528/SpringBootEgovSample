package com.example.testGeov.service;

import com.example.testGeov.domain.TestDomain;
import com.example.testGeov.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TestServiceImpl extends EgovAbstractServiceImpl implements TestService {
//public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public List<TestDomain> findAllData() {
        Iterable<TestDomain> all = testRepository.findAll();

        List<TestDomain> result = new ArrayList<>();
        all.forEach(result::add);

        return result;
    }

    @Override
    public TestDomain findOne(Long id) {
        TestDomain result = testRepository.findById(id).get();

        return result;
    }
}
