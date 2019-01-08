package com.cn.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cn.entity.TblUser;
import com.cn.entity.TblUserQuery;
import com.cn.mapper.TblUserMapper;
import com.cn.util.PageBean;

@Service
public class TblUserBiz {
	
	@Autowired
	private TblUserMapper tblUserMapper;

	public PageBean<TblUser> viewByeConditionPageFun(TblUserQuery tblUserQuery,
			Integer currPage, int limit) {
		int totalCount = tblUserMapper.selectCountByConditionFun(tblUserQuery);

		PageBean<TblUser> pageBean = new PageBean<TblUser>(totalCount,
				currPage, limit);

		if (tblUserQuery == null) {
			tblUserQuery = new TblUserQuery();
		}

		tblUserQuery.setPageSize(pageBean.getLimit());
		tblUserQuery.setStartNum((pageBean.getCurrPage() - 1)
				* pageBean.getLimit());

		if (totalCount > 0) {
			pageBean.setList(tblUserMapper
					.selectByConditionPageFun(tblUserQuery));
		}

		return pageBean;
	}

}
