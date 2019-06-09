package com.jurisdiction.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jurisdiction.entity.User;
@Repository
public interface UserMapper extends BaseMapper<User>{
	
	@Select(
			"select u.*,r.* from tab_user u "
			+ "left join tab_user_and_role t"
			+ "on u.userid = t.userid"
			+ "left join tab_role r"
			+ "on t.roleid = r.roleid"
			+ "where u.userid = #{userid}"
			)
	User getUserInfo(Integer userid);
	
}
