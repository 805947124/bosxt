package com.cn.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.entity.TblAdmin;
import com.cn.entity.TblAdminQuery;
import com.cn.entity.TblGoodsInfo;
import com.cn.entity.TblGoodsQuery;
import com.cn.mapper.TblGoodsInfoMapper;
import com.cn.util.PageBean;

@Service
public class TblGoodsBiz {
	
	@Autowired
	private TblGoodsInfoMapper tblGoodsMapper;

	public PageBean<TblGoodsInfo> viewByeConditionPageFun(TblGoodsQuery tblGoodsquery,
			Integer currPage, int limit) {
		int totalCount = tblGoodsMapper.selectCountByConditionFun(tblGoodsquery);

		PageBean<TblGoodsInfo> pageBean = new PageBean<TblGoodsInfo>(totalCount,
				currPage, limit);

		if (tblGoodsquery == null) {
			tblGoodsquery = new TblGoodsQuery();
		}

		tblGoodsquery.setPageSize(pageBean.getLimit());
		tblGoodsquery.setStartNum((pageBean.getCurrPage() - 1)
				* pageBean.getLimit());

		if (totalCount > 0) {
			pageBean.setList(tblGoodsMapper
					.selectByConditionPageFun(tblGoodsquery));
		}

		return pageBean;
	}

}
