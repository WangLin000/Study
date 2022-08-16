create table book (
	bid int primary key auto_increment,
	bname varchar(50) not null check(bname != ''),
	author varchar(50) not null check(author != ''),
	price int not null,
	press varchar(50)
);

create table sys_user (
	uid int primary key auto_increment,
	username varchar(30) unique not null check(username != ''),
	password varchar(60) not null check(password != ''),
	userdesc varchar(200)
);


insert into book values(null, '数据结构', '李刚', 100, '数据在计算机中结构');
insert into book values(null, '软件设计', '王五', 200, '软件设计与开发');
insert into book values(null, 'javaweb开发', '张三', 195, '网页后台设计');
insert into book values(null, '前端开发', '李四', 123, '网页设计与开发');

insert into sys_user values(null, 'spiderman', '123456', '一个蜘蛛侠客的账号');

drop table book;
drop table sys_user;

