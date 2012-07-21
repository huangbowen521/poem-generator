create table sentence(id int not null auto_increment primary key, content varchar(32));
create table poem(id int not null auto_increment primary key, qi varchar(32), cheng varchar(32), zhuan varchar(32), he varchar(32));
insert into poem (qi, cheng, zhuan, he) VALUES ("寥落古行宮", "宮花寂寞紅", "白頭宮女在", "閒坐說玄宗");
insert into sentence(content) VALUES ("白日依山尽");
CREATE TABLE `users` (
  `USER_ID` INT(10) UNSIGNED NOT NULL,
  `USERNAME` VARCHAR(45) NOT NULL,
  `PASSWORD` VARCHAR(45) NOT NULL,
  `ENABLED` tinyint(1) NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_roles` (
  `USER_ROLE_ID` INT(10) UNSIGNED NOT NULL,
  `USER_ID` INT(10) UNSIGNED NOT NULL,
  `AUTHORITY` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`USER_ROLE_ID`),
  KEY `FK_user_roles` (`USER_ID`),
  CONSTRAINT `FK_user_roles` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO mkyongdb.users (USER_ID, USERNAME,PASSWORD, ENABLED)
VALUES (100, 'Bowen', '123456', TRUE);

INSERT INTO mkyongdb.user_roles (USER_ROLE_ID, USER_ID,AUTHORITY)
VALUES (1, 100, 'ROLE_ADMIN');