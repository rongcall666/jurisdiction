package com.jurisdiction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jurisdiction.entity.Role;
import com.jurisdiction.service.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@PostMapping
	public String addRole(@RequestBody Role role) {
		return roleService.addRole(role);
	}

	@GetMapping("/{roleid}")
	public Role getRole(@PathVariable Integer roleid) {
		return roleService.getRole(roleid);
	}

	@GetMapping("/all/currentPage/{currentPage}")
	IPage<Role> getAll(@PathVariable Integer currentPage) {
		return roleService.getAll(currentPage);
	}
}
