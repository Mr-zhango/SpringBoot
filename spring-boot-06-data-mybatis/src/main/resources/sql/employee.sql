/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : restful_crud

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-03-05 10:41:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `EMPLOYEE_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工表主键',
  `LAST_NAME` varchar(255) DEFAULT NULL COMMENT '员工姓名',
  `EMAIL` varchar(255) DEFAULT NULL COMMENT '员工邮箱',
  `GENDER` int(2) DEFAULT NULL COMMENT '员工性别',
  `DEPARTMENT_ID` int(11) DEFAULT NULL COMMENT '员工部门id',
  `BIRTHDAY` datetime DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`EMPLOYEE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
