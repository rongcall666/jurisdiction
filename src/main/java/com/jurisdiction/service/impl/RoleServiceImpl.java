package com.jurisdiction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jurisdiction.entity.Resource;
import com.jurisdiction.entity.Role;
import com.jurisdiction.mapper.RoleMapper;
import com.jurisdiction.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	public String addRole(Role role) {
		int result = roleMapper.insert(role);
		if (result == 1) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@Override
	public Role getRole(Integer roleid) {
		return roleMapper.selectById(roleid);
	}

	@Override
	public IPage<Role> getAll(Integer currentPage) {
		IPage<Role> page = new Page<>(currentPage, 10);
		QueryWrapper<Role> queryWrapper = new QueryWrapper<Role>();
		return roleMapper.selectPage(page, queryWrapper);
	}

}
