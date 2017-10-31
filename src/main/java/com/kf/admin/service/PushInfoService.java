package com.kf.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kf.admin.mapper.PushInfoMapper;
import com.kf.admin.pojo.MultiCondition;
import com.kf.admin.vo.BasePushInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PushInfoService {
    @Autowired
    PushInfoMapper pushInfoMapper;

    public PageInfo<BasePushInfo> selectByMultiCondition(int limit, int offset, MultiCondition multiCondition){
        PageHelper.startPage(offset/limit+1, limit);
        //多条件查询
        List<BasePushInfo> list = pushInfoMapper.selectByMultiCondition(multiCondition);
        System.out.println(list);
        PageInfo<BasePushInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
