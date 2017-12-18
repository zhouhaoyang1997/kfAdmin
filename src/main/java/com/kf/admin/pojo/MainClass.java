package com.kf.admin.pojo;

import java.util.List;


public class MainClass {
    private int mcId;
    private String mcImg;
    private String mcName;
    private int mcClickNums;

    private List<SecondClass> secondClasses;

    public List<SecondClass> getSecondClasses() {
        return secondClasses;
    }

    public void setSecondClasses(List<SecondClass> secondClasses) {
        this.secondClasses = secondClasses;
    }

    public int getMcId() {
        return mcId;
    }

    public void setMcId(int mcId) {
        this.mcId = mcId;
    }

    public String getMcImg() {
        return mcImg;
    }

    public void setMcImg(String mcImg) {
        this.mcImg = mcImg;
    }

    public String getMcName() {
        return mcName;
    }

    public void setMcName(String mcName) {
        this.mcName = mcName;
    }

    public int getMcClickNums() {
        return mcClickNums;
    }

    public void setMcClickNums(int mcClickNums) {
        this.mcClickNums = mcClickNums;
    }
}
