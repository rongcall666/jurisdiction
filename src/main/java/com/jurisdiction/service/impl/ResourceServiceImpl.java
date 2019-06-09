package com.jurisdiction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jurisdiction.entity.Message;
import com.jurisdiction.entity.Resource;
import com.jurisdiction.mapper.ResourceMapper;
import com.jurisdiction.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	private ResourceMapper resourceMapper;

	@Override
	public String addResource(Resource resource) {
		int result = resourceMapper.insert(resource);
		if (result == 1) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@Override
	public Resource getResource(Integer resourceid) {
		return resourceMapper.selectById(resourceid);
	}

	@Override
	public IPage<Resource> getAllResource(Integer currentPage) {
		IPage<Resource> page = new Page<>(currentPage, 10);
		QueryWrapper<Resource> queryWrapper = new QueryWrapper<Resource>();
		return resourceMapper.selectPage(page, queryWrapper);
	}

}
