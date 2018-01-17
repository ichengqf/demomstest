/**
 * Copyright Notice ====================================================
 * This file contains proprietary information of SVW.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2017 All rights reserved. =============================
 */
 
package com.demomstest.entity;

import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;

import java.io.Serializable;


/**   
 * @Title: Area Entity
 * @Description: 区域信息字典Entity
 * @author SVW-SX
 * @version Mon, 15 Jan 2018 10:16:17 +0800
 *
 */
public class AreaEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 区域ID
     */
	private java.lang.String areaId;
	
	/**
     * 区域名称
     */
	private java.lang.String areaName;
	
	/**
     * 品牌类别
     */
	private java.lang.String areaType;
	
	/**
     * 状态
     */
	private java.lang.String areaStatus;

	public java.lang.String getAreaId() {
		return areaId;
	}

	public void setAreaId(java.lang.String areaId) {
		this.areaId = areaId;
	}

	public java.lang.String getAreaName() {
		return areaName;
	}

	public void setAreaName(java.lang.String areaName) {
		this.areaName = areaName;
	}

	public java.lang.String getAreaType() {
		return areaType;
	}

	public void setAreaType(java.lang.String areaType) {
		this.areaType = areaType;
	}

	public java.lang.String getAreaStatus() {
		return areaStatus;
	}

	public void setAreaStatus(java.lang.String areaStatus) {
		this.areaStatus = areaStatus;
	}
	
	
	
	
	
}