package com.demomstest.mapper;

import com.demomstest.entity.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(String areaId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(String areaId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}