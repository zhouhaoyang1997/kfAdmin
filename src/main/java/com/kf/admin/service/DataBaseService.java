package com.kf.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kf.admin.mapper.DataBaseMapper;
import com.kf.admin.pojo.DataBaseBackup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhy
 * @create 2017-12-21 14:19
 **/
@Service
public class DataBaseService {
    @Autowired
    private DataBaseMapper dataBaseMapper;

    public PageInfo<DataBaseBackup> getDBList(int limit,int offset) {
        PageHelper.startPage(offset/limit+1,limit);
        PageInfo<DataBaseBackup> pageInfo = new PageInfo<DataBaseBackup>(dataBaseMapper.getDBList());
        return pageInfo;
    }

    public void delDbByFileName(String fileName) {
        dataBaseMapper.delDbByFileName(fileName);
    }
}
