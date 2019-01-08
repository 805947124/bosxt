package com.cn.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cn.entity.TblImage;
import com.cn.entity.TblImageQuery;
import com.cn.mapper.TblImageMapper;
import com.cn.util.PageBean;

@Service
public class TblImageBiz {
	
	@Autowired
	private TblImageMapper tblImageMapper;

	public PageBean<TblImage> viewByeConditionPageFun(TblImageQuery tblImageQuery,
			Integer currPage, int limit) {
		int totalCount = tblImageMapper.selectCountByConditionFun(tblImageQuery);

		PageBean<TblImage> pageBean = new PageBean<TblImage>(totalCount,
				currPage, limit);

		if (tblImageQuery == null) {
			tblImageQuery = new TblImageQuery();
		}

		tblImageQuery.setPageSize(pageBean.getLimit());
		tblImageQuery.setStartNum((pageBean.getCurrPage() - 1)
				* pageBean.getLimit());

		if (totalCount > 0) {
			pageBean.setList(tblImageMapper
					.selectByConditionPageFun(tblImageQuery));
		}

		return pageBean;
	}

	
	
}
