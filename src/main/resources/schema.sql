create table issues (
id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
summary VARCHAR(256) NOT NULl,
description VARCHAR(256) NOT NULl
);

create table users (
userid int primary key,
username varchar(50) not null,
password varchar(500) not null
);

create table rolls (
rollid int primary key,
authority enum('ADMIN', 'USER') not null
);

create table usersrolls (
userid int not null,
rollid int not null,
foreign key (userid) references users(userid),
foreign key (rollid) references rolls(rollid)
);
