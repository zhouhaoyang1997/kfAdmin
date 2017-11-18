package com.kf.admin.mapper;

import com.kf.admin.pojo.Tip;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-14 22:23
 **/
@Mapper
public interface TipMapper {
    public List<Tip> getTipList();

    void updateTip(@Param("tipId") String tipId);
}
