package com.fm.edusys.mapper.auto;

import com.fm.edusys.model.auto.TSysDictData;
import com.fm.edusys.model.auto.TSysDictDataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 字典数据表
 * 
 * @author 一休
 * @email 438081243@qq.com
 * @date 2019-09-08 00:10:43
 */
@Mapper
public interface TSysDictDataMapper {
    long countByExample(TSysDictDataExample example);

    int deleteByExample(TSysDictDataExample example);
		
    int insert(TSysDictData record);

    int insertSelective(TSysDictData record);

    List<TSysDictData> selectByExample(TSysDictDataExample example);
		
    int updateByExampleSelective(@Param("record") TSysDictData record, @Param("example") TSysDictDataExample example);

    int updateByExample(@Param("record") TSysDictData record, @Param("example") TSysDictDataExample example);

    TSysDictData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TSysDictData record);
}