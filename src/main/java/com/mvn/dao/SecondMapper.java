package com.mvn.dao;

import com.mvn.entity.Second;

public interface SecondMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Second record);

    int insertSelective(Second record);

    Second selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Second record);

    int updateByPrimaryKey(Second record);
}