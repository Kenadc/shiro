package com.xm.shiro.admin.mapper2;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.UUser;
import com.xm.shiro.constant.BaseDao;

@Service
@Mapper
public interface UUserDao extends BaseDao<UUser, Long> {
	
	/**
	 * 增加对象
	 * @param obj
	 */
	public UUser findByName(String	 name);
}
