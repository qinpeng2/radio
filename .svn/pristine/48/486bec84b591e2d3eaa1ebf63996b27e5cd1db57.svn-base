package com.sl.tune.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sl.tune.entity.Channel;
import com.sl.tune.repository.ChannelRepository;
import com.sl.tune.request.ChannelRequest;
import com.sl.tune.service.ChannelService;
import com.sl.tune.utility.Result;
import com.sl.tune.utility.TuneException;
import com.sl.tune.utility.TuneProperties;

@Component("channelService")
public class ChannelServiceImpl implements ChannelService {
	
	private ChannelRepository channelRepository;
	
	private TuneProperties tuneProperties;
	
	/**
	 * validation for entry
	 * 
	 * @param channel
	 * @param modify
	 * @throws TuneException
	 */
	public void validate(Channel channel, boolean modify) throws TuneException {
		
		if (channel == null) {
			return;
		}
		
		if (channel.getId() == null || channel.getId().isEmpty()) {
			throw new TuneException(Result.createParamResult(Result.DENY_EMPTY, "Channel ID"));
		} 
		
		if (channel.getName() == null || channel.getName().isEmpty()) {
			throw new TuneException(Result.createParamResult(Result.DENY_EMPTY, "Channel Name"));
		} 
		
		if (!modify) {
			Channel existChannel = channelRepository.find(channel.getId());
			if (existChannel != null && !existChannel.getId().isEmpty()) {
				throw new TuneException(Result.createParamResult(Result.ALREAY_EXIST, "Channel", "ID", channel.getId()));
			}
		}
		
	}

	@Override
	public Channel add(ChannelRequest channelRequest) throws TuneException {
		
		Channel channel = new Channel();
		
		channel.setId(channelRequest.getId());
		channel.setName(channelRequest.getName());
		
		validate(channel, false);
		
		channelRepository.insert(channel);
		
		return channel;
	}

	@Override
	public Channel remove(String id, String password) throws TuneException {
		
		if (!password.equals(tuneProperties.getPassword())) {
			throw new TuneException(Result.UNAUTHORIZED);
		}
		
		Channel removedChannel = channelRepository.removeOne(id);
		
		if (removedChannel == null) {
			throw new TuneException(Result.NON_EXISTENT);
		}
		
		return removedChannel;
	}

	@Override
	public Channel find(String id) throws TuneException {
		
		Channel channel = channelRepository.find(id);
		
		if (channel == null) {
			throw new TuneException(Result.NON_EXISTENT);
		}
		
		return channel;
	}

	@Override
	public List<Channel> findAll() throws TuneException {
		
		 List<Channel> list = channelRepository.findAll();
		 
		 if (list == null || list.isEmpty()) {
			 throw new TuneException(Result.NON_EXISTENT);
		 }
		 
		 return list;
	}

	public ChannelRepository getChannelRepository() {
		return channelRepository;
	}

	public void setChannelRepository(ChannelRepository channelRepository) {
		this.channelRepository = channelRepository;
	}

	public TuneProperties getTuneProperties() {
		return tuneProperties;
	}

	public void setTuneProperties(TuneProperties tuneProperties) {
		this.tuneProperties = tuneProperties;
	}

	
}
