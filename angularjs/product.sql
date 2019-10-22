/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : sn

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 22/10/2019 17:58:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('05af70910155f8fc', 'Kayak', 'Watersports', 275.00, 'A boat for one person');
INSERT INTO `product` VALUES ('32c2355f9a617bbd', 'Unsteady Chair', 'Chess', 29.95, 'Secretly give your opponent a disadvantage');
INSERT INTO `product` VALUES ('3d31d81b218c98ef', 'Lifejacket', 'Watersports', 48.95, 'Protective and fashionable');
INSERT INTO `product` VALUES ('437615faf1d38815', 'Soccer Ball', 'Soccer', 19.50, 'FIFA-approved size and weight');
INSERT INTO `product` VALUES ('5241512218f73a26', 'Human Chesss Board', 'Chess', 75.00, 'A fun game for the family');
INSERT INTO `product` VALUES ('59166228d70f8858', 'Bling-Bling King', 'Chess', 1200.00, 'Gold-plated, diamond-studded King');
INSERT INTO `product` VALUES ('93c9cc08ac2f28d4', 'Corner Flags', 'Soccer', 34.95, 'Give your playing field a professional touch');
INSERT INTO `product` VALUES ('ad4e64b38baa088f', 'Stadium', 'Soccer', 79500.00, 'Flat-packed 35,000-seat stadium');
INSERT INTO `product` VALUES ('b9e8e55c1ecc0b63', 'Thinking Cap', 'Chess', 16.00, 'Improve your brain efficiency by 75%');

SET FOREIGN_KEY_CHECKS = 1;
