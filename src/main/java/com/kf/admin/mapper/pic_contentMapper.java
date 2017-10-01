package com.kf.admin.mapper;

import com.kf.admin.pojo.pic_content;
import com.kf.admin.pojo.pic_contentKey;

public interface pic_contentMapper {
    int deleteByPrimaryKey(pic_contentKey key);

    int insert(pic_content record);

    int insertSelective(pic_content record);

    pic_content selectByPrimaryKey(pic_contentKey key);

    int updateByPrimaryKeySelective(pic_content record);

    int updateByPrimaryKey(pic_content record);
}