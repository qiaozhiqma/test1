package com.fm.edusys.mapper.auto;

import com.fm.edusys.model.auto.TsysFile;
import com.fm.edusys.model.auto.TsysFileExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TsysFileMapper {
    int countByExample(TsysFileExample example);

    int deleteByExample(TsysFileExample example);

    int deleteByPrimaryKey(String id);

    int insert(TsysFile record);

    int insertSelective(TsysFile record);

    List<TsysFile> selectByExample(TsysFileExample example);

    TsysFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TsysFile record, @Param("example") TsysFileExample example);

    int updateByExample(@Param("record") TsysFile record, @Param("example") TsysFileExample example);

    int updateByPrimaryKeySelective(TsysFile record);

    int updateByPrimaryKey(TsysFile record);
}