package com.cn.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.biz.TblUserBiz;
import com.cn.entity.TblAdmin;
import com.cn.entity.TblUser;
import com.cn.util.PageBean;

@Controller
@RequestMapping("/user")
public class TblUserController {

	@Autowired
	private TblUserBiz tblUserBiz;
	
	@RequestMapping("viewUserFun")
	public ModelAndView viewTypeFun(Integer currPage){
		int limit = 2;
		
		PageBean<TblUser> pageBean = tblUserBiz.viewByeConditionPageFun(null,currPage, limit);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pageBean",pageBean);
		modelAndView.setViewName("userlist");
		
		return modelAndView;
	}

}
