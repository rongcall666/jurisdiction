package com.jurisdiction.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tab_user_and_role")
public class RoleAndResource implements Serializable {
	private Integer id;
	private Integer roleid;
	private Integer resourceid;
}
