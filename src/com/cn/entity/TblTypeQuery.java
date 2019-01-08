package com.cn.entity;

public class TblTypeQuery extends TblType {
		//分页查询时用
		private Integer startNum;				//从第几行开始查询
		private Integer pageSize;				//每页行数,代表查询多少行
		
		
		public Integer getStartNum() {
			return startNum;
		}
		public void setStartNum(Integer startNum) {
			this.startNum = startNum;
		}
		public Integer getPageSize() {
			return pageSize;
		}
		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
		
		
}
