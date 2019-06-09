package com.jurisdiction.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jurisdiction.entity.RoleAndResource;
import com.jurisdiction.entity.UserAndRole;
import com.jurisdiction.mapper.UserAndRoleMapper;
import com.jurisdiction.service.UserAndRoleService;

@Service
public class UserAndRoleServiceImpl implements UserAndRoleService {

	@Autowired
	private UserAndRoleMapper userAndRoleMapper;

	@Override
	public String addUserAndRole(UserAndRole userAndRole) {
		int result = userAndRoleMapper.insert(userAndRole);
		if (result == 1) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@Override
	public String deleteUserAndRole(Integer userid, Integer roleid) {
		QueryWrapper<UserAndRole> queryWrapper = new QueryWrapper<>();
		Map<String, Object> map = new HashMap<>();
		map.put("userid", userid);
		map.put("roleid", roleid);
		queryWrapper.allEq(map);
		UserAndRole userAndRole = userAndRoleMapper.selectOne(queryWrapper);
		if (userAndRole != null) {
			userAndRoleMapper.deleteById(userAndRole.getId());
			return "SUCCESS";
		}
		return "ERROR";
	}

}
