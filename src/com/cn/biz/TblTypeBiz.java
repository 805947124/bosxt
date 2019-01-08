package com.cn.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.entity.TblType;
import com.cn.entity.TblTypeQuery;
import com.cn.mapper.TblTypeMapper;
import com.cn.util.PageBean;

@Service
public class TblTypeBiz {
	
	@Autowired
	private TblTypeMapper tblTypeMapper;
	
	
	/**
	 * 查询当前页的信息
	 * 
	 * @param tblHouseQuery
	 * @param currPage
	 *            当前页
	 * @param limit
	 *            每页行数
	 * @return
	 */
	public PageBean<TblType> viewByeConditionPageFun(
			TblTypeQuery tblTypeQuery, Integer currPage, Integer limit) {
		int totalCount = tblTypeMapper.selectCountByConditionFun(tblTypeQuery);

		PageBean<TblType> pageBean = new PageBean<TblType>(totalCount,
				currPage, limit);

		if (tblTypeQuery == null) {
			tblTypeQuery = new TblTypeQuery();
		}

		tblTypeQuery.setPageSize(pageBean.getLimit());
		tblTypeQuery.setStartNum((pageBean.getCurrPage() - 1)
				* pageBean.getLimit());

		if (totalCount > 0) {
			pageBean.setList(tblTypeMapper
					.selectByConditionPageFun(tblTypeQuery));
		}

		return pageBean;

	}
}
