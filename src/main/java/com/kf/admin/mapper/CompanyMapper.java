package com.kf.admin.mapper;

import com.kf.admin.pojo.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-21 20:44
 **/
@Mapper
public interface CompanyMapper {

    List<Company> getCompanyListByStatus(@Param("status") Integer status);

    Company getCompanyByCompanyId(@Param("companyId") Integer companyId);

    void deleteCompanyByCompanyId(@Param("companyId")Integer companyId);

    String getCompanyImgByCpId(@Param("companyId")Integer companyId);
}
