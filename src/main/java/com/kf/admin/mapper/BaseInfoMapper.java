package com.kf.admin.mapper;

import com.kf.admin.pojo.BaseInfo;

public interface BaseInfoMapper {
    int deleteByPrimaryKey(Integer piId);

    int insert(BaseInfo record);

    int insertSelective(BaseInfo record);

    BaseInfo selectByPrimaryKey(Integer piId);

    int updateByPrimaryKeySelective(BaseInfo record);

    int updateByPrimaryKey(BaseInfo record);
}