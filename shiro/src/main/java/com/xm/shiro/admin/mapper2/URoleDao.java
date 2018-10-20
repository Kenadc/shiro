package com.xm.shiro.admin.mapper2;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.URole;
import com.xm.shiro.constant.BaseDao;

@Service
@Mapper
public interface URoleDao extends BaseDao<URole, Long> {
	
	/**
	 * 根据用户ID获取该用户所在组的角色权限
	 * @param obj
	 */
	public List<URole> findRoleByUid(Long	 obj);
}
