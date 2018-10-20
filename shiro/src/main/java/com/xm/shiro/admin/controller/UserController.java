package com.xm.shiro.admin.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/useradd")
	@RequiresRoles("user")
	public String useradd(){
		
		return "useradd";
	}
	@RequestMapping("/userdel")
	@RequiresPermissions("userInfo:del")
	public String userdel(){
		
		return "userdel";
	}
	@RequestMapping("/userview")
	@RequiresPermissions("userInfo:view")
	public String userview(){
		
		return "userview";
	}
	@RequestMapping("/userupdate")
	@RequiresRoles("admin")
	public String userupdate(){
		
		return "userupdate";
	}
}
