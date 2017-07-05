package com.kaishengit.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory sqlSessionFactory = getInstance();

	private static SqlSessionFactory getInstance() {
		SqlSessionFactory factory = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			throw new RuntimeException("创建SQLSessionFactory失败",e);
		}
		return factory;
	}
	
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
}








