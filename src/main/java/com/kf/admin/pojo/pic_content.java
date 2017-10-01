package com.kf.admin.pojo;

import java.io.Serializable;

public class pic_content extends pic_contentKey implements Serializable {
    private String pcContent;

    private static final long serialVersionUID = 1L;

    public pic_content(Integer pcId, Integer picId, String pcContent) {
        super(pcId, picId);
        this.pcContent = pcContent;
    }

    public pic_content() {
        super();
    }

    public String getPcContent() {
        return pcContent;
    }

    public void setPcContent(String pcContent) {
        this.pcContent = pcContent == null ? null : pcContent.trim();
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
        pic_content other = (pic_content) that;
        return (this.getPcId() == null ? other.getPcId() == null : this.getPcId().equals(other.getPcId()))
            && (this.getPicId() == null ? other.getPicId() == null : this.getPicId().equals(other.getPicId()))
            && (this.getPcContent() == null ? other.getPcContent() == null : this.getPcContent().equals(other.getPcContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPcId() == null) ? 0 : getPcId().hashCode());
        result = prime * result + ((getPicId() == null) ? 0 : getPicId().hashCode());
        result = prime * result + ((getPcContent() == null) ? 0 : getPcContent().hashCode());
        return result;
    }
}