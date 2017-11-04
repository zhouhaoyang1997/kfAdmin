package com.kf.admin.mapper;

import com.kf.admin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhy
 * @create 2017-11-03 23:21
 **/
@Mapper
public interface UserMapper {

    User getUserByName(@Param("username") String username);
}
