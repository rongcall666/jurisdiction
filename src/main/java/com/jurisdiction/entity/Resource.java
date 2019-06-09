package com.jurisdiction.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tab_resource")
public class Resource implements Serializable{
	private Integer resourceid;
	private String resourcename;
	private String resourcedepration;
	private Integer isuse;
}
