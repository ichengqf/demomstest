package com.demomstest.mapper;

import com.demomstest.entity.Organaization;

public interface OrganaizationMapper {
    int deleteByPrimaryKey(String orgId);

    int insert(Organaization record);

    int insertSelective(Organaization record);

    Organaization selectByPrimaryKey(String orgId);

    int updateByPrimaryKeySelective(Organaization record);

    int updateByPrimaryKey(Organaization record);
}