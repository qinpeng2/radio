package com.sl.tune.request;

public class ClipSearchRequest {
	
	private Integer page;
	
	private Integer perPage;
	
	private String channel;
	
	public ClipSearchRequest() {}
	
	public ClipSearchRequest(Integer page, Integer perPage, String channel) {
		this.page = page;
		this.perPage = perPage;
		this.channel = channel;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPerPage() {
		return perPage;
	}

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
}
