package com.xm.shiro.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.EBIAEntity;
import com.xm.shiro.admin.mapper1.EBIADao;
import com.xm.shiro.admin.service.EBIAService;

@Service("EBIAService")
public class EBIAServiceImpl implements EBIAService {

	@Autowired
	private EBIADao eBIADao;
	
	@Override
	public List<EBIAEntity> list() {
		return eBIADao.list();
	}

}
