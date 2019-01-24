/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : stu_grade

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-01-24 16:27:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `cno` int(11) NOT NULL,
  `course_name` varchar(255) NOT NULL,
  `hour` int(11) NOT NULL,
  `credit` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('0000000001', '1', '需求工程', '20', '3');
INSERT INTO `course` VALUES ('0000000002', '2', '操作系统', '20', '2');
INSERT INTO `course` VALUES ('0000000003', '3', '信息安全', '36', '2');
INSERT INTO `course` VALUES ('0000000004', '4', '数据库', '36', '3');
INSERT INTO `course` VALUES ('0000000005', '5', '马基', '36', '3');
INSERT INTO `course` VALUES ('0000000006', '6', '毛概', '36', '3');
INSERT INTO `course` VALUES ('0000000007', '7', '思修', '36', '3');
INSERT INTO `course` VALUES ('0000000008', '8', '机械制图', '20', '3');
INSERT INTO `course` VALUES ('0000000009', '9', 'CAD', '16', '2');
INSERT INTO `course` VALUES ('0000000010', '10', '心理健康', '16', '1');
INSERT INTO `course` VALUES ('0000000011', '11', '社交礼仪', '16', '1');
INSERT INTO `course` VALUES ('0000000012', '12', '计算机网络', '20', '2');
INSERT INTO `course` VALUES ('0000000013', '13', '软件测试', '36', '3');
INSERT INTO `course` VALUES ('0000000014', '14', 'java', '16', '2');
INSERT INTO `course` VALUES ('0000000015', '15', 'C语言', '20', '2');
INSERT INTO `course` VALUES ('0000000016', '16', '专业英语', '16', '1');
INSERT INTO `course` VALUES ('0000000017', '17', '英语', '16', '1');
INSERT INTO `course` VALUES ('0000000018', '18', '高数', '36', '2');
INSERT INTO `course` VALUES ('0000000019', '19', '软件构造', '36', '3');
INSERT INTO `course` VALUES ('0000000020', '20', '线性代数', '36', '3');
INSERT INTO `course` VALUES ('0000000021', '21', '微积分', '16', '1');
INSERT INTO `course` VALUES ('0000000022', '22', '离散数学', '16', '1');
INSERT INTO `course` VALUES ('0000000023', '23', '机械工程', '16', '1');
INSERT INTO `course` VALUES ('0000000024', '24', '体育', '16', '1');
INSERT INTO `course` VALUES ('0000000025', '25', '体育2', '16', '1');
INSERT INTO `course` VALUES ('0000000026', '26', '体育3', '16', '1');
INSERT INTO `course` VALUES ('0000000027', '27', '体育4', '16', '1');
INSERT INTO `course` VALUES ('0000000028', '28', '英语2', '16', '1');
INSERT INTO `course` VALUES ('0000000029', '29', '英语3', '16', '1');
INSERT INTO `course` VALUES ('0000000030', '30', '英语4', '16', '1');

-- ----------------------------
-- Table structure for `grade`
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `sno` int(11) NOT NULL,
  `cno` int(11) NOT NULL,
  `course_name` varchar(255) NOT NULL,
  `grade` int(11) NOT NULL,
  `b_grade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sno` (`sno`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('12', '201520219', '1', '', '99', '100');
INSERT INTO `grade` VALUES ('14', '201520217', '1', '需求工程', '90', '0');
INSERT INTO `grade` VALUES ('15', '201520216', '1', '需求工程', '90', '0');
INSERT INTO `grade` VALUES ('16', '201520215', '1', '需求工程', '90', '0');
INSERT INTO `grade` VALUES ('17', '201520214', '1', '需求工程', '90', '0');
INSERT INTO `grade` VALUES ('18', '201520220', '2', '操作系统', '80', '0');
INSERT INTO `grade` VALUES ('19', '201520221', '2', '操作系统', '90', '0');
INSERT INTO `grade` VALUES ('20', '201520222', '2', '操作系统', '85', '0');
INSERT INTO `grade` VALUES ('21', '201520223', '3', '信息安全', '90', '0');
INSERT INTO `grade` VALUES ('22', '201520224', '3', '信息安全', '87', '0');
INSERT INTO `grade` VALUES ('23', '201520225', '3', '信息安全', '0', '86');
INSERT INTO `grade` VALUES ('24', '201520226', '4', '数据库', '90', '0');
INSERT INTO `grade` VALUES ('25', '201520227', '4', '数据库', '68', '0');
INSERT INTO `grade` VALUES ('26', '201520228', '5', '马基', '70', '0');
INSERT INTO `grade` VALUES ('27', '201520229', '6', '毛概', '69', '0');
INSERT INTO `grade` VALUES ('28', '201520245', '7', '思修', '70', '0');
INSERT INTO `grade` VALUES ('29', '201409321', '8', '机械制图', '80', '0');
INSERT INTO `grade` VALUES ('30', '201409322', '8', '机械制图', '70', '0');
INSERT INTO `grade` VALUES ('31', '201409309', '9', 'CAD', '90', '0');
INSERT INTO `grade` VALUES ('32', '201409376', '9', 'CAD', '70', '0');
INSERT INTO `grade` VALUES ('33', '201409345', '10', '心理健康', '90', '0');
INSERT INTO `grade` VALUES ('34', '201409308', '10', '心理健康', '80', '0');
INSERT INTO `grade` VALUES ('35', '201409325', '11', '社交礼仪', '91', '0');
INSERT INTO `grade` VALUES ('36', '201520219', '12', '计算机网络', '90', '0');
INSERT INTO `grade` VALUES ('37', '201520218', '13', '软件测试', '90', '0');
INSERT INTO `grade` VALUES ('38', '201520218', '14', '软件测试', '90', '0');
INSERT INTO `grade` VALUES ('39', '201520217', '14', 'java', '80', '0');
INSERT INTO `grade` VALUES ('40', '201520216', '14', 'java', '90', '0');
INSERT INTO `grade` VALUES ('41', '201520215', '15', 'C语言', '80', '0');
INSERT INTO `grade` VALUES ('42', '201520214', '15', 'C语言', '79', '0');
INSERT INTO `grade` VALUES ('43', '201520213', '16', '专业英语', '95', '0');
INSERT INTO `grade` VALUES ('44', '201520201', '16', '专业英语', '90', '0');
INSERT INTO `grade` VALUES ('45', '201520202', '17', '英语', '89', '0');
INSERT INTO `grade` VALUES ('46', '201520203', '18', '高数', '80', '0');
INSERT INTO `grade` VALUES ('47', '201520201', '18', '高数', '70', '0');
INSERT INTO `grade` VALUES ('48', '201520202', '18', '高数', '87', '90');
INSERT INTO `grade` VALUES ('49', '201520203', '19', '软件构造', '80', '0');
INSERT INTO `grade` VALUES ('50', '201520204', '19', '软件构造', '90', '0');
INSERT INTO `grade` VALUES ('51', '201520205', '20', '线性代数', '80', '0');
INSERT INTO `grade` VALUES ('52', '201520208', '21', '微积分', '90', '0');
INSERT INTO `grade` VALUES ('53', '201520209', '22', '离散数学', '100', '0');
INSERT INTO `grade` VALUES ('54', '201409321', '23', '机械工程', '99', '0');
INSERT INTO `grade` VALUES ('55', '201520219', '24', '体育', '80', '0');
INSERT INTO `grade` VALUES ('56', '201520219', '25', '体育2', '90', '0');
INSERT INTO `grade` VALUES ('57', '201520202', '26', '体育3', '80', '0');
INSERT INTO `grade` VALUES ('58', '201520203', '27', '体育4', '80', '0');
INSERT INTO `grade` VALUES ('59', '201520201', '28', '英语2', '98', '0');
INSERT INTO `grade` VALUES ('60', '201520201', '29', '英语3', '79', '0');
INSERT INTO `grade` VALUES ('61', '201520203', '30', '英语4', '84', '0');
INSERT INTO `grade` VALUES ('62', '20170302', '2', '格', '-2', '0');
INSERT INTO `grade` VALUES ('63', '201520010', '19', 'Java', '99', '0');
INSERT INTO `grade` VALUES ('64', '201520010', '19', '', '99', '0');
INSERT INTO `grade` VALUES ('65', '201520010', '19', '', '99', '0');
INSERT INTO `grade` VALUES ('66', '201520010', '19', '', '99', '0');
INSERT INTO `grade` VALUES ('67', '201520010', '19', '', '99', '0');
INSERT INTO `grade` VALUES ('68', '201520010', '19', '', '99', '0');
INSERT INTO `grade` VALUES ('69', '201520010', '19', '', '99', '0');
INSERT INTO `grade` VALUES ('70', '201520010', '19', '', '99', '0');
INSERT INTO `grade` VALUES ('71', '201510001', '1', 'xuqiugongcheng', '48', '99');
INSERT INTO `grade` VALUES ('72', '201510001', '1', 'xuqiugongcheng', '48', '99');

-- ----------------------------
-- Table structure for `manager`
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `manager_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1', '不凡', '123456');
INSERT INTO `manager` VALUES ('2', '小明', '123');
INSERT INTO `manager` VALUES ('3', '小青', '666');
INSERT INTO `manager` VALUES ('4', '安安', '123');
INSERT INTO `manager` VALUES ('5', '晴晴', '666');
INSERT INTO `manager` VALUES ('6', '阿杰', '123456');
INSERT INTO `manager` VALUES ('7', 'bufan', '123456');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `sno` int(11) NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `birthday` varchar(8) DEFAULT NULL,
  `classroom` int(11) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `faculty` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('9', '201520216', '史密斯', '男', '19980109', '2015202', '软件测试', '软件', '123');
INSERT INTO `student` VALUES ('12', '201520219', '不凡', '女', '19970709', '2015202', '软件测试', '软件', '123456');
INSERT INTO `student` VALUES ('13', '201520218', '芬迪', '男', '19980103', '2015201', '软件测试', '软件', '123');
INSERT INTO `student` VALUES ('14', '201520220', '达贾尼', '男', '19960909', '2015202', '软件测试', '软件', '123678');
INSERT INTO `student` VALUES ('15', '201520221', '卡莱蒂', '女', '19950907', '2015202', '软件测试', '软件', '785392');
INSERT INTO `student` VALUES ('16', '201520222', '阿蒙斯', '男', '19940121', '2015202', '软件测试', '软件', '9538862');
INSERT INTO `student` VALUES ('17', '201520223', '皮斯', '男', '19951010', '2015202', '软件测试', '软件', '2987052');
INSERT INTO `student` VALUES ('18', '201520224', '杰瑞', '男', '20150809', '2020202', '软件测试', '软件', '386019');
INSERT INTO `student` VALUES ('19', '201520225', '汤姆', '女', '20150908', '2015202', '软件测试', '软件', '982');
INSERT INTO `student` VALUES ('20', '201520226', '南茜', '女', '19980107', '2015202', '软件测试', '软件', '9280725');
INSERT INTO `student` VALUES ('21', '201520227', '杰克', '男', '19930903', '2015202', '软件测试', '软件', '13099');
INSERT INTO `student` VALUES ('22', '201409321', '朱迪', '女', '19950810', '2014093', '机械设计', '机械', '08109');
INSERT INTO `student` VALUES ('23', '201409309', '皮尔', '男', '19950627', '2014093', '机械设计', '机械', '39071');
INSERT INTO `student` VALUES ('24', '201409345', '仲马', '男', '19940907', '2014093', '机械设计', '机械', '9943556');
INSERT INTO `student` VALUES ('25', '201409308', '小华', '男', '19930918', '2014093', '机械设计', '机械', '976468');
INSERT INTO `student` VALUES ('26', '201409376', '青青', '女', '19960904', '2014093', '机械设计', '机械', '1951738');
INSERT INTO `student` VALUES ('27', '201409325', '文华', '女', '19900819', '2014093', '机械设计', '机械', '9837189');
INSERT INTO `student` VALUES ('28', '201409301', '埃尔文', '男', '19930206', '2014093', '机械设计', '机械', '61718778');
INSERT INTO `student` VALUES ('29', '201409356', '杰米', '男', '19970302', '2014093', '机械设计', '机械', '12345');
INSERT INTO `student` VALUES ('30', '201409302', '倩女', '女', '19960108', '2014093', '机械设计', '机械', '123456');
INSERT INTO `student` VALUES ('31', '201409303', '子良', '男', '19950909', '2014093', '机械设计', '机械', '1247');
INSERT INTO `student` VALUES ('32', '201409305', '马云', '男', '19780923', '2014093', '机械设计', '机械', '2199989');
INSERT INTO `student` VALUES ('33', '201409307', '子建', '男', '19900901', '2014093', '机械设计', '机械 ', '176563');
INSERT INTO `student` VALUES ('34', '201409309', '凯文', '男', '19980902', '2014093', '机械设计', '机械', '2871936');
INSERT INTO `student` VALUES ('35', '201409320', '嘉实', '男', '19930909', '2014093', '机械设计', '机械', '38939');
INSERT INTO `student` VALUES ('36', '201520231', '文杰', '男', '19970923', '2015202', '软件测试', '软件', '17387');
INSERT INTO `student` VALUES ('37', '201420219', '玛瑞', '女', '19940909', '2014093', '机械设计', '机械', '78178');
INSERT INTO `student` VALUES ('38', '201520234', '杰西', '男', '19980102', '2014093', '软件测试', '软件', '984649');
INSERT INTO `student` VALUES ('39', '201520245', '梦露', '女', '19980908', '2015202', '软件测试', '软件', '817316389');
INSERT INTO `student` VALUES ('40', '201520269', '彬彬', '男', '19980706', '2015202', '软件测试', '软件', '238713578');
INSERT INTO `student` VALUES ('41', '201520246', '小明', '男', '19980908', '2015202', '软件测试', '软件', '8239');
INSERT INTO `student` VALUES ('42', '201520278', '科比', '男', '19900908', '2015202', '软件测试', '软件', '173198');
INSERT INTO `student` VALUES ('43', '201409303', '文市', '男', '19960203', '2014093', '机械设计', '机械', '1896');
INSERT INTO `student` VALUES ('44', '201409328', '琪琪', '女', '19980902', '2014093', '机械设计', '机械', '239396');
INSERT INTO `student` VALUES ('45', '201520234', '马克', '男', '19980701', '2015202', '软件测试', '软件', '109827');
INSERT INTO `student` VALUES ('46', '201520288', 'bufan', '女', '19970709', '2015202', '软件测试', '软件', '123456');
INSERT INTO `student` VALUES ('47', '201520010', '小青', '女', '19970809', '2015200', '软件测试', '软件', '123');
INSERT INTO `student` VALUES ('48', '201520010', '', '', '19970809', '2015200', '', '', '123');
INSERT INTO `student` VALUES ('49', '201520010', '', '', '19970809', '2015200', '', '', '123');
INSERT INTO `student` VALUES ('50', '201520010', '', '', '19970809', '2015200', '', '', '123');
INSERT INTO `student` VALUES ('51', '201520010', '', '', '19970809', '2015200', '', '', '123');
INSERT INTO `student` VALUES ('52', '201520010', '', '', '19970809', '2015200', '', '', '123');
INSERT INTO `student` VALUES ('53', '201520010', '', '', '19970809', '2015200', '', '', '123');
INSERT INTO `student` VALUES ('54', '201520010', '', '', '19970809', '2015200', '', '', '123');
INSERT INTO `student` VALUES ('55', '201520001', '01', '女', '19970709', '2015200', '软件测试', '软件', '123456');
INSERT INTO `student` VALUES ('56', '201520001', '1', '', '19970709', '2015200', '', '', '123456');
INSERT INTO `student` VALUES ('57', '2', '2', '01', '19970709', '2', '01', '01', '123456');
INSERT INTO `student` VALUES ('58', '3', '3', '02', '19970809', '1', '02', '01', '123456');
INSERT INTO `student` VALUES ('59', '4', '4', '01', '19970609', '1', '02', '01', '123456');
INSERT INTO `student` VALUES ('60', '109', '小傲啸', '男', '10930908', '1090', '水动', '水利', '111');
INSERT INTO `student` VALUES ('61', '201520219', '不凡', '女', '19970709', '2015202', '软件测试', '软件', '123456');
INSERT INTO `student` VALUES ('62', '109', '', '', '10930908', '1090', '', '', '111');
INSERT INTO `student` VALUES ('63', '201520219', '', '', '19970709', '2015202', '', '', '123456');
INSERT INTO `student` VALUES ('64', '201520219', '不凡', '女', '19970709', '2015202', '软件测试', '软件', '123456');
INSERT INTO `student` VALUES ('65', '201520219', '', '', '19970709', '2015202', '', '', '123456');
