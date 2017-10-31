package com.kf.admin.vo;

import com.kf.admin.pojo.PushInfo;

import java.io.Serializable;
import java.sql.Timestamp;

//用来显示列表 （没办法 就差个username）
public class BasePushInfo implements Serializable {

    private Integer piId;
    private String piTitle;
    private String piUserId;
    private String piPhone;
    private Timestamp piPushDate;
    private double piChujia;
    private String piZhiding;
    private String userName;
    //当前信息状态,0正常,1被删除,2正在审核,
    private Integer status;

    public Integer getPiId() {
        return piId;
    }

    public void setPiId(Integer piId) {
        this.piId = piId;
    }

    public String getPiTitle() {
        return piTitle;
    }

    public void setPiTitle(String piTitle) {
        this.piTitle = piTitle;
    }

    public String getPiUserId() {
        return piUserId;
    }

    public void setPiUserId(String piUserId) {
        this.piUserId = piUserId;
    }

    public String getPiPhone() {
        return piPhone;
    }

    public void setPiPhone(String piPhone) {
        this.piPhone = piPhone;
    }

    public Timestamp getPiPushDate() {
        return piPushDate;
    }

    public void setPiPushDate(Timestamp piPushDate) {
        this.piPushDate = piPushDate;
    }

    public double getPiChujia() {
        return piChujia;
    }

    public void setPiChujia(double piChujia) {
        this.piChujia = piChujia;
    }

    public String getPiZhiding() {
        return piZhiding;
    }

    public void setPiZhiding(String piZhiding) {
        this.piZhiding = piZhiding;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
