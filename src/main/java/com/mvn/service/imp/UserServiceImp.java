package com.mvn.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.mvn.dao.UserMapper;
import com.mvn.entity.User;
import com.mvn.service.IUserService;
import com.mvn.util.BeanUtil;
import com.mvn.util.PagedResult;

public class UserServiceImp implements IUserService {
	
	@Autowired
	private UserMapper usermap;
	
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int batchInsertUsers(List<User> users) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int batchDeleteUsers(int[] id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PagedResult<User> queryByPage(String name, Integer pageNo, Integer pageSize) {
		// TODO Auto-generated method stub
		pageNo = pageNo == null?1:pageNo;  
	    pageSize = pageSize == null?10:pageSize;  
	    PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。  
	    return BeanUtil.toPagedResult(usermap.selectUserByName(name));  
	}
}
