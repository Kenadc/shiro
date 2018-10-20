package com.xm.shiro.admin.service;

import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.UUser;

public interface UUserService {
	public UUser findByName(String	 name);
}
