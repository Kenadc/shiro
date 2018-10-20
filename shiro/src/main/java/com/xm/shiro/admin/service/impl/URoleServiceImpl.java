package com.xm.shiro.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.URole;
import com.xm.shiro.admin.mapper2.URoleDao;
import com.xm.shiro.admin.service.URoleService;

@Service("URoleService")
public class URoleServiceImpl implements URoleService {
	
	@Autowired
	private URoleDao uRoleDao;
	
	@Override
	public List<URole> findRoleByUid(Long obj) {
		return uRoleDao.findRoleByUid(obj);
	}

}
