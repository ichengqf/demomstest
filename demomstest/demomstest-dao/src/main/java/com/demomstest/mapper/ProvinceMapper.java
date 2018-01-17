package com.demomstest.mapper;

import com.demomstest.entity.Province;

public interface ProvinceMapper {
    int deleteByPrimaryKey(String provinceId);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(String provinceId);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}