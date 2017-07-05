package com.kaishengit.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.kaishengit.entity.User;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.util.MyBatisUtil;

public class UserMapperTest {

	@Test
	public void testUserMapper() {

		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		User user = sqlSession.selectOne("com.kaishengit.mapper.UserMapper.findById", 1);
		System.out.println(user);
		sqlSession.close();
	}
	
	@Test
	public void test2() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.findAll();
		for(User u : list) {
			System.out.println(u);
		}
		sqlSession.close();
	}
	
	@Test
	public void testLoadDept() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.findAllLoadDept();
		for(User u : list) {
			System.out.println(u.getDept());
		}
		sqlSession.close();
	}
}











