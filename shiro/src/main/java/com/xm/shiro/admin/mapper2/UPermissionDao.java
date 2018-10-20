package com.xm.shiro.admin.mapper2;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.UPermission;
import com.xm.shiro.constant.BaseDao;

@Service
@Mapper
public interface UPermissionDao extends BaseDao<UPermission, Long> {

	/**
	 * 根据用户id获取用户权限
	 * @param obj
	 */
	 List<UPermission> findPermissionByUid(Long id);
}
