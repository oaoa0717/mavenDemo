package com.mvn.service;

import java.util.List;

import com.mvn.entity.User;

public interface IUserService {
	//增加
	public int insertUser(User user);
	//批量增加
	public int batchInsertUsers(List<User> users);
	
	//删除
	public int deleteById(int id);
	//批量删除
	public int batchDeleteUsers(int[] id);
	
	//修改
	public int updateUser(User user);
	
	//查询
	public User selectById(int id);
	//查询多个
	public List<User> selectUsers(User user);
	
}
