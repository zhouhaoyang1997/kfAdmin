package com.kf.admin.mapper;

import com.kf.admin.pojo.SecondClass;

public interface SecondClassMapper {
    int deleteByPrimaryKey(Integer scId);

    int insert(SecondClass record);

    int insertSelective(SecondClass record);

    SecondClass selectByPrimaryKey(Integer scId);

    int updateByPrimaryKeySelective(SecondClass record);

    int updateByPrimaryKey(SecondClass record);
}