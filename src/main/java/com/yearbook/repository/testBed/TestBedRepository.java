package com.yearbook.repository.testBed;

import com.yearbook.base.BaseRepository;
import com.yearbook.model.testBed.TestBed;
import com.yearbook.model.enumClass.DSType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestBedRepository extends BaseRepository {

	private static final String PREFIX = "com.yearbook.repository.testBed.TestBed.";

	public List<TestBed> selectTestBedAll(DSType... dsType) {
		return this.getDS(dsType).selectList(PREFIX + "selectTestBedAll");
	}

}
