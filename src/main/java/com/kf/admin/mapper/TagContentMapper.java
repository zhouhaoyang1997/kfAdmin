package com.kf.admin.mapper;

import com.kf.admin.pojo.TagContent;

public interface TagContentMapper {
    int deleteByPrimaryKey(Integer tcId);

    int insert(TagContent record);

    int insertSelective(TagContent record);

    TagContent selectByPrimaryKey(Integer tcId);

    int updateByPrimaryKeySelective(TagContent record);

    int updateByPrimaryKey(TagContent record);
}