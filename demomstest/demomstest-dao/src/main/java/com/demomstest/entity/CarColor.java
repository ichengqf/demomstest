package com.demomstest.entity;

import java.util.Date;

public class CarColor {
    private String id;

    private String colorId;

    private String seriesId;

    private String colorNameEn;

    private String colorNameCn;

    private String colorPainting;

    private String colorFlag;

    private String colorStatus;

    private String createUser;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private String imageUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getColorNameEn() {
        return colorNameEn;
    }

    public void setColorNameEn(String colorNameEn) {
        this.colorNameEn = colorNameEn;
    }

    public String getColorNameCn() {
        return colorNameCn;
    }

    public void setColorNameCn(String colorNameCn) {
        this.colorNameCn = colorNameCn;
    }

    public String getColorPainting() {
        return colorPainting;
    }

    public void setColorPainting(String colorPainting) {
        this.colorPainting = colorPainting;
    }

    public String getColorFlag() {
        return colorFlag;
    }

    public void setColorFlag(String colorFlag) {
        this.colorFlag = colorFlag;
    }

    public String getColorStatus() {
        return colorStatus;
    }

    public void setColorStatus(String colorStatus) {
        this.colorStatus = colorStatus;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}