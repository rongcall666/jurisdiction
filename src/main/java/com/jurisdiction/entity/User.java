package com.jurisdiction.entity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tab_user")
public class User implements Serializable {
	private Integer userid;
	private String userpassword;
	private String username;
	private Integer isuse;
	@TableField(exist = false)
	private List<Role> roles;
}
