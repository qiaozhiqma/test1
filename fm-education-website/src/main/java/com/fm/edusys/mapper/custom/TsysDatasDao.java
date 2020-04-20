package com.fm.edusys.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fm.edusys.model.auto.TsysDatas;
@Mapper
public interface TsysDatasDao {
	
	public List<TsysDatas> selectByPrimaryKeys(@Param("ids") List<String> ids);
	
}