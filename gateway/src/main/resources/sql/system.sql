/*
 Navicat Premium Data Transfer

 Source Server         : 111.230.95.206[卢小波]
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : 111.230.95.206:3306
 Source Schema         : system

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 23/05/2019 14:39:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for p_element
-- ----------------------------
DROP TABLE IF EXISTS `p_element`;
CREATE TABLE `p_element`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `element_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '元素名称',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '页面元素表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_file
-- ----------------------------
DROP TABLE IF EXISTS `p_file`;
CREATE TABLE `p_file`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `file_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '文件名称',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文件表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_function
-- ----------------------------
DROP TABLE IF EXISTS `p_function`;
CREATE TABLE `p_function`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `function_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '功能名称',
  `function_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '功能编码',
  `pre_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '拦截url前缀',
  `parent_id` int(11) NOT NULL COMMENT '操作父id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '功能操作表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_group
-- ----------------------------
DROP TABLE IF EXISTS `p_group`;
CREATE TABLE `p_group`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `group_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '用户组名称',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户组表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_menu
-- ----------------------------
DROP TABLE IF EXISTS `p_menu`;
CREATE TABLE `p_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `menu_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '菜单名称',
  `menu_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '菜单url',
  `parent_id` int(11) NOT NULL DEFAULT 0 COMMENT '父级菜单',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '菜单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_permission_element
-- ----------------------------
DROP TABLE IF EXISTS `p_permission_element`;
CREATE TABLE `p_permission_element`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `permission_id` int(11) NOT NULL COMMENT '权限id',
  `element_id` int(11) NOT NULL COMMENT '页面元素id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '权限与页面元素关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_permission_file
-- ----------------------------
DROP TABLE IF EXISTS `p_permission_file`;
CREATE TABLE `p_permission_file`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `permission_id` int(11) NOT NULL COMMENT '权限id',
  `file_id` int(11) NOT NULL COMMENT '文件id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '权限与文件关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_permission_function
-- ----------------------------
DROP TABLE IF EXISTS `p_permission_function`;
CREATE TABLE `p_permission_function`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `permission_id` int(11) NOT NULL COMMENT '权限id',
  `function_id` int(11) NOT NULL COMMENT '功能id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '权限与功能操作关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_permission_menu
-- ----------------------------
DROP TABLE IF EXISTS `p_permission_menu`;
CREATE TABLE `p_permission_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `permission_id` int(11) NOT NULL COMMENT '权限id',
  `menu_id` int(11) NOT NULL COMMENT '菜单id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '权限与菜单关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_permission_role
-- ----------------------------
DROP TABLE IF EXISTS `p_permission_role`;
CREATE TABLE `p_permission_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `permission_id` int(11) NOT NULL COMMENT '权限id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '角色与权限关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_role
-- ----------------------------
DROP TABLE IF EXISTS `p_role`;
CREATE TABLE `p_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `role_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色名称',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_user_group
-- ----------------------------
DROP TABLE IF EXISTS `p_user_group`;
CREATE TABLE `p_user_group`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `group_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户组名称',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户组表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for p_user_role
-- ----------------------------
DROP TABLE IF EXISTS `p_user_role`;
CREATE TABLE `p_user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户与角色关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `username` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户账号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '加密的密码',
  `salt` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '盐值',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modify_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `deleted` int(1) NOT NULL DEFAULT 0 COMMENT '是否被逻辑删除(1,已经删除;0,未删除)',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_username`(`username`) USING BTREE,
  INDEX `idx_create_time`(`create_time`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
