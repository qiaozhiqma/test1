
package com.fm.edusys.mapper.custom;

import java.util.List;

import com.fm.edusys.model.auto.TsysRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色Dao
 * @ClassName: RoleDao
 * @author fuce
 * @date 2018年8月25日
 *
 */
@Mapper
public interface RoleDao {
	/**
	 * 根据用户id查询角色
	 * @param userid
	 * @return
	 */
	public List<TsysRole> queryUserRole(String userid);
}
