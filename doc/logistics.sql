/*
 Navicat Premium Data Transfer

 Source Server         : MySQL本机
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : community

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 16/12/2021 12:54:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for car_type
-- ----------------------------
DROP TABLE IF EXISTS `car_type`;
CREATE TABLE `car_type`  (
  `type_id` int(0) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of car_type
-- ----------------------------
INSERT INTO `car_type` VALUES (1, '小面包');
INSERT INTO `car_type` VALUES (2, '大货车');

-- ----------------------------
-- Table structure for logistics
-- ----------------------------
DROP TABLE IF EXISTS `logistics`;
CREATE TABLE `logistics`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `log_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物流编号',
  `type_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车辆类别',
  `driver_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '司机姓名',
  `start_place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出发地',
  `end_place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目的地',
  `depart_time` datetime(0) NULL DEFAULT NULL COMMENT '发车时间',
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of logistics
-- ----------------------------
INSERT INTO `logistics` VALUES (2, '0002', '1', '张三', '郑州', '新郑', '2021-12-31 16:00:00', '2', '2021-12-16 10:15:04', '1', '2021-12-16 10:03:22');
INSERT INTO `logistics` VALUES (3, '0003', '2', '李四', '上海', '陕西', '2021-12-01 16:00:00', '3', '2021-12-16 10:15:07', '1', '2021-12-16 04:35:02');
INSERT INTO `logistics` VALUES (4, '0005', '2', '王五', '北京', '合肥', '2021-12-15 20:00:00', '2', '2021-12-16 10:22:57', '1', '2021-12-16 04:26:47');
INSERT INTO `logistics` VALUES (5, '0006', '1', '王五', '北京', '乌鲁木齐', '2021-12-18 00:00:06', '3', '2021-12-16 04:27:31', '1', '2021-12-16 04:27:31');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `stu_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '真实名称',
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号(姓名首字母缩写加学号后四位，如：xw0000)',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'admin', 'admin', 'admin', 'admin', '男');
INSERT INTO `tb_user` VALUES (2, '00001', '张三', 'zs0001', '123456', '女');
INSERT INTO `tb_user` VALUES (3, '00002', '李四', 'ls0002', '123456', '女');
INSERT INTO `tb_user` VALUES (4, '00003', '王五', 'ww0003', '123456', '男');
INSERT INTO `tb_user` VALUES (5, '00004', '牛六六', 'nll0004', '123456', '女');
INSERT INTO `tb_user` VALUES (6, '00005', '甲', 'j0005', '123456', '男');

SET FOREIGN_KEY_CHECKS = 1;
