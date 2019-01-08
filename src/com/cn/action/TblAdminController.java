package com.cn.action;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.cn.biz.TblAdminBiz;
import com.cn.entity.TblAdmin;
import com.cn.entity.TblType;
import com.cn.util.PageBean;

@Controller
@RequestMapping("/admin")
public class TblAdminController {

	@Autowired
	private TblAdminBiz tblAdminBiz;
	
	@RequestMapping("login")
	public ModelAndView login(@ModelAttribute("aname") String aname,String apwd,HttpSession session){
		TblAdmin tblAdmin=tblAdminBiz.login(aname, apwd);
		ModelAndView modelAndView = new ModelAndView();
		if(tblAdmin == null){
			modelAndView.addObject("errMsg", "用户名或密码错误");
			modelAndView.setViewName("login");
		}else{
			session.setAttribute("tblAdmin", tblAdmin);
			modelAndView.setViewName("redirect:../index.jsp");
		}
		
		return modelAndView;
	}
	
	
	@RequestMapping("viewAdminFun")
	public ModelAndView viewTypeFun(Integer currPage){
		int limit = 2;
		
		PageBean<TblAdmin> pageBean = tblAdminBiz.viewByeConditionPageFun(null,currPage, limit);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pageBean",pageBean);
		modelAndView.setViewName("adminlist");
		
		return modelAndView;
	}
	
	
	@RequestMapping("/adminadd")
	public String addFun(TblAdmin tblAdmin,HttpSession session,Model model){
		TblAdmin admin = (TblAdmin)session.getAttribute("aname");
		
		
		boolean flag = tblAdminBiz.addFun(tblAdmin);
		
		if(flag){
			return "redirect:/admin/viewAdminFun";
		}else{
			model.addAttribute("errMsg","保存失败");
			return "/adminadd";
		}
	}

}
