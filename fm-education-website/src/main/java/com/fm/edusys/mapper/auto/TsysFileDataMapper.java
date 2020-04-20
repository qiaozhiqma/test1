package com.fm.edusys.mapper.auto;

import com.fm.edusys.model.auto.TsysFileData;
import com.fm.edusys.model.auto.TsysFileDataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TsysFileDataMapper {
    int countByExample(TsysFileDataExample example);

    int deleteByExample(TsysFileDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(TsysFileData record);

    int insertSelective(TsysFileData record);

    List<TsysFileData> selectByExample(TsysFileDataExample example);

    TsysFileData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TsysFileData record, @Param("example") TsysFileDataExample example);

    int updateByExample(@Param("record") TsysFileData record, @Param("example") TsysFileDataExample example);

    int updateByPrimaryKeySelective(TsysFileData record);

    int updateByPrimaryKey(TsysFileData record);
}