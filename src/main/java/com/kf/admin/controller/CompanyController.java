package com.kf.admin.controller;

import com.github.pagehelper.PageInfo;
import com.kf.admin.pojo.Company;
import com.kf.admin.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/companyInfo/{companyId}")
    public ModelAndView companyInfo(@PathVariable Integer companyId){
        ModelAndView modelAndView = new ModelAndView("companyInfo");
        Company company = getCompanyByCompanyId(companyId);
        modelAndView.addObject("cpInfo",company);
        return modelAndView;
    }
    @GetMapping("/getCompanyListByStatus")
    public PageInfo<Company> getCompanyListByStatus(Integer limit, Integer offset,Integer status){
        return companyService.getCompanyListByStatus(limit,offset,status);
    }
    @GetMapping("/getCompanyByCompanyId")
    public Company getCompanyByCompanyId(Integer companyId){
        return companyService.getCompanyByCompanyId(companyId);
    }
    @GetMapping("/deleteCompanyByCompanyId")
    public void deleteCompanyByCompanyId(Integer companyId){
        companyService.deleteCompanyByCompanyId(companyId);
    }
}
