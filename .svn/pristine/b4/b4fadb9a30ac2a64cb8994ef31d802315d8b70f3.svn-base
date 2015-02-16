package com.sl.tune.repository.impl;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.sl.tune.entity.Channel;
import com.sl.tune.repository.ChannelRepository;

@Component("channelRepository")
public class ChannelRepositoryImpl implements ChannelRepository {
	
	private MongoTemplate mongoTemplate;

	@Override
	public void insert(Channel channel) {
		mongoTemplate.insert(channel);
	}

	@Override
	public Channel find(String id) {
		return mongoTemplate.findById(id, Channel.class);
	}

	@Override
	public Channel removeOne(String id) {
		
		Channel channel = find(id);
		
		mongoTemplate.remove(channel); 
		
		return channel;
	}

	@Override
	public List<Channel> findAll() {
		List<Channel> list = mongoTemplate.findAll(Channel.class);
		
		return list;
	}
	

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
}
