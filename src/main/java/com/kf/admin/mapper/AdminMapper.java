package com.kf.admin.mapper;

import com.kf.admin.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-03 00:15
 **/
@Mapper
public interface AdminMapper {
    void insertAdmin(Admin admin);
    Admin getAdminByUserId(@Param("userId") int userId);
    Admin judgeAdmin(Admin admin);
    List<Admin> getAdminList();
    void deleteAdminById(@Param("userId") Integer userId);
}
