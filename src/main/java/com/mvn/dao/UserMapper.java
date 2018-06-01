package com.mvn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mvn.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectUserByName(@Param("name")String name);
}