package com.xm.shiro.admin.controller;




import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.shiro.admin.entity.UUser;
import com.xm.shiro.admin.mapper2.UUserDao;



/**   
* @Title: CityRestController.java 
* @Package com.bamboo.springboot.controller 
* @Description: 用户登陆权限认证管理控制器
* @author bamboo  <a href="mailto:zjcjava@163.com?subject=hello,bamboo&body=Dear Bamboo:%0d%0a描述你的问题：">Bamboo</a>   
* @date 2017年4月21日 下午5:51:36 
* @version V1.0   
*/
@Controller
@RequestMapping("/uu")
public class AdminController2 {
	
	@Autowired
	private UUserDao uUserDao;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
    public Object index() {
		UUser hasUser = uUserDao.findByName("admin");
        return hasUser;
    }
	
    @RequestMapping("/useradd")
	@RequiresRoles("admin")
	public String useradd(){
		
		return "useradd";
	}
	@RequestMapping("/userdel")
	@RequiresPermissions("userInfo:del")
	public String userdel(){
		
		return "userdel.html";
	}
	@RequestMapping("/userview")
	@RequiresPermissions("userInfo:view")
	public String userview(){
		
		return "userview";
	}
	@RequestMapping("/userupdate")
	public String userupdate(){
		
		return "userupdate";
	}
	
	@RequestMapping("/thyshiro")
	public String thyshiro(){
		
		return "thyShiro";
	}

}

