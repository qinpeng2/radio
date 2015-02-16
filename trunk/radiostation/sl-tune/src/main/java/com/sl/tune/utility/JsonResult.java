package com.sl.tune.utility;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.GsonBuilder;

public class JsonResult {
	
	public static final String STR_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	private Result result;
	
	private Object data;
	
	private String callBack;
	
	public JsonResult(Result result) {
		this.result = result;
	}
	
	public JsonResult(HttpServletRequest request, Object data) {
		this.result = Result.SUCCESS;
		this.data = data;
		String strCallback = request.getParameter("callback");
		if (strCallback != null && !strCallback.isEmpty()) {
			callBack = strCallback;
		}
	}
	
	public JsonResult(Result result, Object data) {
		this.result = result;
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setDateFormat(STR_DATE_FORMAT);
		
		String json = gsonBuilder.create().toJson(this);
		
		if (callBack != null && !callBack.isEmpty()) {
			return callBack + "(" + json + ")";
		} else {
			return json;
		}
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
