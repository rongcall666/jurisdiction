package com.jurisdiction.controller;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jurisdiction.entity.RoleAndResource;
import com.jurisdiction.service.RoleAndResourceService;

@RestController
@RequestMapping("/roleandresources")
public class RoleAndResourceController {

	@Autowired
	private RoleAndResourceService roleAndResourceService;

	@PostMapping
	public String addRoleAndResource(@RequestBody RoleAndResource roleAndResource) {
		return roleAndResourceService.addRoleAndResource(roleAndResource);
	}

	@Delete("/resource/{resourceid}/role/{roleid}")
	public String deleteRoleAndResource(@PathVariable Integer resourceid, @PathVariable Integer roleid) {
		return roleAndResourceService.deleteRoleAndResource(resourceid, roleid);
	}

}
