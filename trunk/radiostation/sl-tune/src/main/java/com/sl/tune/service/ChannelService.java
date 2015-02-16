package com.sl.tune.service;

import java.util.List;

import com.sl.tune.entity.Channel;
import com.sl.tune.request.ChannelRequest;
import com.sl.tune.utility.TuneException;

public interface ChannelService {
	
	Channel add(ChannelRequest channelRequest) throws TuneException;
	
	Channel remove(String id, String password) throws TuneException;
	
	Channel find(String id) throws TuneException;
	
	List<Channel> findAll() throws TuneException;
}
