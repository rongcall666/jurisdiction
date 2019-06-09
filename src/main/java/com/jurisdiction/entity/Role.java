/**
 * 
 */
package com.jurisdiction.entity;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jrong
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tab_role")
public class Role implements Serializable {
	private Integer roleid;
	private String rolename;
	private String roledepration;
	private Integer isuse;

	@TableField(exist = false)
	private List<Resource> resources;
}
