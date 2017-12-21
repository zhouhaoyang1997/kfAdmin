package com.kf.admin.pojo;

import java.util.Date;

/**
 * @author zhy
 * @create 2017-12-21 14:06
 **/
public class DataBaseBackup {
    Date createTime;
    String fileName;
    String filePath;
    int fileId;

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
