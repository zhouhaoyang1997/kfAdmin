package com.kf.admin.mapper;

import com.kf.admin.pojo.push_info_tag;
import com.kf.admin.pojo.push_info_tagKey;

public interface push_info_tagMapper {
    int deleteByPrimaryKey(push_info_tagKey key);

    int insert(push_info_tag record);

    int insertSelective(push_info_tag record);

    push_info_tag selectByPrimaryKey(push_info_tagKey key);

    int updateByPrimaryKeySelective(push_info_tag record);

    int updateByPrimaryKey(push_info_tag record);
}