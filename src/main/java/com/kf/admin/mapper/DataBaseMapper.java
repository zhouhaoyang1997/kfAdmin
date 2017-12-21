package com.kf.admin.mapper;

import com.kf.admin.pojo.DataBaseBackup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhy
 * @create 2017-12-21 14:20
 **/
@Mapper
public interface DataBaseMapper {

    List<DataBaseBackup> getDBList();

    void delDbByFileName(String fileName);
}
