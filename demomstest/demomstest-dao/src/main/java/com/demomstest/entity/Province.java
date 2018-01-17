package com.demomstest.entity;

public class Province {
    private String provinceId;

    private String provinceName;

    private String parentId;

    private Byte provinceLevel;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Byte getProvinceLevel() {
        return provinceLevel;
    }

    public void setProvinceLevel(Byte provinceLevel) {
        this.provinceLevel = provinceLevel;
    }
}