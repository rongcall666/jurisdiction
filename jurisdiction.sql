create database jurisdiction;

use jurisdiction;

create table tab_user(
	userid int primary key auto_increment,
	userpassword char(20) not null,
	username char(20) not null,
	isuse tinyint default '0'
)engine innodb character set utf8;

create table tab_user_and_role(
	id int primary key auto_increment,
	userid int not null,
	roleid int not null
)engine innodb character set utf8;

create table tab_role(
	roleid int primary key auto_increment,
	rolename char(20) not null,
	roledepration char(50) not null,
	isuse tinyint default '0'
)engine innodb character set utf8;

create table tab_resource(
	resourceid int primary key auto_increment,
	resourcename char(20) not null,
	resourcedepration char(50) not null,
	isuse tinyint default '0'
)engine innodb character set utf8;

create table tab_role_and_resource(
	id int primary key auto_increment,
	roleid int not null,
	resourceid int not null
)engine innodb character set utf8;

drop table tab_message;
create table tab_message(
	messageid int primary key auto_increment,
	messagecontext char(50) not null,
	userid int not null,
	isread tinyint default '0'
)engine innodb character set utf8;	