package com.kf.admin.controller;
import com.github.pagehelper.PageInfo;
import com.kf.admin.pojo.MultiCondition;
import com.kf.admin.service.PushInfoService;
import com.kf.admin.vo.BasePushInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PushManagerController {
    @Autowired
    PushInfoService pushInfoService;
    @GetMapping("/pushInfoSearch")
    public PageInfo<BasePushInfo> pushInfoSearch(int limit, int offset, MultiCondition multiCondition){
        return  pushInfoService.selectByMultiCondition(limit,offset,multiCondition);
    }
    @GetMapping("/deletePushInfoByPiId")
    public String deletePushInfoByPiId(int piId){
        return  pushInfoService.deletePushInfoByPiId(piId);
    }
}
