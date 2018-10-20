package com.xm.shiro.admin.service;

import java.util.List;

import com.xm.shiro.admin.entity.URole;

public interface URoleService {
	public List<URole> findRoleByUid(Long	 obj);
}
