package com.xm.shiro.admin.mapper1;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xm.shiro.admin.entity.EBIAEntity;

@Mapper
public interface EBIADao {
	List<EBIAEntity> list();
}
