drop table if exists user_info;
create table user_info(
	id int primary key auto_increment,
	name varchar(16),
	roleid int
);

insert into user_info(name,roleid) values("cay",1);
insert into user_info(name,roleid) values("babalu",2);
insert into user_info(name,roleid) values("luoluoba",3);


drop table if exists role;
create table role(
	id int primary key,
	rolename varchar(8),
	level int
);

insert into role(id,rolename,level) values(1,"LEVEL1",1);
insert into role(id,rolename,level) values(2,"LEVEL2",2);
insert into role(id,rolename,level) values(3,"LEVEL3",3);
insert into role(id,rolename,level) values(4,"LEVEL4",4);
