package com.kf.admin.mapper;

import com.kf.admin.pojo.MultiCondition;
import com.kf.admin.pojo.PushInfo;

import java.util.List;

import com.kf.admin.vo.BasePushInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PushInfoMapper {

    PushInfo selectByPiId(Integer piId);
    List<BasePushInfo> selectByMultiCondition(MultiCondition multiCondition);

    void deletePushInfoByPiId(@Param("piId") Integer piId);
}
