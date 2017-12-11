package com.kf.admin.pojo;

/**
 * @author zhy
 * @create 2017-12-10 22:21
 **/
public class Banner {
    int bannerId;
    int advertId;
    String bannerTitle;
    String bannerContent;
    int mcId;

    public Banner(int advertId, String bannerTitle, String bannerContent) {
        this.advertId = advertId;
        this.bannerTitle = bannerTitle;
        this.bannerContent = bannerContent;
    }

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public int getAdvertId() {
        return advertId;
    }

    public void setAdvertId(int advertId) {
        this.advertId = advertId;
    }

    public String getBannerTitle() {
        return bannerTitle;
    }

    public void setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
    }

    public String getBannerContent() {
        return bannerContent;
    }

    public void setBannerContent(String bannerContent) {
        this.bannerContent = bannerContent;
    }

    public int getMcId() {
        return mcId;
    }

    public void setMcId(int mcId) {
        this.mcId = mcId;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "bannerId=" + bannerId +
                ", advertId=" + advertId +
                ", bannerTitle='" + bannerTitle + '\'' +
                ", bannerContent='" + bannerContent + '\'' +
                ", mcId=" + mcId +
                '}';
    }
}
