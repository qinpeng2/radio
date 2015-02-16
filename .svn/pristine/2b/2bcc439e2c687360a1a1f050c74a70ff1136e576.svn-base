package com.sl.tune.entity;

import java.util.List;

public class PageList<T> {
	
	private Paginator paginator;
	
	private List<T> list;
	
	public PageList() {
		
	}
	
	public PageList(List<T> list, Paginator paginator) {
		this.setList(list);
		this.setPaginator(paginator);
	}
	
	public void add(T t) {
		list.add(t);
	}

	public Paginator getPaginator() {
		return paginator;
	}

	public void setPaginator(Paginator paginator) {
		this.paginator = paginator;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
