package com.sl.tune.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * A servlet filter for processing the HTTP response header
 * 	The main purpose for this is going to handle the cross domain HTTP request
 * 
 * @author qinpeng
 *
 */
public class AccessKeyInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Accept, X-Requested-With");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");  
		response.setHeader("Access-Control-Max-Age", "30"); 
		
		return true;
	}
	
}