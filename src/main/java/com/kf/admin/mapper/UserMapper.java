package com.kf.admin.mapper;

import com.kf.admin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-03 23:21
 **/
@Mapper
public interface UserMapper {

    User getUserByName(@Param("username") String username);

    Integer addBlackList(@Param("userId") String userId);

    String updateUser(User user);

    List<User> getBlackList();

    void updateUserAttr(@Param("userId")Integer userId,@Param("attr") Integer attr);
}
