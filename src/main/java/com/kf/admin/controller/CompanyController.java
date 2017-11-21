package com.kf.admin.controller;

import com.github.pagehelper.PageInfo;
import com.kf.admin.pojo.Company;
import com.kf.admin.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhy
 * @create 2017-11-20 19:40
 **/
@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("/companyManage")
    public ModelAndView companyManage(){
        return new ModelAndView("companyManage");
    }
    @GetMapping("/getCompanyList")
    public PageInfo<Company> getCompanyList(Integer limit, Integer offset){
        return companyService.getCompanyList(limit,offset);
    }
}
