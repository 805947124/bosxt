package com.cn.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.entity.TblAdmin;
import com.cn.entity.TblAdminQuery;
import com.cn.entity.TblType;
import com.cn.entity.TblTypeQuery;
import com.cn.mapper.TblAdminMapper;
import com.cn.util.PageBean;

@Service
public class TblAdminBiz {

	@Autowired
	private TblAdminMapper tblAdminMapper;
	
	public boolean viewByName(String name){
		TblAdmin tblAdmin = tblAdminMapper.selectByNameFun(name);
		if(tblAdmin==null)
			return false;
		else
			return true;
	}
	
	/**
	 * 登录
	 * @param name 用户名
	 * @param password 密码
	 * @return 用户信息 null，用户名或密码错误
	 */
	public TblAdmin login(String name, String password) {
		TblAdmin tblAdmin = tblAdminMapper.selectByNameFun(name);

		if (tblAdmin != null && tblAdmin.getApwd().equals(password)) {
			return tblAdmin;
		} else {
			return null;
		}
	}
	
	
	/**
	 * 查询当前页的信息
	 * 
	 * @param tblAdminQuery
	 * @param currPage
	 *            当前页
	 * @param limit
	 *            每页行数
	 * @return
	 */
	public PageBean<TblAdmin> viewByeConditionPageFun(
			TblAdminQuery tblAdminQuery, Integer currPage, Integer limit) {
		int totalCount = tblAdminMapper.selectCountByConditionFun(tblAdminQuery);

		PageBean<TblAdmin> pageBean = new PageBean<TblAdmin>(totalCount,
				currPage, limit);

		if (tblAdminQuery == null) {
			tblAdminQuery = new TblAdminQuery();
		}

		tblAdminQuery.setPageSize(pageBean.getLimit());
		tblAdminQuery.setStartNum((pageBean.getCurrPage() - 1)
				* pageBean.getLimit());

		if (totalCount > 0) {
			pageBean.setList(tblAdminMapper
					.selectByConditionPageFun(tblAdminQuery));
		}

		return pageBean;

	}

	public boolean addFun(TblAdmin tblAdmin) {
		try {
			tblAdminMapper.insertFun(tblAdmin);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
