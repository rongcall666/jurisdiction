package com.jurisdiction.service;

import com.jurisdiction.entity.UserAndRole;

public interface UserAndRoleService {
	String addUserAndRole(UserAndRole userAndRole);

	String deleteUserAndRole(Integer userid, Integer roleid);

}
