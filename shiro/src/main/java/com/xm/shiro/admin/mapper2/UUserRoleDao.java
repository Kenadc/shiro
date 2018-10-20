package com.xm.shiro.admin.mapper2;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.UUserRole;
import com.xm.shiro.constant.BaseDao;

@Service
 @Mapper
public interface UUserRoleDao extends BaseDao<UUserRole, Long> {
	
	/**
	 * 增加对象
	 * @param obj
	 */
	//public void add(SysMessageTep	 obj);
}
