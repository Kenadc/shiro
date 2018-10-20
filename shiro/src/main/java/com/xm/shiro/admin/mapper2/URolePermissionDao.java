package com.xm.shiro.admin.mapper2;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.URolePermission;
import com.xm.shiro.constant.BaseDao;

@Service
 @Mapper
public interface URolePermissionDao extends BaseDao<URolePermission, Long> {
	
	/**
	 * 增加对象
	 * @param obj
	 */
	//public void add(SysMessageTep	 obj);
}
