/*package com.xm.shiro.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.shiro.admin.entity.ApplyEntity;
import com.xm.shiro.admin.mapper1.ApplyDao;
import com.xm.shiro.admin.service.ApplyService;

@Service("ApplyService")
public class ApplyServiceImp implements ApplyService {
	
	@Autowired
	private ApplyDao applydao;

	@Override
	public List<ApplyEntity> queryListByDeptId(String deptid) {
		return applydao.queryListByDeptId(deptid);
	}

	@Override
	public void update(ApplyEntity applyEntity) {
		// TODO Auto-generated method stub
		applydao.update(applyEntity);
	}

	@Override
	public List<ApplyEntity> queryObject(String sxid) {
		return applydao.queryObject(sxid);
	}

	@Override
	public int maxId() {
		// TODO Auto-generated method stub
		return applydao.maxId();
	}

	@Override
	public int insert(ApplyEntity applyEntity) {
		// TODO Auto-generated method stub
		return applydao.insert(applyEntity);
	}

}
*/