/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : lms_db

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2017-05-04 11:49:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for carriers
-- ----------------------------
DROP TABLE IF EXISTS `carriers`;
CREATE TABLE `carriers` (
  `CarriersID` int(11) NOT NULL AUTO_INCREMENT,
  `SendCompany` varchar(255) DEFAULT NULL,
  `SendAddress` varchar(255) DEFAULT NULL,
  `SendLinkman` varchar(255) DEFAULT NULL,
  `SendPhone` varchar(255) DEFAULT NULL,
  `ReceiveCompany` varchar(255) DEFAULT NULL,
  `FK_ReceiveAddress` varchar(255) DEFAULT NULL,
  `ReceiveLinkman` varchar(255) DEFAULT NULL,
  `ReceivePhone` varchar(255) DEFAULT NULL,
  `LeaverDate` datetime DEFAULT NULL,
  `ReceiveDate` datetime DEFAULT NULL,
  `FinishedState` int(11) DEFAULT NULL,
  `InsuranceCost` float DEFAULT NULL,
  `TransportCost` float DEFAULT NULL,
  `OtherCost` float DEFAULT NULL,
  `TotalCost` float DEFAULT NULL,
  `FK_UserID` int(11) DEFAULT NULL,
  `CheckInTime` datetime DEFAULT NULL,
  `IsDelete` int(11) DEFAULT NULL,
  `AlterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`CarriersID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carriers
-- ----------------------------

-- ----------------------------
-- Table structure for contact
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `ContactID` int(11) NOT NULL AUTO_INCREMENT,
  `FK_TruckID` int(11) DEFAULT NULL,
  `FK_DriverID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ContactID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contact
-- ----------------------------

-- ----------------------------
-- Table structure for driver
-- ----------------------------
DROP TABLE IF EXISTS `driver`;
CREATE TABLE `driver` (
  `DriverID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Sex` int(11) DEFAULT NULL,
  `Birth` datetime DEFAULT NULL,
  `Phone` varchar(255) DEFAULT NULL,
  `IDCard` varchar(255) DEFAULT NULL,
  `FK_TeamID` int(11) DEFAULT NULL,
  `State` int(11) DEFAULT NULL,
  `CheckInTime` datetime DEFAULT NULL,
  `IsDelete` int(11) DEFAULT NULL,
  `AlterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`DriverID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of driver
-- ----------------------------
INSERT INTO `driver` VALUES ('1', '大宝宝', '1', '2017-05-01 09:19:30', '12121', '12121', '1', '1', '2017-05-01 09:19:40', '0', '2017-05-01 09:19:45');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `GoodsID` int(11) NOT NULL AUTO_INCREMENT,
  `GoodsName` varchar(255) DEFAULT NULL,
  `Amount` varchar(255) DEFAULT NULL,
  `Weight` float DEFAULT NULL,
  `Volume` float DEFAULT NULL,
  `FK_CarriersID` int(11) DEFAULT NULL,
  `IsDelete` int(11) DEFAULT NULL,
  PRIMARY KEY (`GoodsID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------

-- ----------------------------
-- Table structure for logdic
-- ----------------------------
DROP TABLE IF EXISTS `logdic`;
CREATE TABLE `logdic` (
  `TypeID` int(11) NOT NULL AUTO_INCREMENT,
  `TypeName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of logdic
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `RoleID` int(11) NOT NULL AUTO_INCREMENT,
  `RoleName` varchar(255) DEFAULT NULL,
  `RolePurview` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'sadmin', 'all');
INSERT INTO `role` VALUES ('2', 'tadmin', null);
INSERT INTO `role` VALUES ('3', 'dispatcher', null);
INSERT INTO `role` VALUES ('4', 'accountant', null);
INSERT INTO `role` VALUES ('5', 'driver', null);

-- ----------------------------
-- Table structure for scheduling
-- ----------------------------
DROP TABLE IF EXISTS `scheduling`;
CREATE TABLE `scheduling` (
  `SchedulingID` int(11) NOT NULL AUTO_INCREMENT,
  `StartTime` datetime DEFAULT NULL,
  `FK_CarriersID` int(11) DEFAULT NULL,
  `FK_TruckID` int(11) DEFAULT NULL,
  `OilCost` float DEFAULT NULL,
  `Toll` float DEFAULT NULL,
  `Fine` float DEFAULT NULL,
  `OtherCost` float DEFAULT NULL,
  `TotalCost` float DEFAULT NULL,
  `FK_UserID` int(11) DEFAULT NULL,
  `CheckInTime` datetime DEFAULT NULL,
  `IsDelete` int(11) DEFAULT NULL,
  `AlterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`SchedulingID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scheduling
-- ----------------------------

-- ----------------------------
-- Table structure for syslog
-- ----------------------------
DROP TABLE IF EXISTS `syslog`;
CREATE TABLE `syslog` (
  `LogID` int(11) NOT NULL AUTO_INCREMENT,
  `Behavior` varchar(255) DEFAULT NULL,
  `FK_TypeID` int(11) DEFAULT NULL,
  `FK_UserID` int(11) DEFAULT NULL,
  `Parameters` varchar(255) DEFAULT NULL,
  `ProcName` varchar(255) DEFAULT NULL,
  `IP` varchar(255) DEFAULT NULL,
  `CheckInTime` datetime DEFAULT NULL,
  `Exception` varchar(255) DEFAULT NULL,
  `IsException` int(11) DEFAULT NULL,
  PRIMARY KEY (`LogID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of syslog
-- ----------------------------

-- ----------------------------
-- Table structure for truck
-- ----------------------------
DROP TABLE IF EXISTS `truck`;
CREATE TABLE `truck` (
  `TruckID` int(11) NOT NULL AUTO_INCREMENT,
  `Number` varchar(255) DEFAULT NULL,
  `BuyDate` datetime DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  `Length` varchar(255) DEFAULT NULL,
  `Tonnage` float DEFAULT NULL,
  `FK_TeamID` int(11) DEFAULT NULL,
  `State` int(11) DEFAULT NULL,
  `CheckInTime` datetime DEFAULT NULL,
  `IsDelete` int(11) DEFAULT NULL,
  `AlterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`TruckID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of truck
-- ----------------------------
INSERT INTO `truck` VALUES ('2', '渝A12201', null, '公司车辆', '12', '20', '1', '1', '2017-05-04 09:35:04', null, '2017-05-04 09:35:04');
INSERT INTO `truck` VALUES ('5', '渝C1234', null, '公司车辆', '12', '21', '2', '1', '2017-05-04 11:30:40', null, '2017-05-04 11:30:40');

-- ----------------------------
-- Table structure for truckteam
-- ----------------------------
DROP TABLE IF EXISTS `truckteam`;
CREATE TABLE `truckteam` (
  `TeamId` int(11) NOT NULL AUTO_INCREMENT,
  `TeamName` varchar(255) DEFAULT NULL,
  `Leader` varchar(255) DEFAULT NULL,
  `Remark` varchar(255) DEFAULT NULL,
  `CheckInTime` datetime DEFAULT NULL,
  `IsDelete` int(11) DEFAULT NULL,
  `AlterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`TeamId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of truckteam
-- ----------------------------
INSERT INTO `truckteam` VALUES ('1', '春', '夏', '第一个车队', '2017-05-04 09:16:31', '1', '2017-05-04 09:16:31');
INSERT INTO `truckteam` VALUES ('2', '夏', '东', '第二个车队', '2017-05-04 11:29:52', '1', '2017-05-04 11:29:52');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(255) DEFAULT NULL,
  `Sex` varchar(11) DEFAULT NULL,
  `Account` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Phone` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `FK_RoleID` int(11) DEFAULT NULL,
  `CheckInTime` datetime DEFAULT NULL,
  `IsDelete` int(11) DEFAULT NULL,
  `AlterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '罗涛', '男', 'luto', '123', '12321123', '123@qq.com', '1', '2017-04-03 11:57:30', '1', '2017-04-04 11:57:37');
INSERT INTO `user` VALUES ('9', 'luto', '男', 'stark', '123', '123', '123@qq.com', '2', '2017-05-04 11:26:50', '1', '2017-05-04 09:00:15');
