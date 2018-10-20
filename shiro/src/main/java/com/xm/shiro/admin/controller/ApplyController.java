package com.xm.shiro.admin.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xm.shiro.admin.entity.EBIAEntity;
import com.xm.shiro.admin.service.EBIAService;


@RestController
@RequestMapping("/ebia")
public class ApplyController {
	
	@Autowired
	private EBIAService eBIAService;
	
	@RequestMapping("/list")
	public Object listBySxid() {
		List<EBIAEntity> ebias = eBIAService.list();
		JSONObject  json = new JSONObject (ebias); 
		System.out.println("预审人相关信息数据:"+json.toString()); 
		return ebias;
	}
}
