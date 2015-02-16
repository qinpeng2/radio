package com.sl.tune.entity;

public class Paginator {
	// 第几页
	private int page;
	// 每页显示数量
	private int perPage;
	// 总数
	private long total;
	// 总页数
	private int totalPage;
	
	public Paginator() {}
	
	public Paginator(int page, int perPage, long total, int totalPage) {
		this.page = page;
		this.perPage = perPage;
		this.total = total;
		this.totalPage = totalPage;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPerPage() {
		return perPage;
	}
	
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	
}
