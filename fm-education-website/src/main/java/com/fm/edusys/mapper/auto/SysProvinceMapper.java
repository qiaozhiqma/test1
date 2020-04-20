package com.fm.edusys.mapper.auto;

import com.fm.edusys.model.auto.SysProvince;
import com.fm.edusys.model.auto.SysProvinceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysProvinceMapper {
    long countByExample(SysProvinceExample example);

    int deleteByExample(SysProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysProvince record);

    int insertSelective(SysProvince record);

    List<SysProvince> selectByExample(SysProvinceExample example);

    SysProvince selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysProvince record, @Param("example") SysProvinceExample example);

    int updateByExample(@Param("record") SysProvince record, @Param("example") SysProvinceExample example);

    int updateByPrimaryKeySelective(SysProvince record);

    int updateByPrimaryKey(SysProvince record);
}