package com.kf.admin.mapper;

import com.kf.admin.pojo.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-21 20:44
 **/
@Mapper
public interface CompanyMapper {

    public List<Company> getCompanyList();
}
