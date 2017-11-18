package com.kf.admin.pojo;

import java.util.Date;

/**
 * @author zhy
 * @create 2017-11-14 22:13
 **/
public class Tip {
    private Integer piId;
    private Integer userId;
    private String tipContent;
    private Integer tipId;
    private Integer tipStatus;
    private Date tipCreateTime;

    public Date getTipCreateTime() {
        return tipCreateTime;
    }

    public void setTipCreateTime(Date tipCreateTime) {
        this.tipCreateTime = tipCreateTime;
    }

    public Integer getPiId() {
        return piId;
    }

    public void setPiId(Integer piId) {
        this.piId = piId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTipContent() {
        return tipContent;
    }

    public void setTipContent(String tipContent) {
        this.tipContent = tipContent;
    }

    public Integer getTipId() {
        return tipId;
    }

    public void setTipId(Integer tipId) {
        this.tipId = tipId;
    }

    public Integer getTipStatus() {
        return tipStatus;
    }

    public void setTipStatus(Integer tipStatus) {
        this.tipStatus = tipStatus;
    }

}
