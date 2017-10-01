package com.kf.admin.pojo;

import java.io.Serializable;

public class SecondClass implements Serializable {
    private Integer scId;

    private String scName;

    private Integer scMcId;

    private Integer scClickNums;

    private static final long serialVersionUID = 1L;

    public SecondClass(Integer scId, String scName, Integer scMcId, Integer scClickNums) {
        this.scId = scId;
        this.scName = scName;
        this.scMcId = scMcId;
        this.scClickNums = scClickNums;
    }

    public SecondClass() {
        super();
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public Integer getScMcId() {
        return scMcId;
    }

    public void setScMcId(Integer scMcId) {
        this.scMcId = scMcId;
    }

    public Integer getScClickNums() {
        return scClickNums;
    }

    public void setScClickNums(Integer scClickNums) {
        this.scClickNums = scClickNums;
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
        SecondClass other = (SecondClass) that;
        return (this.getScId() == null ? other.getScId() == null : this.getScId().equals(other.getScId()))
            && (this.getScName() == null ? other.getScName() == null : this.getScName().equals(other.getScName()))
            && (this.getScMcId() == null ? other.getScMcId() == null : this.getScMcId().equals(other.getScMcId()))
            && (this.getScClickNums() == null ? other.getScClickNums() == null : this.getScClickNums().equals(other.getScClickNums()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScId() == null) ? 0 : getScId().hashCode());
        result = prime * result + ((getScName() == null) ? 0 : getScName().hashCode());
        result = prime * result + ((getScMcId() == null) ? 0 : getScMcId().hashCode());
        result = prime * result + ((getScClickNums() == null) ? 0 : getScClickNums().hashCode());
        return result;
    }
}