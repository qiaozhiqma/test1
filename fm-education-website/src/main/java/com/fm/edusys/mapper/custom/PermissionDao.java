package com.fm.edusys.mapper.custom;

import java.util.List;

import com.fm.edusys.model.auto.TsysPermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface  PermissionDao {
	/**
	 * 查询全部权限 
	 * @return
	 */
	List<TsysPermission> findAll();
	 
	 /**
	  * 根据用户id查询出用户的所有权限
	  * @param userId
	  * @return
	  */
	 List<TsysPermission> findByAdminUserId(String userId);
	 
	 /**
	  * 根据角色id查询权限
	  * @param roleid
	  * @return
	  */
	 List<TsysPermission> queryRoleId(String roleid);
	 
	 
	 
	 
}
