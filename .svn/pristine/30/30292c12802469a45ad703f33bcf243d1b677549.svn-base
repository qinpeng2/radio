package com.sl.tune.repository;

import java.util.List;

import com.sl.tune.entity.Clip;
import com.sl.tune.entity.PageList;
import com.sl.tune.request.ClipSearchRequest;

public interface ClipRepository {
	
	void insert(Clip clipEntity);
	
	Clip removeOne(String id);

	Clip find(String id);
	
	List<Clip> findAll();
	
	PageList<Clip> find(ClipSearchRequest clipSearchRequest);
	
}
