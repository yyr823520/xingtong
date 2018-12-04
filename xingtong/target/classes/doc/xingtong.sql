/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.19 : Database - xingtong
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`xingtong` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `xingtong`;

/*Table structure for table `actualproduct` */

DROP TABLE IF EXISTS `actualproduct`;

CREATE TABLE `actualproduct` (
  `aid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `pid` int(11) DEFAULT NULL COMMENT '商品id',
  `actualnumber` int(11) DEFAULT NULL COMMENT '实收数量',
  `lossnumbeer` int(11) DEFAULT NULL COMMENT '丢失数量',
  `storageid` int(11) DEFAULT NULL COMMENT '备货区id',
  `aremark` varchar(200) DEFAULT NULL COMMENT '备注',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `actualproduct` */

/*Table structure for table `arrivalconfirm` */

DROP TABLE IF EXISTS `arrivalconfirm`;

CREATE TABLE `arrivalconfirm` (
  `acid` int(11) NOT NULL COMMENT 'Id',
  `loadid` int(11) DEFAULT NULL COMMENT '配载发车id',
  `arrivaltime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '到车时间',
  `arrivalstatus` int(11) DEFAULT NULL COMMENT '到货状态0在途中1已到货',
  `msgstatus` int(11) DEFAULT NULL COMMENT '短信通知0未通知1已通知',
  `msgcontent` varchar(200) DEFAULT NULL COMMENT '短信内容',
  `telstatus` int(11) DEFAULT NULL COMMENT '电话通知0未通知1已通知',
  `pickstatus` int(11) DEFAULT NULL COMMENT '0自提1派送',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`acid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arrivalconfirm` */

/*Table structure for table `computer` */

DROP TABLE IF EXISTS `computer`;

CREATE TABLE `computer` (
  `cid` int(11) NOT NULL AUTO_INCREMENT COMMENT '公司Id',
  `computername` varchar(50) DEFAULT NULL COMMENT '公司名称',
  `telephone` char(11) DEFAULT NULL COMMENT '联系电话',
  `openingbank` varchar(50) DEFAULT NULL COMMENT '开户行',
  `dutyparagraph` varchar(50) DEFAULT NULL COMMENT '税号',
  `address` varchar(50) DEFAULT NULL COMMENT '联系地址',
  `busregnumber` varchar(50) DEFAULT NULL COMMENT '工商注册号',
  `fax` varchar(50) DEFAULT NULL COMMENT '联系传真',
  `accountnumber` varchar(50) DEFAULT NULL COMMENT '开户账号',
  `email` varchar(20) DEFAULT NULL COMMENT '电子邮箱',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `computer` */

/*Table structure for table `conlog` */

DROP TABLE IF EXISTS `conlog`;

CREATE TABLE `conlog` (
  `loginid` int(11) NOT NULL AUTO_INCREMENT COMMENT '登录日志Id',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `logintime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登录日期',
  `computername` varchar(20) DEFAULT NULL COMMENT '计算机名',
  `computerip` varchar(20) DEFAULT NULL COMMENT 'Ip地址',
  PRIMARY KEY (`loginid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `conlog` */

/*Table structure for table `consign` */

DROP TABLE IF EXISTS `consign`;

CREATE TABLE `consign` (
  `consignid` varchar(50) NOT NULL COMMENT '托运单号',
  `destination` varchar(50) DEFAULT NULL COMMENT '目的地',
  `wid` int(11) DEFAULT NULL COMMENT '到站网点id(仓库)',
  `receivenoteid` int(11) DEFAULT NULL COMMENT '收货单id(货号)关联发收货人id,商品id',
  `originalprice` decimal(7,2) DEFAULT NULL COMMENT '货物原单价',
  `measurement` varchar(20) DEFAULT NULL COMMENT '货物计量',
  `totalmoney` decimal(7,2) DEFAULT NULL COMMENT '货物总金额',
  `freightcharge` decimal(7,2) DEFAULT NULL COMMENT '运费',
  `receivingfee` decimal(7,2) DEFAULT NULL COMMENT '接货费',
  `deliverycharge` decimal(7,2) DEFAULT NULL COMMENT '派送费',
  `insuredvalue` decimal(7,2) DEFAULT NULL COMMENT '投保价值',
  `valuationfee` decimal(7,2) DEFAULT NULL COMMENT '保价费',
  `totalcost` decimal(7,2) DEFAULT NULL COMMENT '合计费用',
  `dictionaryid` int(11) DEFAULT NULL COMMENT '结算方式id',
  `owetopay` decimal(7,2) DEFAULT NULL COMMENT '欠付',
  `spotpayment` decimal(7,2) DEFAULT NULL COMMENT '现付',
  `tosubmit` decimal(7,2) DEFAULT NULL COMMENT '提付',
  `receiptfor` decimal(7,2) DEFAULT NULL COMMENT '回单付',
  `monthlypay` decimal(7,2) DEFAULT NULL COMMENT '月结',
  `operatingcosts` decimal(7,2) DEFAULT NULL COMMENT '业务费',
  `otherdescription` varchar(100) DEFAULT NULL COMMENT '其他说明',
  `billingtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '开单日期',
  `operator` varchar(20) DEFAULT NULL COMMENT '操作员(登录人名称)',
  `orderstatus` varchar(50) DEFAULT NULL COMMENT '订单状态',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string2` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`consignid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `consign` */

/*Table structure for table `consignee` */

DROP TABLE IF EXISTS `consignee`;

CREATE TABLE `consignee` (
  `conid` int(11) NOT NULL AUTO_INCREMENT COMMENT '收货方Id',
  `conname` varchar(50) DEFAULT NULL COMMENT '发货人名称',
  `concompanyname` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `contelphone` char(8) DEFAULT NULL COMMENT '联系电话',
  `confax` varchar(50) DEFAULT NULL COMMENT '联系传真',
  `conphone` char(11) DEFAULT NULL COMMENT '手机号',
  `conemail` varchar(32) DEFAULT NULL COMMENT '电子邮件',
  `conqqormsn` varchar(30) DEFAULT NULL COMMENT 'QQ/MSN',
  `conearlyaccount` decimal(10,2) DEFAULT NULL COMMENT '初期应收',
  `conaddress` varchar(50) DEFAULT NULL COMMENT '联系地址',
  `conremark` varchar(100) DEFAULT NULL COMMENT '备注',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `sting1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`conid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `consignee` */

/*Table structure for table `consignloadingstart` */

DROP TABLE IF EXISTS `consignloadingstart`;

CREATE TABLE `consignloadingstart` (
  `clsid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `consignid` varchar(30) DEFAULT NULL COMMENT '运单ID',
  `loadid` int(11) DEFAULT NULL COMMENT '配载发车ID',
  PRIMARY KEY (`clsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `consignloadingstart` */

/*Table structure for table `customerpay` */

DROP TABLE IF EXISTS `customerpay`;

CREATE TABLE `customerpay` (
  `customerpayid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `consignid` varchar(30) DEFAULT NULL COMMENT '托运id',
  `pay` varchar(20) DEFAULT NULL COMMENT '结账人',
  `personpay` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '结账时间',
  `employeeid` int(11) DEFAULT NULL COMMENT '经手人(员工表id)',
  `cpremark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`customerpayid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customerpay` */

/*Table structure for table `customersign` */

DROP TABLE IF EXISTS `customersign`;

CREATE TABLE `customersign` (
  `csid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `consignid` varchar(30) DEFAULT NULL COMMENT '托运单ID',
  `pickstatus` int(11) DEFAULT NULL COMMENT '0签收1已签收',
  `receiptstatus` int(11) DEFAULT NULL COMMENT '0回单未寄送1回单已寄送',
  PRIMARY KEY (`csid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customersign` */

/*Table structure for table `custompackge` */

DROP TABLE IF EXISTS `custompackge`;

CREATE TABLE `custompackge` (
  `cuid` int(11) NOT NULL AUTO_INCREMENT COMMENT '定制包装Id',
  `cuname` varchar(100) DEFAULT NULL COMMENT '定制单位名称',
  `associatedname` varchar(100) DEFAULT NULL COMMENT '关联物品名称',
  PRIMARY KEY (`cuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `custompackge` */

/*Table structure for table `dictionary` */

DROP TABLE IF EXISTS `dictionary`;

CREATE TABLE `dictionary` (
  `did` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `dname` varchar(50) DEFAULT NULL COMMENT '名称',
  `dtype` varchar(10) DEFAULT NULL COMMENT '类型(Cs/Jy/ry/wx/jszh/js/dz)',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dictionary` */

/*Table structure for table `driver` */

DROP TABLE IF EXISTS `driver`;

CREATE TABLE `driver` (
  `drvid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `drvname` varchar(20) DEFAULT NULL COMMENT '姓名',
  `drvsex` enum('男','女') DEFAULT NULL COMMENT '性别',
  `drvcardnumber` char(18) DEFAULT NULL COMMENT '身份证号',
  `drivingtype` varchar(20) DEFAULT NULL COMMENT '驾照类型',
  `drivingyears` int(11) DEFAULT NULL COMMENT '驾龄',
  `drvphone` char(11) DEFAULT NULL COMMENT '联系电话',
  `drvisenable` char(2) DEFAULT NULL COMMENT '是否启用',
  `drvaddress` varchar(100) DEFAULT NULL COMMENT '联系地址',
  `drvremark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `vid` int(11) DEFAULT NULL COMMENT '车辆id',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`drvid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `driver` */

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `eid` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `ename` varchar(50) DEFAULT NULL COMMENT '姓名',
  `esex` enum('男','女') DEFAULT NULL COMMENT '性别',
  `wid` int(11) DEFAULT NULL COMMENT '所在站点',
  `entrydate` date DEFAULT NULL COMMENT '入职日期',
  `birthdate` date DEFAULT NULL COMMENT '出生日期',
  `eaddress` varchar(50) DEFAULT NULL COMMENT '联系地址',
  `ecardnumber` char(18) DEFAULT NULL COMMENT '身份证号',
  `epassword` char(6) DEFAULT NULL COMMENT '密码(身份证号后6位)',
  `ephone` char(11) NOT NULL COMMENT '联系电话',
  `isenable` char(2) DEFAULT NULL COMMENT '是否启用',
  `eremark` varchar(100) DEFAULT NULL COMMENT '备注',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

/*Table structure for table `loadingstart` */

DROP TABLE IF EXISTS `loadingstart`;

CREATE TABLE `loadingstart` (
  `loadid` int(11) NOT NULL AUTO_INCREMENT,
  `loadingstarttime` date DEFAULT NULL,
  `destinationnetwork` varchar(20) DEFAULT NULL,
  `wid` int(11) DEFAULT NULL,
  `waytonetwork` varchar(20) DEFAULT NULL,
  `vnumber` varchar(20) DEFAULT NULL,
  `driverid` int(11) DEFAULT NULL,
  `drivername` varchar(10) DEFAULT NULL,
  `phone` char(11) DEFAULT NULL,
  `carrierfee` decimal(7,2) DEFAULT NULL,
  `spotpayment` decimal(7,2) DEFAULT NULL,
  `owetopay` decimal(7,2) DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  `startstatus` int(11) DEFAULT NULL,
  `int0` int(11) DEFAULT NULL,
  `string0` varchar(500) DEFAULT NULL,
  `string1` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`loadid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `loadingstart` */

/*Table structure for table `maintenance` */

DROP TABLE IF EXISTS `maintenance`;

CREATE TABLE `maintenance` (
  `maid` int(11) NOT NULL AUTO_INCREMENT COMMENT '维修保养登记id',
  `maintenancetime` date DEFAULT NULL COMMENT '维修时间',
  `driverid` int(11) DEFAULT NULL COMMENT '驾驶员id',
  `vehiclenumber` varchar(30) DEFAULT NULL COMMENT '维修车辆车牌号',
  `drviername` varchar(30) DEFAULT NULL COMMENT '驾驶员',
  `dictionaryid` int(11) DEFAULT NULL COMMENT '维修站',
  `money` decimal(6,2) DEFAULT NULL COMMENT '金额',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `checkstatus` varchar(10) DEFAULT NULL COMMENT '结账状态',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`maid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `maintenance` */

/*Table structure for table `makecargo` */

DROP TABLE IF EXISTS `makecargo`;

CREATE TABLE `makecargo` (
  `makecargoid` varchar(50) NOT NULL COMMENT '接货单号',
  `makecartime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '接货时间',
  `vnumber` varchar(50) DEFAULT NULL COMMENT '车牌号',
  `driverid` int(11) DEFAULT NULL COMMENT '驾驶员id',
  `drivername` varchar(20) DEFAULT NULL COMMENT '驾驶员',
  `receivingfee` decimal(5,2) DEFAULT NULL COMMENT '接货费',
  `spotpayment` decimal(5,2) DEFAULT NULL COMMENT '现付',
  `owetopay` decimal(5,2) DEFAULT NULL COMMENT '欠付',
  `preregistrationid` varchar(50) DEFAULT NULL COMMENT '预约登记单号',
  `operator` varchar(20) DEFAULT NULL COMMENT '操作员(登录人名称)',
  `mremark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `confirmstatus` int(11) DEFAULT NULL COMMENT '确认验货',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`makecargoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `makecargo` */

/*Table structure for table `module` */

DROP TABLE IF EXISTS `module`;

CREATE TABLE `module` (
  `mid` int(11) NOT NULL AUTO_INCREMENT COMMENT '模块id',
  `modulename` varchar(50) DEFAULT NULL COMMENT '模块名称',
  `parentId` int(11) DEFAULT '0' COMMENT '父id',
  `moduleurl` varchar(100) DEFAULT NULL COMMENT '模块路径',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  `pic` varchar(50) DEFAULT NULL COMMENT '模块图片',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `module` */

/*Table structure for table `module_user` */

DROP TABLE IF EXISTS `module_user`;

CREATE TABLE `module_user` (
  `muid` int(11) NOT NULL AUTO_INCREMENT COMMENT '模块用户id',
  `mid` int(11) DEFAULT NULL COMMENT '模块id',
  `eid` int(11) DEFAULT NULL COMMENT '员工id',
  PRIMARY KEY (`muid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `module_user` */

/*Table structure for table `orderstatus` */

DROP TABLE IF EXISTS `orderstatus`;

CREATE TABLE `orderstatus` (
  `oid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `consignid` int(11) DEFAULT NULL COMMENT '订单状态id',
  `description` varchar(200) DEFAULT NULL COMMENT '状态描述',
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orderstatus` */

/*Table structure for table `originaltype` */

DROP TABLE IF EXISTS `originaltype`;

CREATE TABLE `originaltype` (
  `oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '原包装类型Id',
  `otypename` varchar(100) DEFAULT NULL COMMENT '基本单位名称',
  `otype` varchar(100) DEFAULT NULL COMMENT '类别',
  `oenglishname` varchar(100) DEFAULT NULL COMMENT '类别英文定义(kg/方/件)',
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `originaltype` */

/*Table structure for table `preregistration` */

DROP TABLE IF EXISTS `preregistration`;

CREATE TABLE `preregistration` (
  `preid` varchar(50) NOT NULL COMMENT '预约单号',
  `destination` varchar(50) DEFAULT NULL COMMENT '目的地',
  `pretime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间',
  `pid` int(11) DEFAULT NULL COMMENT '商品id',
  `sid` int(11) DEFAULT NULL COMMENT '发货人id',
  `conid` int(11) DEFAULT NULL COMMENT '收货人id',
  `receivestatus` int(11) DEFAULT NULL COMMENT '0上门接货,1不上门接货',
  `receivetime` date DEFAULT NULL COMMENT '上门接货时间',
  `sendstatus` int(11) DEFAULT NULL COMMENT '0自送1不自送',
  `sendtime` date DEFAULT NULL COMMENT '自送时间',
  `preaddress` varchar(100) DEFAULT NULL COMMENT '地址',
  `preremark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `transporttype` int(11) DEFAULT NULL COMMENT '货物运输类型0零担运输1整车运输',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`preid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `preregistration` */

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品Id',
  `pname` varchar(20) DEFAULT NULL COMMENT '货物品名',
  `oid` int(11) DEFAULT NULL COMMENT '包装类型id',
  `number` int(11) DEFAULT NULL COMMENT '件数',
  `weight` int(11) DEFAULT NULL COMMENT '重量',
  `volumn` int(11) DEFAULT NULL COMMENT '体积',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product` */

/*Table structure for table `receivecomplete` */

DROP TABLE IF EXISTS `receivecomplete`;

CREATE TABLE `receivecomplete` (
  `rcompleteid` varchar(30) NOT NULL COMMENT '接货完成单据号',
  `status` int(11) DEFAULT NULL COMMENT '接货是否完成/0否1是',
  `completetime` date DEFAULT NULL COMMENT '接货完成时间',
  PRIMARY KEY (`rcompleteid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `receivecomplete` */

/*Table structure for table `receivenote` */

DROP TABLE IF EXISTS `receivenote`;

CREATE TABLE `receivenote` (
  `recid` int(11) NOT NULL AUTO_INCREMENT COMMENT '收货单Id',
  `pid` int(11) DEFAULT NULL COMMENT '商品id',
  `sid` int(11) DEFAULT NULL COMMENT '发货方id',
  `conid` int(11) DEFAULT NULL COMMENT '收货人id',
  PRIMARY KEY (`recid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `receivenote` */

/*Table structure for table `refuelregister` */

DROP TABLE IF EXISTS `refuelregister`;

CREATE TABLE `refuelregister` (
  `reid` int(11) NOT NULL AUTO_INCREMENT COMMENT '加油登记Id',
  `driverid` int(11) DEFAULT NULL COMMENT '驾驶员id',
  `refueltime` date DEFAULT NULL COMMENT '加油时间',
  `vehiclenumber` varchar(30) DEFAULT NULL COMMENT '加油车牌号',
  `drviername` varchar(20) DEFAULT NULL COMMENT '驾驶员',
  `dictionaryid` int(11) DEFAULT NULL COMMENT '燃油类型id',
  `petrolstation` varchar(25) DEFAULT NULL COMMENT '加油站',
  `unitprice` decimal(5,2) DEFAULT NULL COMMENT '单价',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `money` decimal(6,2) DEFAULT NULL COMMENT '金额',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `ckeckstatus` varchar(10) DEFAULT NULL COMMENT '结账状态',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`reid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `refuelregister` */

/*Table structure for table `secondarypackage` */

DROP TABLE IF EXISTS `secondarypackage`;

CREATE TABLE `secondarypackage` (
  `secid` int(11) NOT NULL AUTO_INCREMENT COMMENT '二次包装Id',
  `secname` varchar(100) DEFAULT NULL COMMENT '二次包装名称',
  `secrule` varchar(100) DEFAULT NULL COMMENT '二次包装规则',
  `secdescription` varchar(200) DEFAULT NULL COMMENT '二次包装描述',
  `secweight` double DEFAULT NULL COMMENT '重量',
  `measureunit` varchar(10) DEFAULT NULL COMMENT '计量单位',
  `seclength` double DEFAULT NULL COMMENT '长',
  `secwidth` double DEFAULT NULL COMMENT '宽',
  `sechigh` double DEFAULT NULL COMMENT '高',
  `volumn` double DEFAULT NULL COMMENT '体积',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`secid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `secondarypackage` */

/*Table structure for table `sendsign` */

DROP TABLE IF EXISTS `sendsign`;

CREATE TABLE `sendsign` (
  `signid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `consignid` varchar(30) DEFAULT NULL COMMENT '托运单ID',
  `signstatus` int(11) DEFAULT NULL COMMENT '0签收1已签收',
  `receiptstatus` int(11) DEFAULT NULL COMMENT '0回单未寄送1回单已寄送',
  PRIMARY KEY (`signid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sendsign` */

/*Table structure for table `shipper` */

DROP TABLE IF EXISTS `shipper`;

CREATE TABLE `shipper` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '发货方Id',
  `sname` varchar(50) DEFAULT NULL COMMENT '发货人名称',
  `companyname` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `stelephone` char(8) DEFAULT NULL COMMENT '联系电话',
  `sfax` varchar(50) DEFAULT NULL COMMENT '联系传真',
  `sphone` char(11) DEFAULT NULL COMMENT '手机号',
  `email` varchar(32) DEFAULT NULL COMMENT '电子邮件',
  `qqormsn` varchar(30) DEFAULT NULL COMMENT 'QQ/MSN',
  `earlyaccount` decimal(10,2) DEFAULT NULL COMMENT '初期应收',
  `saddress` varchar(50) DEFAULT NULL COMMENT '联系地址',
  `sremark` varchar(100) DEFAULT NULL COMMENT '备注',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shipper` */

/*Table structure for table `storage` */

DROP TABLE IF EXISTS `storage`;

CREATE TABLE `storage` (
  `stid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `rcompleteid` varchar(30) DEFAULT NULL COMMENT '接货完成单据号',
  `wid` int(11) DEFAULT NULL COMMENT '仓库id',
  `arrivaltime` date DEFAULT NULL COMMENT '到货时间',
  `status` char(5) DEFAULT NULL COMMENT '完成/已完成(收货)',
  PRIMARY KEY (`stid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storage` */

/*Table structure for table `storagearea` */

DROP TABLE IF EXISTS `storagearea`;

CREATE TABLE `storagearea` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '备货区Id',
  `snumber` varchar(20) DEFAULT NULL COMMENT '备货区编号',
  `areaname` varchar(50) DEFAULT NULL COMMENT '备货名称',
  `creationdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `wid` int(11) DEFAULT NULL COMMENT '仓库id',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storagearea` */

/*Table structure for table `systemsetup ` */

DROP TABLE IF EXISTS `systemsetup `;

CREATE TABLE `systemsetup ` (
  `systemid` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统设置id',
  `msgtoconsignee` int(11) DEFAULT '0' COMMENT '到货发短信给收货人',
  `msgtoshipper` int(11) DEFAULT '0' COMMENT '到货签收发短信给发货人',
  `picktoshipper` int(11) DEFAULT '0' COMMENT '提货发短信给发货人',
  `aogid` char(4) DEFAULT 'DE' COMMENT '到货派送单号前缀',
  `appointmentid` char(4) DEFAULT 'XT' COMMENT '预约单号',
  `makecargoid` char(4) DEFAULT 'PI' COMMENT '接货单号',
  `consignid` char(4) DEFAULT 'YD' COMMENT '托运单号',
  `year` char(4) DEFAULT NULL COMMENT '年',
  `month` char(2) DEFAULT NULL COMMENT '月',
  `day` char(2) DEFAULT NULL COMMENT '日',
  `joinmark` char(2) DEFAULT NULL COMMENT '连接符号（只留有该连接字符,不可更改）',
  `numberlength` int(11) DEFAULT NULL COMMENT '流水号长度',
  `id` int(11) DEFAULT NULL COMMENT '员工id',
  `msgsleft` int(11) DEFAULT NULL COMMENT '短信剩余条数',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`systemid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `systemsetup ` */

insert  into `systemsetup `(`systemid`,`msgtoconsignee`,`msgtoshipper`,`picktoshipper`,`aogid`,`appointmentid`,`makecargoid`,`consignid`,`year`,`month`,`day`,`joinmark`,`numberlength`,`id`,`msgsleft`,`int0`,`string0`,`string1`) values (1,0,0,0,'DE','XT','PI','YD',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,0,0,0,'DE','XT','PI','YD',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,0,0,0,'DE','XT','PI','YD',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `vehicle` */

DROP TABLE IF EXISTS `vehicle`;

CREATE TABLE `vehicle` (
  `vid` int(11) NOT NULL AUTO_INCREMENT COMMENT '车辆Id',
  `vnumber` varchar(50) DEFAULT NULL COMMENT '车牌号',
  `vehiclenature` varchar(50) DEFAULT NULL COMMENT '车辆性质',
  `brandmodel` varchar(50) DEFAULT NULL COMMENT '品牌型号',
  `enginenumber` year(4) DEFAULT NULL COMMENT '发动机号',
  `load` int(11) DEFAULT NULL COMMENT '载重',
  `vlength` varchar(20) DEFAULT NULL COMMENT '车长',
  `vphone` char(11) DEFAULT NULL COMMENT '电话',
  `registrationtime` date DEFAULT NULL COMMENT '上牌时间',
  `vaddress` varchar(200) DEFAULT NULL COMMENT '联系地址',
  `visenable` date DEFAULT NULL COMMENT '是否启用',
  `vremark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vehicle` */

/*Table structure for table `vehicletrack` */

DROP TABLE IF EXISTS `vehicletrack`;

CREATE TABLE `vehicletrack` (
  `vehicletrackid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `vehicleid` int(11) DEFAULT NULL COMMENT '车辆id',
  `consignid` varchar(30) DEFAULT NULL COMMENT '运单id',
  `currentposition` varchar(30) DEFAULT NULL COMMENT '当前位置',
  PRIMARY KEY (`vehicletrackid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vehicletrack` */

/*Table structure for table `warehouse` */

DROP TABLE IF EXISTS `warehouse`;

CREATE TABLE `warehouse` (
  `wid` int(11) NOT NULL AUTO_INCREMENT COMMENT '仓库Id',
  `Warehousename` varchar(50) DEFAULT NULL COMMENT '站点名称',
  `cityid` int(11) DEFAULT NULL COMMENT '所属城市',
  `telephone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `fax` varchar(50) DEFAULT NULL COMMENT '传真',
  `phone` char(11) DEFAULT NULL COMMENT '手机号',
  `username` varchar(20) DEFAULT NULL COMMENT '负责联系人',
  `address` varchar(50) DEFAULT NULL COMMENT '联系地址',
  `wremark` varchar(100) DEFAULT NULL COMMENT '备注',
  `creationdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `int0` int(11) DEFAULT NULL COMMENT '预留整型',
  `string0` varchar(500) DEFAULT NULL COMMENT '预留字符串1',
  `string1` varchar(1000) DEFAULT NULL COMMENT '预留字符串2',
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `warehouse` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
