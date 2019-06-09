package com.jurisdiction.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jurisdiction.entity.Message;

public interface MessageService {

	/**
	 * 新增一条信息
	 * 
	 * @param message
	 * @return
	 */
	String addMessage(Message message);

	/**
	 * 修改消息的状态
	 * 
	 * @param messageid
	 * @return
	 */
	String updateMessageRead(Integer messageid);

	/**
	 * 查看信息
	 * 
	 * @param messageid
	 * @return
	 */
	Message getMessage(Integer messageid);

	/**
	 * 查看有关自己的信息
	 * 
	 * @param userid
	 * @return
	 */
	IPage<Message> getMessageByMe(Integer userid, Long currentPage);

}
