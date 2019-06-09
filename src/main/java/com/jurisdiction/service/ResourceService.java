package com.jurisdiction.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jurisdiction.entity.Resource;

public interface ResourceService {

	String addResource(Resource resource);

	Resource getResource(Integer resourceid);

	IPage<Resource> getAllResource(Integer currentPage);
}
