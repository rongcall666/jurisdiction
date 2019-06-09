package com.jurisdiction.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jurisdiction.entity.Role;

public interface RoleService {

	String addRole(Role role);

	Role getRole(Integer roleid);

	IPage<Role> getAll(Integer currentPage);

}
