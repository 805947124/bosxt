package com.cn.action;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.biz.TblAdminBiz;
import com.cn.entity.TblAdmin;

@Controller
@RequestMapping("/admin")
public class TblAdminController {

	@Autowired
	private TblAdminBiz tblAdminBiz;
	
	@RequestMapping("login")
	public ModelAndView login(@ModelAttribute("name") String name,String password,HttpSession session){
		TblAdmin tblAdmin=tblAdminBiz.login(name, password);
		ModelAndView modelAndView = new ModelAndView();
		if(tblAdmin == null){
			modelAndView.addObject("errMsg", "用户名或密码错误");
			modelAndView.setViewName("login");
		}else{
			session.setAttribute("tblAdmin", tblAdmin);
			modelAndView.setViewName("redirect:../index.html");
		}
		
		return modelAndView;
	}
}
