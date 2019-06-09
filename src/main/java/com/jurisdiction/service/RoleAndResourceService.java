package com.jurisdiction.service;

import com.jurisdiction.entity.RoleAndResource;

public interface RoleAndResourceService {
	String addRoleAndResource(RoleAndResource roleAndResource);

	String deleteRoleAndResource(Integer resourceid, Integer roleid);

}
