package com.cn.mapper;

import java.util.List;

import com.cn.entity.TblImage;
import com.cn.entity.TblImageQuery;

public interface TblImageMapper {

	int selectCountByConditionFun(TblImageQuery tblImageQuery);

	List<TblImage> selectByConditionPageFun(TblImageQuery tblImageQuery);

}
