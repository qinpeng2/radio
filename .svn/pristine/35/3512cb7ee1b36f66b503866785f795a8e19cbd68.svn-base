package com.sl.tune.service;

import javax.servlet.ServletContext;

import org.springframework.web.multipart.MultipartFile;

import com.sl.tune.entity.Clip;
import com.sl.tune.entity.PageList;
import com.sl.tune.request.ClipRequest;
import com.sl.tune.request.ClipSearchRequest;
import com.sl.tune.utility.TuneException;

public interface ClipService {
	
	Clip upload(ServletContext servletContext, MultipartFile file, ClipRequest clipRequest) throws TuneException;
	
	Clip deleteClip(String id, String password) throws TuneException;
	
	Clip find(String id) throws TuneException;
	
	PageList<Clip> find(ClipSearchRequest clipSearchRequest) throws TuneException;
}
