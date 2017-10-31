package com.kf.admin.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userPhone;

    private String userEmail;

    private Date createTime;

    private Date lastedTime;

    private Long status;

    private String userDescription;

    private Integer userPush;

    private Integer userCollection;

    private String userImg;

    private static final long serialVersionUID = 1L;

    public User(Integer userId, String userName, String userPassword, String userPhone, String userEmail, Date createTime, Date lastedTime, Long status, String userDescription, Integer userPush, Integer userCollection, String userImg) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.createTime = createTime;
        this.lastedTime = lastedTime;
        this.status = status;
        this.userDescription = userDescription;
        this.userPush = userPush;
        this.userCollection = userCollection;
        this.userImg = userImg;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastedTime() {
        return lastedTime;
    }

    public void setLastedTime(Date lastedTime) {
        this.lastedTime = lastedTime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription == null ? null : userDescription.trim();
    }

    public Integer getUserPush() {
        return userPush;
    }

    public void setUserPush(Integer userPush) {
        this.userPush = userPush;
    }

    public Integer getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Integer userCollection) {
        this.userCollection = userCollection;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastedTime() == null ? other.getLastedTime() == null : this.getLastedTime().equals(other.getLastedTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUserDescription() == null ? other.getUserDescription() == null : this.getUserDescription().equals(other.getUserDescription()))
            && (this.getUserPush() == null ? other.getUserPush() == null : this.getUserPush().equals(other.getUserPush()))
            && (this.getUserCollection() == null ? other.getUserCollection() == null : this.getUserCollection().equals(other.getUserCollection()))
            && (this.getUserImg() == null ? other.getUserImg() == null : this.getUserImg().equals(other.getUserImg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastedTime() == null) ? 0 : getLastedTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUserDescription() == null) ? 0 : getUserDescription().hashCode());
        result = prime * result + ((getUserPush() == null) ? 0 : getUserPush().hashCode());
        result = prime * result + ((getUserCollection() == null) ? 0 : getUserCollection().hashCode());
        result = prime * result + ((getUserImg() == null) ? 0 : getUserImg().hashCode());
        return result;
    }
}