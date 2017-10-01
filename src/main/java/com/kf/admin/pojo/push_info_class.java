package com.kf.admin.pojo;

import java.io.Serializable;

public class push_info_class implements Serializable {
    private Integer picId;

    private Integer mcId;

    private String picName;

    private static final long serialVersionUID = 1L;

    public push_info_class(Integer picId, Integer mcId, String picName) {
        this.picId = picId;
        this.mcId = mcId;
        this.picName = picName;
    }

    public push_info_class() {
        super();
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public Integer getMcId() {
        return mcId;
    }

    public void setMcId(Integer mcId) {
        this.mcId = mcId;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        push_info_class other = (push_info_class) that;
        return (this.getPicId() == null ? other.getPicId() == null : this.getPicId().equals(other.getPicId()))
            && (this.getMcId() == null ? other.getMcId() == null : this.getMcId().equals(other.getMcId()))
            && (this.getPicName() == null ? other.getPicName() == null : this.getPicName().equals(other.getPicName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPicId() == null) ? 0 : getPicId().hashCode());
        result = prime * result + ((getMcId() == null) ? 0 : getMcId().hashCode());
        result = prime * result + ((getPicName() == null) ? 0 : getPicName().hashCode());
        return result;
    }
}