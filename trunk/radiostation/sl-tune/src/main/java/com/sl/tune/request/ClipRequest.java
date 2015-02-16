package com.sl.tune.request;

public class ClipRequest {
	
	// File Name
	private String fileName;
	
	// File Description
	private String description;
	
	// File Channel
	private String channel;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	
}
