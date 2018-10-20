package com.xm.shiro.admin.service;

import java.util.List;

import com.xm.shiro.admin.entity.UPermission;

public interface UPermissionService {
	List<UPermission> findPermissionByUid(Long id);
}
