package com.kf.admin.controller;

import com.github.pagehelper.PageInfo;
import com.kf.admin.pojo.Tip;
import com.kf.admin.service.TipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-14 22:16
 **/
@RestController
public class TipController {
    @Autowired
    TipService tipService;

    @GetMapping("/tipManage")
    public ModelAndView tipManage(){
        return new ModelAndView("ReportManage");
    }
    /**
     * 获得所有的tip
     * @return list<tip>
     */
    @GetMapping("/getTipLIst")
    public PageInfo<Tip> getTipList(Integer limit, Integer offset){
        return tipService.getTipList(limit,offset);
    }

    /**
     * 更新状态为1（已处理）
     * @param tipId
     * @return
     */
    @GetMapping("/updateTip")
    public String updateTip(String tipId){
        tipService.updateTip(tipId);
        return "suceess";
    }
}
