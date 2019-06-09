package com.jurisdiction.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jurisdiction.entity.Role;
import com.jurisdiction.entity.User;
@Repository
public interface RoleMapper extends BaseMapper<Role> {

	@Select(
			"select r.*,c.* from tab_role r "
			+ "left join tab_role_and_resource t"
			+ "on r.roleid = t.roleid"
			+ "left join tab_resource c"
			+ "on t.resourceid = c.resourceid"
			+ "where r.roleid = #{roleid}"
			)
	Role getRoleInfo(Integer roleid);
	
}
