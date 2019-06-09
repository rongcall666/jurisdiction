package com.jurisdiction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jurisdiction.entity.Message;
import com.jurisdiction.mapper.MessageMapper;
import com.jurisdiction.service.MessageService;
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageMapper messageMapper;

	@Override
	public String addMessage(Message message) {
		int result = messageMapper.insert(message);
		if (result == 1) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@Override
	public String updateMessageRead(Integer messageid) {

		Message message = messageMapper.selectById(messageid);
		message.setIsread(1);

		messageMapper.updateById(message);
		return "SUCCESS";
	}

	@Override
	public Message getMessage(Integer messageid) {
		Message message = messageMapper.selectById(messageid);
		return message;
	}

	@Override
	public IPage<Message> getMessageByMe(Integer userid, Long currentPage) {
		IPage<Message> page = new Page<>(currentPage, 10);
		QueryWrapper<Message> queryWrapper = new QueryWrapper<Message>();
		queryWrapper.eq("userid", userid);
		return messageMapper.selectPage(page, queryWrapper);
	}

}
