package com.cn.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.biz.TblTypeBiz;
import com.cn.entity.TblType;
import com.cn.util.PageBean;

@Controller
@RequestMapping("/type")
public class TblTypeController {
	
	@Autowired 
	private TblTypeBiz tblTypeBiz;
	
	@RequestMapping("viewTypeFun")
	public ModelAndView viewTypeFun(Integer currPage){
		int limit = 2;
		
		PageBean<TblType> pageBean = tblTypeBiz.viewByeConditionPageFun(null,currPage, limit);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pageBean",pageBean);
		modelAndView.setViewName("manager");
		
		return modelAndView;
	}
}
