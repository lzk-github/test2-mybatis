package com.kaishengit.mapper;

import java.util.List;

import com.kaishengit.entity.User;

public interface UserMapper {

	public void save(User user);
	public void deleteById(Integer id);
	public void update(User user);
	public User findById(Integer id);
	public List<User> findAll();
	public List<User> findAllLoadDept();
	
}
