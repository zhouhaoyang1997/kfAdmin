package com.kf.admin.controller;

import com.kf.admin.mapper.PushInfoMapper;
import com.kf.admin.pojo.PushInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PushManagerController {
    @Autowired
    PushInfoMapper pushInfoMapper;
    @PostMapping("pushInfoSearch")
    public List pushInfoSearch(String mcId,String keyWord,String userName){
        PushInfoExample pushInfoExample = new PushInfoExample();
        PushInfoExample.Criteria criteria = pushInfoExample.createCriteria();
        //多条件查询
        if(mcId!=null&&!mcId.equals("")){
            criteria.andPiMcEqualTo(Integer.valueOf(mcId));
        }
        if(mcId!=null&&!mcId.equals("")){
            criteria.andPiMcEqualTo(Integer.valueOf(mcId));
        }
        if(mcId!=null&&!mcId.equals("")){
            criteria.andPiMcEqualTo(Integer.valueOf(mcId));
        }
//        pushInfoMapper.selectByExample();
        return  null;
    }
}
