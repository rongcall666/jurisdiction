package com.jurisdiction.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jurisdiction.entity.RoleAndResource;
import com.jurisdiction.mapper.RoleAndResourceMapper;
import com.jurisdiction.service.RoleAndResourceService;

@Service
public class RoleAndResourceServiceImpl implements RoleAndResourceService {

	@Autowired
	private RoleAndResourceMapper roleAndResourceMapper;

	@Override
	public String addRoleAndResource(RoleAndResource roleAndResource) {
		int result = roleAndResourceMapper.insert(roleAndResource);
		if (result == 1) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@Override
	public String deleteRoleAndResource(Integer resourceid, Integer roleid) {
		QueryWrapper<RoleAndResource> queryWrapper = new QueryWrapper<>();
		Map<String, Object> map = new HashMap<>();
		map.put("resourceid", resourceid);
		map.put("roleid", roleid);
		queryWrapper.allEq(map);
		RoleAndResource roleAndResource = roleAndResourceMapper.selectOne(queryWrapper);
		if (roleAndResource != null) {
			roleAndResourceMapper.deleteById(roleAndResource.getId());
			return "SUCCESS";
		}
		return "ERROR";
	}

}
