/**
 * Copyright Notice ====================================================
 * This file contains proprietary information of SVX.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2017 All rights reserved. =============================
 */
package com.demomstest.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.demomstest.entity.AreaEntity;

import java.util.List;

public interface AreaDao {

	AreaEntity selectAreaById(AreaEntity areaEntity);
}