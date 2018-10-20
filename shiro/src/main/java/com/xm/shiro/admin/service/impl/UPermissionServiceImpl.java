package com.xm.shiro.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.UPermission;
import com.xm.shiro.admin.mapper2.UPermissionDao;
import com.xm.shiro.admin.service.UPermissionService;

@Service("UPermissionService")
public class UPermissionServiceImpl implements UPermissionService{

	@Autowired
	private UPermissionDao uPermissionDao;
	
	@Override
	public List<UPermission> findPermissionByUid(Long id) {
		// TODO Auto-generated method stub
		return uPermissionDao.findPermissionByUid(id);
	}

}
