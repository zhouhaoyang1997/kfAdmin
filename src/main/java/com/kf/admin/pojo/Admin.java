package com.kf.admin.pojo;

import com.kf.admin.util.Md5Util;

import java.sql.Timestamp;

/**
 * @author zhy
 * @create 2017-11-02 23:46
 **/
public class Admin {
    //加盐
    final String salt = "kfadmin";
    int userId;
    String userName;
    String userPassword;
    Timestamp createTime;
    Timestamp lastedTime;
    //权限级别
    int level=1;

    public String getSalt() {
        return salt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
    //二重加密
    public void setUserPassword(String userPassword) {
        this.userPassword = Md5Util.MD5(Md5Util.MD5(userPassword)+salt);
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastedTime() {
        return lastedTime;
    }

    public void setLastedTime(Timestamp lastedTime) {
        this.lastedTime = lastedTime;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", createTime=" + createTime +
                ", lastedTime=" + lastedTime +
                ", level=" + level +
                '}';
    }
}
