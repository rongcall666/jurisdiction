package com.jurisdiction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jurisdiction.entity.User;
import com.jurisdiction.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public String login(@RequestBody User user) {
		return userService.login(user);
	}

	@PutMapping("/updateUserpassword")
	public String updateUserpassword(@RequestBody User user) {
		return userService.updateUserpassword(user);
	}

	@PutMapping("/updateUserpassword")
	public String updateUsername(@RequestBody User user) {
		return userService.updateUsername(user);
	}

	@GetMapping("/updateIsuse/{userid}")
	public String updateIsuse(@PathVariable Integer userid) {
		return userService.updateIsuse(userid);
	}

	@GetMapping("/{userid}")
	public User getInfo(@PathVariable Integer userid) {
		return userService.getInfo(userid);
	}

	@GetMapping
	public IPage getListInfo(@PathVariable Long currentPage) {
		return userService.getListInfo(currentPage);
	}
}
