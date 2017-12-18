package com.kf.admin.mapper;

import com.kf.admin.pojo.MainClass;
import com.kf.admin.pojo.SecondClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhy
 * @create 2017-12-15 17:58
 **/
@Mapper
public interface ClassMapper {
    public List<SecondClass> getSC();
    public List<MainClass> getMC();
}
