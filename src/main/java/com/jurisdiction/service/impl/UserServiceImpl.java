package com.jurisdiction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jurisdiction.entity.User;
import com.jurisdiction.mapper.UserMapper;
import com.jurisdiction.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public String login(User user) {
		User user2 = userMapper.selectById(user.getUserid());
		if (user.getUserpassword().equals(user2.getUserpassword())) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@Override
	public String updateUserpassword(User user) {
		User user2 = userMapper.selectById(user.getUserid());
		if (user2 != null) {
			user2.setUserpassword(user.getUserpassword());
			userMapper.updateById(user2);
			return "SUCCESS";
		}
		return "ERROR";
	}

	@Override
	public String updateUsername(User user) {
		User user2 = userMapper.selectById(user.getUserid());
		if (user2 != null) {
			user2.setUsername(user.getUsername());
			userMapper.updateById(user2);
			return "SUCCESS";
		}
		return "ERROR";
	}

	@Override
	public String updateIsuse(Integer userid) {
		User user = userMapper.selectById(userid);
		if (user != null) {
			user.setIsuse(1);
			userMapper.updateById(user);
			return "SUCCESS";
		}
		return "ERROR";
	}

	@Override
	public User getInfo(Integer userid) {
		User user = userMapper.selectById(userid);
		if (user != null) {
			return userMapper.getUserInfo(userid);
		}
		return null;
	}

	@Override
	public IPage getListInfo(Long currentPage) {
		Page<User> page = new Page<>(currentPage, 10);
		QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
		return userMapper.selectPage(page, queryWrapper);
	}

}
