package com.kf.admin.pojo;

import java.io.Serializable;

public class push_info_tag extends push_info_tagKey implements Serializable {
    private Integer piTagContent;

    private static final long serialVersionUID = 1L;

    public push_info_tag(Integer tagId, Integer piId, Integer piTagContent) {
        super(tagId, piId);
        this.piTagContent = piTagContent;
    }

    public push_info_tag() {
        super();
    }

    public Integer getPiTagContent() {
        return piTagContent;
    }

    public void setPiTagContent(Integer piTagContent) {
        this.piTagContent = piTagContent;
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
        push_info_tag other = (push_info_tag) that;
        return (this.getTagId() == null ? other.getTagId() == null : this.getTagId().equals(other.getTagId()))
            && (this.getPiId() == null ? other.getPiId() == null : this.getPiId().equals(other.getPiId()))
            && (this.getPiTagContent() == null ? other.getPiTagContent() == null : this.getPiTagContent().equals(other.getPiTagContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTagId() == null) ? 0 : getTagId().hashCode());
        result = prime * result + ((getPiId() == null) ? 0 : getPiId().hashCode());
        result = prime * result + ((getPiTagContent() == null) ? 0 : getPiTagContent().hashCode());
        return result;
    }
}