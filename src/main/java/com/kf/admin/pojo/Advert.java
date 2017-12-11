package com.kf.admin.pojo;

import java.util.Date;

/**
 * @author zhy
 * @create 2017-11-08 19:37
 **/
public class Advert {
    Integer advertId;
    String advertPosition;
    String advertUrl;
    String demoUrl;
    String advertPage;
    String advertForward;
    Integer width;
    Integer height;
    Date expireTime;
    String advertPosTitle;
    String advertTitle;

    public String getAdvertPosTitle() {
        return advertPosTitle;
    }

    public void setAdvertPosTitle(String advertPosTitle) {
        this.advertPosTitle = advertPosTitle;
    }

    public String getAdvertTitle() {
        return advertTitle;
    }

    public void setAdvertTitle(String advertTitle) {
        this.advertTitle = advertTitle;
    }

    public Integer getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Integer advertId) {
        this.advertId = advertId;
    }

    public String getAdvertPosition() {
        return advertPosition;
    }

    public void setAdvertPosition(String advertPosition) {
        this.advertPosition = advertPosition;
    }

    public String getAdvertUrl() {
        return advertUrl;
    }

    public void setAdvertUrl(String advertUrl) {
        this.advertUrl = advertUrl;
    }

    public String getDemoUrl() {
        return demoUrl;
    }

    public void setDemoUrl(String demoUrl) {
        this.demoUrl = demoUrl;
    }

    public String getAdvertPage() {
        return advertPage;
    }

    public void setAdvertPage(String advertPage) {
        this.advertPage = advertPage;
    }

    public String getAdvertForward() {
        return advertForward;
    }

    public void setAdvertForward(String advertForward) {
        this.advertForward = advertForward;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
}
