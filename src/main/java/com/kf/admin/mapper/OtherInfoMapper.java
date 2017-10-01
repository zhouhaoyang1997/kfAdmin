package com.kf.admin.mapper;

import com.kf.admin.pojo.OtherInfo;
import com.kf.admin.pojo.OtherInfoKey;

public interface OtherInfoMapper {
    int deleteByPrimaryKey(OtherInfoKey key);

    int insert(OtherInfo record);

    int insertSelective(OtherInfo record);

    OtherInfo selectByPrimaryKey(OtherInfoKey key);

    int updateByPrimaryKeySelective(OtherInfo record);

    int updateByPrimaryKey(OtherInfo record);
}