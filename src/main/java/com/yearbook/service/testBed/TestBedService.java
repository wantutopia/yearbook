package com.yearbook.service.testBed;

import com.yearbook.model.testBed.TestBed;
import com.yearbook.repository.testBed.TestBedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestBedService {

    @Autowired
    TestBedRepository testBedRepository;

    public List<TestBed> selectTestBedAll() {
        return testBedRepository.selectTestBedAll();
    }

}
