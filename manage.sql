/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : manage

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-03-19 17:51:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for syspage
-- ----------------------------
DROP TABLE IF EXISTS `syspage`;
CREATE TABLE `syspage` (
  `id` int(11) NOT NULL,
  `pageUrl` varchar(255) DEFAULT NULL COMMENT '页面url',
  `explains` varchar(255) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统——页面表（手动录入）';

-- ----------------------------
-- Records of syspage
-- ----------------------------

-- ----------------------------
-- Table structure for syspower
-- ----------------------------
DROP TABLE IF EXISTS `syspower`;
CREATE TABLE `syspower` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(11) DEFAULT NULL COMMENT '角色',
  `page` varchar(40) CHARACTER SET utf8mb4 DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL,
  `grade` varchar(3) CHARACTER SET utf8mb4 DEFAULT '1' COMMENT '页面等级',
  `explains` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '说明',
  `pageSort` varchar(3) CHARACTER SET utf8mb4 DEFAULT '1' COMMENT '菜单排序',
  `createtime` varchar(24) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='系统——权限表';

-- ----------------------------
-- Records of syspower
-- ----------------------------

-- ----------------------------
-- Table structure for sysrole
-- ----------------------------
DROP TABLE IF EXISTS `sysrole`;
CREATE TABLE `sysrole` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(32) CHARACTER SET utf8mb4 NOT NULL COMMENT '角色编码',
  `explains` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '说明',
  `createtime` varchar(24) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`,`role`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='系统——角色表';

-- ----------------------------
-- Records of sysrole
-- ----------------------------
INSERT INTO `sysrole` VALUES ('2', '5404fbe520494a4989ba70e93632c67c', '角色2', '2018-03-19 10:56:21');
INSERT INTO `sysrole` VALUES ('3', '5404fbe520494a4989ba70e93632c67c', '角色3', '2018-03-19 10:56:21');
INSERT INTO `sysrole` VALUES ('5', '5404fbe520494a4989ba70e93632c67c', '角色5', '2018-03-19 10:56:21');
INSERT INTO `sysrole` VALUES ('8', '5404fbe520494a4989ba70e93632c67c', '角色8', '2018-03-19 10:56:21');
INSERT INTO `sysrole` VALUES ('9', '5404fbe520494a4989ba70e93632c67c', '角色9', '2018-03-19 10:56:21');
INSERT INTO `sysrole` VALUES ('10', '5404fbe520494a4989ba70e93632c67c', '角色10', '2018-03-19 10:56:21');
INSERT INTO `sysrole` VALUES ('11', '5404fbe520494a4989ba70e93632c67c', '角色11', '2018-03-19 10:56:21');
INSERT INTO `sysrole` VALUES ('12', '5404fbe520494a4989ba70e93632c67c', '角色12', '2018-03-19 10:56:21');
INSERT INTO `sysrole` VALUES ('13', '5404fbe520494a4989ba70e93632c67c', '角色13', '2018-03-19 10:56:21');
INSERT INTO `sysrole` VALUES ('26', '8227e24b33824db195d7aff83ee81529', '让它替我', '2018-03-19 16:38:37');
INSERT INTO `sysrole` VALUES ('27', 'ce585c5ebbf544f9b8c5bf546617cf26', '我11打到', '2018-03-19 16:42:36');
INSERT INTO `sysrole` VALUES ('29', '9f4d2bf9bd9349bc90c135e11aae6023', '测试赛', '2018-03-19 16:49:48');
INSERT INTO `sysrole` VALUES ('32', '1170538bb8c64fbe931968491dbb7764', '切', '2018-03-19 17:36:04');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  `state` varchar(3) DEFAULT '0' COMMENT '0为正常',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统——用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', 'NPNDEGJNFDKGPIKEGJLEPIOKNCNMLEIP', null, '0');
