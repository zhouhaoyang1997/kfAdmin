package com.kf.admin.pojo;

import java.io.Serializable;
import java.util.Date;

public class BaseInfo implements Serializable {
    private Integer piId;

    private String piTitle;

    private String piContent;

    private Integer piMc;

    private Integer piSc;

    private Integer piUser;

    private String piAddress;

    private String piImg;

    private Integer piScan;

    private Date piPushDate;

    private Double piChujia;

    private String piZhiding;

    private String piContactPerson;

    private String piPhone;

    private String piQq;

    private Integer piDistrict;

    private static final long serialVersionUID = 1L;

    public BaseInfo(Integer piId, String piTitle, String piContent, Integer piMc, Integer piSc, Integer piUser, String piAddress, String piImg, Integer piScan, Date piPushDate, Double piChujia, String piZhiding, String piContactPerson, String piPhone, String piQq, Integer piDistrict) {
        this.piId = piId;
        this.piTitle = piTitle;
        this.piContent = piContent;
        this.piMc = piMc;
        this.piSc = piSc;
        this.piUser = piUser;
        this.piAddress = piAddress;
        this.piImg = piImg;
        this.piScan = piScan;
        this.piPushDate = piPushDate;
        this.piChujia = piChujia;
        this.piZhiding = piZhiding;
        this.piContactPerson = piContactPerson;
        this.piPhone = piPhone;
        this.piQq = piQq;
        this.piDistrict = piDistrict;
    }

    public BaseInfo() {
        super();
    }

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
        this.piTitle = piTitle == null ? null : piTitle.trim();
    }

    public String getPiContent() {
        return piContent;
    }

    public void setPiContent(String piContent) {
        this.piContent = piContent == null ? null : piContent.trim();
    }

    public Integer getPiMc() {
        return piMc;
    }

    public void setPiMc(Integer piMc) {
        this.piMc = piMc;
    }

    public Integer getPiSc() {
        return piSc;
    }

    public void setPiSc(Integer piSc) {
        this.piSc = piSc;
    }

    public Integer getPiUser() {
        return piUser;
    }

    public void setPiUser(Integer piUser) {
        this.piUser = piUser;
    }

    public String getPiAddress() {
        return piAddress;
    }

    public void setPiAddress(String piAddress) {
        this.piAddress = piAddress == null ? null : piAddress.trim();
    }

    public String getPiImg() {
        return piImg;
    }

    public void setPiImg(String piImg) {
        this.piImg = piImg == null ? null : piImg.trim();
    }

    public Integer getPiScan() {
        return piScan;
    }

    public void setPiScan(Integer piScan) {
        this.piScan = piScan;
    }

    public Date getPiPushDate() {
        return piPushDate;
    }

    public void setPiPushDate(Date piPushDate) {
        this.piPushDate = piPushDate;
    }

    public Double getPiChujia() {
        return piChujia;
    }

    public void setPiChujia(Double piChujia) {
        this.piChujia = piChujia;
    }

    public String getPiZhiding() {
        return piZhiding;
    }

    public void setPiZhiding(String piZhiding) {
        this.piZhiding = piZhiding == null ? null : piZhiding.trim();
    }

    public String getPiContactPerson() {
        return piContactPerson;
    }

    public void setPiContactPerson(String piContactPerson) {
        this.piContactPerson = piContactPerson == null ? null : piContactPerson.trim();
    }

    public String getPiPhone() {
        return piPhone;
    }

    public void setPiPhone(String piPhone) {
        this.piPhone = piPhone == null ? null : piPhone.trim();
    }

    public String getPiQq() {
        return piQq;
    }

    public void setPiQq(String piQq) {
        this.piQq = piQq == null ? null : piQq.trim();
    }

    public Integer getPiDistrict() {
        return piDistrict;
    }

    public void setPiDistrict(Integer piDistrict) {
        this.piDistrict = piDistrict;
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
        BaseInfo other = (BaseInfo) that;
        return (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
            && (this.getPiTitle() == null ? other.getPiTitle() == null : this.getPiTitle().equals(other.getPiTitle()))
            && (this.getPiContent() == null ? other.getPiContent() == null : this.getPiContent().equals(other.getPiContent()))
            && (this.getPiMc() == null ? other.getPiMc() == null : this.getPiMc().equals(other.getPiMc()))
            && (this.getPiSc() == null ? other.getPiSc() == null : this.getPiSc().equals(other.getPiSc()))
            && (this.getPiUser() == null ? other.getPiUser() == null : this.getPiUser().equals(other.getPiUser()))
            && (this.getPiAddress() == null ? other.getPiAddress() == null : this.getPiAddress().equals(other.getPiAddress()))
            && (this.getPiImg() == null ? other.getPiImg() == null : this.getPiImg().equals(other.getPiImg()))
            && (this.getPiScan() == null ? other.getPiScan() == null : this.getPiScan().equals(other.getPiScan()))
            && (this.getPiPushDate() == null ? other.getPiPushDate() == null : this.getPiPushDate().equals(other.getPiPushDate()))
            && (this.getPiChujia() == null ? other.getPiChujia() == null : this.getPiChujia().equals(other.getPiChujia()))
            && (this.getPiZhiding() == null ? other.getPiZhiding() == null : this.getPiZhiding().equals(other.getPiZhiding()))
            && (this.getPiContactPerson() == null ? other.getPiContactPerson() == null : this.getPiContactPerson().equals(other.getPiContactPerson()))
            && (this.getPiPhone() == null ? other.getPiPhone() == null : this.getPiPhone().equals(other.getPiPhone()))
            && (this.getPiQq() == null ? other.getPiQq() == null : this.getPiQq().equals(other.getPiQq()))
            && (this.getPiDistrict() == null ? other.getPiDistrict() == null : this.getPiDistrict().equals(other.getPiDistrict()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiTitle() == null) ? 0 : getPiTitle().hashCode());
        result = prime * result + ((getPiContent() == null) ? 0 : getPiContent().hashCode());
        result = prime * result + ((getPiMc() == null) ? 0 : getPiMc().hashCode());
        result = prime * result + ((getPiSc() == null) ? 0 : getPiSc().hashCode());
        result = prime * result + ((getPiUser() == null) ? 0 : getPiUser().hashCode());
        result = prime * result + ((getPiAddress() == null) ? 0 : getPiAddress().hashCode());
        result = prime * result + ((getPiImg() == null) ? 0 : getPiImg().hashCode());
        result = prime * result + ((getPiScan() == null) ? 0 : getPiScan().hashCode());
        result = prime * result + ((getPiPushDate() == null) ? 0 : getPiPushDate().hashCode());
        result = prime * result + ((getPiChujia() == null) ? 0 : getPiChujia().hashCode());
        result = prime * result + ((getPiZhiding() == null) ? 0 : getPiZhiding().hashCode());
        result = prime * result + ((getPiContactPerson() == null) ? 0 : getPiContactPerson().hashCode());
        result = prime * result + ((getPiPhone() == null) ? 0 : getPiPhone().hashCode());
        result = prime * result + ((getPiQq() == null) ? 0 : getPiQq().hashCode());
        result = prime * result + ((getPiDistrict() == null) ? 0 : getPiDistrict().hashCode());
        return result;
    }
}