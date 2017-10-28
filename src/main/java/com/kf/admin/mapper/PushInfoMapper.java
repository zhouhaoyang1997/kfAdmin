package com.kf.admin.mapper;

import com.kf.admin.pojo.PushInfo;
import com.kf.admin.pojo.PushInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface PushInfoMapper {
    int countByExample(PushInfoExample example);

    int deleteByExample(PushInfoExample example);

    int deleteByPrimaryKey(Integer piId);

    int insert(PushInfo record);

    int insertSelective(PushInfo record);

    List<PushInfo> selectByExample(PushInfoExample example);

    PushInfo selectByPrimaryKey(Integer piId);

    int updateByExampleSelective(@Param("record") PushInfo record, @Param("example") PushInfoExample example);

    int updateByExample(@Param("record") PushInfo record, @Param("example") PushInfoExample example);

    int updateByPrimaryKeySelective(PushInfo record);

    int updateByPrimaryKey(PushInfo record);
}