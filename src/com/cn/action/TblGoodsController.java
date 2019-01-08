package com.cn.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.biz.TblGoodsBiz;
import com.cn.entity.TblAdmin;
import com.cn.entity.TblGoodsInfo;
import com.cn.util.PageBean;

@Controller
@RequestMapping("/goods")
public class TblGoodsController {
	
	@Autowired
	private TblGoodsBiz tblGoodsBiz;
	
	@RequestMapping("viewGoodsFun")
	public ModelAndView viewGoodsFun(Integer currPage){
		int limit = 3;
		
		PageBean<TblGoodsInfo> pageBean = tblGoodsBiz.viewByeConditionPageFun(null,currPage, limit);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pageBean",pageBean);
		modelAndView.setViewName("productlist");
		
		return modelAndView;
	}
}
