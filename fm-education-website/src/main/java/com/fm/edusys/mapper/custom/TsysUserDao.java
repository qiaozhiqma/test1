package com.fm.edusys.mapper.custom;

import com.fm.edusys.model.auto.TsysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: TsysUserDao
 * @author fuce
 * @date 2018年8月25日
 *
 */
@Mapper
public interface TsysUserDao {
	/**
	 * 根据用户名字查询用户
	 * @param username
	 * @return
	 */
	public TsysUser queryUserName(String username);
}
