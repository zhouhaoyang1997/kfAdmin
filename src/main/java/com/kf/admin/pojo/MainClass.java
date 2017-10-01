package com.kf.admin.pojo;

import java.io.Serializable;

public class MainClass implements Serializable {
    private Integer mcId;

    private String mcImg;

    private String mcName;

    private Integer mcClickNums;

    private static final long serialVersionUID = 1L;

    public MainClass(Integer mcId, String mcImg, String mcName, Integer mcClickNums) {
        this.mcId = mcId;
        this.mcImg = mcImg;
        this.mcName = mcName;
        this.mcClickNums = mcClickNums;
    }

    public MainClass() {
        super();
    }

    public Integer getMcId() {
        return mcId;
    }

    public void setMcId(Integer mcId) {
        this.mcId = mcId;
    }

    public String getMcImg() {
        return mcImg;
    }

    public void setMcImg(String mcImg) {
        this.mcImg = mcImg == null ? null : mcImg.trim();
    }

    public String getMcName() {
        return mcName;
    }

    public void setMcName(String mcName) {
        this.mcName = mcName == null ? null : mcName.trim();
    }

    public Integer getMcClickNums() {
        return mcClickNums;
    }

    public void setMcClickNums(Integer mcClickNums) {
        this.mcClickNums = mcClickNums;
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
        MainClass other = (MainClass) that;
        return (this.getMcId() == null ? other.getMcId() == null : this.getMcId().equals(other.getMcId()))
            && (this.getMcImg() == null ? other.getMcImg() == null : this.getMcImg().equals(other.getMcImg()))
            && (this.getMcName() == null ? other.getMcName() == null : this.getMcName().equals(other.getMcName()))
            && (this.getMcClickNums() == null ? other.getMcClickNums() == null : this.getMcClickNums().equals(other.getMcClickNums()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMcId() == null) ? 0 : getMcId().hashCode());
        result = prime * result + ((getMcImg() == null) ? 0 : getMcImg().hashCode());
        result = prime * result + ((getMcName() == null) ? 0 : getMcName().hashCode());
        result = prime * result + ((getMcClickNums() == null) ? 0 : getMcClickNums().hashCode());
        return result;
    }
}