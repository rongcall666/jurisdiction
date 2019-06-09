package com.jurisdiction.controller;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jurisdiction.entity.UserAndRole;
import com.jurisdiction.service.UserAndRoleService;

@RestController
@RequestMapping("/userandroles")
public class UserAndRoleController {

	@Autowired
	private UserAndRoleService userAndRoleService;

	@PostMapping
	public String addUserAndRole(@RequestBody UserAndRole userAndRole) {
		return userAndRoleService.addUserAndRole(userAndRole);
	}

	@Delete("/user/{userid}/role/{roleid}")
	public String deleteUserAndRole(@PathVariable Integer userid, @PathVariable Integer roleid) {
		return userAndRoleService.deleteUserAndRole(userid, roleid);
	}

}
