package com.sl.tune.controller.clip;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sl.tune.entity.Channel;
import com.sl.tune.request.ChannelRequest;
import com.sl.tune.service.ChannelService;
import com.sl.tune.utility.JsonResult;
import com.sl.tune.utility.TuneException;

@Controller
public class ChannelController {

	private ChannelService channelService;

	@RequestMapping(value = "/channels", method = RequestMethod.GET)
	@ResponseBody
	public String list(HttpServletRequest req) {

		List<Channel> channels = null;
		try {
			channels = channelService.findAll();
		} catch (TuneException e) {
			return new JsonResult(e.getResult()).toString();
		}

		return new JsonResult(req, channels).toString();
	}

	@RequestMapping(value = "/channel", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String add(HttpServletRequest req, ChannelRequest channelRequest) {

		Channel channel = null;

		try {
			channel = channelService.add(channelRequest);
		} catch (TuneException e) {
			return new JsonResult(e.getResult()).toString();
		}

		return new JsonResult(req, channel).toString();
	}

	@RequestMapping(value = "/channel/{id}", method = { RequestMethod.GET })
	@ResponseBody
	public String one(HttpServletRequest req, @PathVariable String id) {

		Channel channel = null;

		try {
			channel = channelService.find(id);
		} catch (TuneException e) {
			return new JsonResult(e.getResult()).toString();
		}

		return new JsonResult(req, channel).toString();
	}

	@RequestMapping(value = "/channel/{id}/remove/{password}", method = { RequestMethod.GET, RequestMethod.DELETE })
	@ResponseBody
	public String remove(HttpServletRequest req, @PathVariable String id, @PathVariable String password) {

		Channel channel = null;

		try {
			channel = channelService.remove(id, password);
		} catch (TuneException e) {
			return new JsonResult(e.getResult()).toString();
		}

		return new JsonResult(req, channel).toString();
	}

	public ChannelService getChannelService() {
		return channelService;
	}

	public void setChannelService(ChannelService channelService) {
		this.channelService = channelService;
	}

}
