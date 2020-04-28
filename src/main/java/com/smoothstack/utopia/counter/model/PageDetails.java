package com.smoothstack.utopia.counter.model;

import java.util.List;

public class PageDetails<T> {
	
	private List<T> pageContent;
	
	private Integer totalRecords;
	
	public PageDetails(List<T> pageContent, Integer totalRecords) {
		this.pageContent = pageContent;
		this.totalRecords = totalRecords;
	}

	public List<T> getPageContent() {
		return pageContent;
	}

	public void setPageContent(List<T> pageContent) {
		this.pageContent = pageContent;
	}

	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

}
