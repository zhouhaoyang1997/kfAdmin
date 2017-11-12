package com.kf.admin.mapper;

import com.kf.admin.pojo.Advert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-08 19:40
 **/
@Mapper
public interface AdvertMapper {
    List<Advert> getAdvertList();

    List<String> getAdvertPageList();

    List<Advert> getAdvertsByPage(@Param("page") String page);

    Advert getAdvertByPositionAndPage(@Param("page") String page, @Param("position") String position);
}
