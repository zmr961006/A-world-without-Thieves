create database TTOWT;
use TTOWT;


DROP TABLE IF EXISTS `action`;

create table `action` (
    `action_id` int(11) NOT NULL AUTO_INCREMENT,
    `action_time` varchar(30) DEFAULT NULL,
    `action_where` varchar(50) DEFAULT NULL,
    `Bpeople_id` int(11) DEFAULT NULL ,
    `Apeople_id` int(11) DEFAULT NULL ,
    `action_type_id` int(11)DEFAULT NULL ,
    PRIMARY KEY (action_id)

)ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `Apeople`;

CREATE TABLE `Apeople` (
  `Apeople_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20)  DEFAULT NULL,
  `age`  int DEFAULT NULL,
  `sex`  int DEFAULT NULL,
  `work` varchar(20),
  PRIMARY KEY (`Apeople_id`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;





DROP TABLE IF EXISTS `Bpeople`;


CREATE TABLE `Bpeople` (
  `Bpeople_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20)  DEFAULT NULL,
  `age`  int DEFAULT NULL,
  `sex`  int DEFAULT NULL,
  `work` varchar(20),
  PRIMARY KEY (`Bpeople_id`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

