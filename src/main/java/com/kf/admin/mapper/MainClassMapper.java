package com.kf.admin.mapper;

import com.kf.admin.pojo.MainClass;

public interface MainClassMapper {
    int deleteByPrimaryKey(Integer mcId);

    int insert(MainClass record);

    int insertSelective(MainClass record);

    MainClass selectByPrimaryKey(Integer mcId);

    int updateByPrimaryKeySelective(MainClass record);

    int updateByPrimaryKey(MainClass record);
}