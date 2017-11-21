package com.kf.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kf.admin.mapper.CompanyMapper;
import com.kf.admin.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-21 20:31
 **/
@Service
public class CompanyService {
    @Autowired
    CompanyMapper companyMapper;

    public PageInfo<Company> getCompanyList(Integer limit, Integer offset) {
        PageHelper.startPage(offset/limit+1, limit);
        List<Company> list = companyMapper.getCompanyList();
        PageInfo<Company> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
