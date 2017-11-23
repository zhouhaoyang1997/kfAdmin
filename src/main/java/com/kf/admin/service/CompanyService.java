package com.kf.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kf.admin.mapper.CompanyMapper;
import com.kf.admin.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
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

    public Company getCompanyByCompanyId(Integer companyId) {
        return companyMapper.getCompanyByCompanyId(companyId);
    }

    public String getCompanyImgByCpId(Integer CompanyId){
        return companyMapper.getCompanyImgByCpId(CompanyId);
    }
    public void deleteCompanyByCompanyId(Integer companyId) {
        String imgbath = getCompanyImgByCpId(companyId);
        File img = new File(imgbath);
        if(img.exists()){
            System.out.println("file exists !");
        }
        companyMapper.deleteCompanyByCompanyId(companyId);
    }
}
