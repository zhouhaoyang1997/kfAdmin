package com.kf.admin.pojo;

public class MultiCondition {
    String mcId;
    String keyWord;
    String userName;

    public String getMcId() {
        return mcId;
    }

    public void setMcId(String mcId) {
        this.mcId = mcId;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = "%"+keyWord+"%";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "MultiCondition{" +
                "mcId='" + mcId + '\'' +
                ", keyWord='" + keyWord + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
