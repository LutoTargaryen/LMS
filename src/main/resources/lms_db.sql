/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : lms_db

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2017-04-27 14:28:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for carriers
-- ----------------------------
DROP TABLE IF EXISTS `carriers`;
CREATE TABLE `carriers` (
  `CarriersID` int(11) NOT NULL,
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
  `ContactID` int(11) NOT NULL,
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
  `DriverID` int(11) NOT NULL,
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of driver
-- ----------------------------

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `GoodsID` int(11) NOT NULL,
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
  `TypeID` int(11) NOT NULL,
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
  `RoleID` int(11) NOT NULL,
  `RoleName` varchar(255) DEFAULT NULL,
  `RolePurview` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for scheduling
-- ----------------------------
DROP TABLE IF EXISTS `scheduling`;
CREATE TABLE `scheduling` (
  `SchedulingID` int(11) NOT NULL,
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
  `LogID` int(11) NOT NULL,
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of truck
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of truckteam
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserID` int(11) NOT NULL,
  `UserName` varchar(255) DEFAULT NULL,
  `Sex` int(11) DEFAULT NULL,
  `Account` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Phone` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `FK_RoleID` int(11) DEFAULT NULL,
  `CheckInTime` datetime DEFAULT NULL,
  `IsDelete` int(11) DEFAULT NULL,
  `AlterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
