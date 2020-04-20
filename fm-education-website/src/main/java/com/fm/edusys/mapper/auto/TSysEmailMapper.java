package com.fm.edusys.mapper.auto;

import com.fm.edusys.model.auto.TSysEmail;
import com.fm.edusys.model.auto.TSysEmailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TSysEmailMapper {
    long countByExample(TSysEmailExample example);

    int deleteByExample(TSysEmailExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysEmail record);

    int insertSelective(TSysEmail record);

    List<TSysEmail> selectByExample(TSysEmailExample example);

    TSysEmail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysEmail record, @Param("example") TSysEmailExample example);

    int updateByExample(@Param("record") TSysEmail record, @Param("example") TSysEmailExample example);

    int updateByPrimaryKeySelective(TSysEmail record);

    int updateByPrimaryKey(TSysEmail record);
}