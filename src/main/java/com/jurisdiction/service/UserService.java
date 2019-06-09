package com.jurisdiction.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jurisdiction.entity.User;


public interface UserService {

	/**
	 * 登录
	 * 
	 * @param user
	 * @return
	 */
	String login(User user);

	/**
	 * 修改密码
	 * 
	 * @param user
	 * @return
	 */
	String updateUserpassword(User user);

	/**
	 * 修改昵称
	 * 
	 * @param user
	 * @return
	 */
	String updateUsername(User user);

	/**
	 * 冻结账号
	 * 
	 * @param userid
	 * @return
	 */
	String updateIsuse(Integer userid);

	/**
	 * 查看用户信息
	 * 
	 * @param userid
	 * @return
	 */
	User getInfo(Integer userid);

	/**
	 * 分页查看用户信息
	 * 
	 * @return
	 */
	IPage getListInfo(Long currentPage);
}
