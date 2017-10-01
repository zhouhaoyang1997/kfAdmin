package com.kf.admin.pojo;

import java.io.Serializable;

public class TagContent implements Serializable {
    private Integer tcId;

    private String tcName;

    private Integer tagId;

    private static final long serialVersionUID = 1L;

    public TagContent(Integer tcId, String tcName, Integer tagId) {
        this.tcId = tcId;
        this.tcName = tcName;
        this.tagId = tagId;
    }

    public TagContent() {
        super();
    }

    public Integer getTcId() {
        return tcId;
    }

    public void setTcId(Integer tcId) {
        this.tcId = tcId;
    }

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName == null ? null : tcName.trim();
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
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
        TagContent other = (TagContent) that;
        return (this.getTcId() == null ? other.getTcId() == null : this.getTcId().equals(other.getTcId()))
            && (this.getTcName() == null ? other.getTcName() == null : this.getTcName().equals(other.getTcName()))
            && (this.getTagId() == null ? other.getTagId() == null : this.getTagId().equals(other.getTagId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTcId() == null) ? 0 : getTcId().hashCode());
        result = prime * result + ((getTcName() == null) ? 0 : getTcName().hashCode());
        result = prime * result + ((getTagId() == null) ? 0 : getTagId().hashCode());
        return result;
    }
}