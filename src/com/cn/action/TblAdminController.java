package com.cn.action;



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
	public ModelAndView login(@ModelAttribute("name") String aname,String apwd){
		TblAdmin tblAdmin=tblAdminBiz.login(aname, apwd);
		ModelAndView modelAndView = new ModelAndView();
		if(tblAdmin == null){
			modelAndView.addObject("errMsg", "用户名或密码错误");
			modelAndView.setViewName("login");
		}else{
			
		}
		
		return modelAndView;
	}

}
