package com.jurisdiction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jurisdiction.entity.Message;
import com.jurisdiction.service.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {

	@Autowired
	private MessageService messageService;

	@PostMapping
	public String addMessage(@RequestBody Message message) {
		return messageService.addMessage(message);
	}

	@PutMapping("/updatemessageread/{messageid}")
	public String updateMessageRead(@PathVariable Integer messageid) {
		return messageService.updateMessageRead(messageid);
	}

	@GetMapping("/{messageid}")
	public Message getMessage(@PathVariable Integer messageid) {
		return messageService.getMessage(messageid);
	}

	@GetMapping("/user/{userid}/page/{currentPage}")
	public IPage<Message> getMessageByMe(@PathVariable Integer userid, @PathVariable Long currentPage) {
		return messageService.getMessageByMe(userid, currentPage);
	}
}
