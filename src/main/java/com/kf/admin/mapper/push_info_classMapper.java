package com.kf.admin.mapper;

import com.kf.admin.pojo.push_info_class;

public interface push_info_classMapper {
    int deleteByPrimaryKey(Integer picId);

    int insert(push_info_class record);

    int insertSelective(push_info_class record);

    push_info_class selectByPrimaryKey(Integer picId);

    int updateByPrimaryKeySelective(push_info_class record);

    int updateByPrimaryKey(push_info_class record);
}