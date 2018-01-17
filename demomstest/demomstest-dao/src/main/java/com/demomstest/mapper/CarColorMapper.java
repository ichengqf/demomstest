package com.demomstest.mapper;

import com.demomstest.entity.CarColor;

public interface CarColorMapper {
    int deleteByPrimaryKey(String id);

    int insert(CarColor record);

    int insertSelective(CarColor record);

    CarColor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CarColor record);

    int updateByPrimaryKey(CarColor record);
}