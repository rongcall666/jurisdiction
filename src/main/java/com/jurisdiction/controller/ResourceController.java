package com.jurisdiction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jurisdiction.entity.Resource;
import com.jurisdiction.service.ResourceService;

@RestController
@RequestMapping("/resources")
public class ResourceController {

	@Autowired
	private ResourceService resourceService;

	@PostMapping
	public String addResource(@RequestBody Resource resource) {
		return resourceService.addResource(resource);
	}

	@GetMapping("{resourceid}")
	public Resource getResource(@PathVariable Integer resourceid) {
		return resourceService.getResource(resourceid);
	}

	@GetMapping("/all/page/{currentPage}")
	public IPage<Resource> getAllResource(@PathVariable Integer currentPage) {
		return resourceService.getAllResource(currentPage);
	}
}
