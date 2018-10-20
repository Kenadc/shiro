package com.xm.shiro.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.UUser;
import com.xm.shiro.admin.mapper2.UUserDao;
import com.xm.shiro.admin.service.UUserService;

@Service("UUserService")
public class UUserviceImpl implements UUserService{

	@Autowired
	private UUserDao uUserDao;
	
	@Override
	public UUser findByName(String name) {
		return uUserDao.findByName(name);
	}

}
