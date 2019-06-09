package com.jurisdiction.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tab_message")
public class Message implements Serializable{
	private Integer messageid;
	private String messageename;
	private Integer userid;
	private Integer isread;
}
