package com.yearbook.base;

import com.yearbook.model.enumClass.DSType;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseRepository {

	@Autowired
	@Qualifier("sqlSessionTemplateForYearbook")
	protected SqlSessionTemplate masterSql;

	/*@Autowired
	@Qualifier("batchSqlSessionTemplateForBO")
	protected SqlSessionTemplate batchSql;

	@Autowired
	@Qualifier("slaveSqlSessionTemplateForBO")
	protected SqlSessionTemplate slaveSql;*/

	public SqlSessionTemplate getDS(DSType... dsType) {

		if (dsType.length == 0) {
			return masterSql;
		} else {
			switch (dsType[0]) {
				case MASTER:
					return masterSql;
				/*case SLAVE:
					return slaveSql;
				case BATCH:
					return batchSql;*/
				default:
					return masterSql;
			}
		}
	}
}
