package com.cn.entity;

public class TblTypeQuery extends TblType {
		//��ҳ��ѯʱ��
		private Integer startNum;				//�ӵڼ��п�ʼ��ѯ
		private Integer pageSize;				//ÿҳ����,�����ѯ������
		
		
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
