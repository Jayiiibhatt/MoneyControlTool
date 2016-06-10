-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.60-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema moneycontrolguide
--

CREATE DATABASE IF NOT EXISTS moneycontrolguide;
USE moneycontrolguide;

--
-- Definition of table `addcompany`
--

DROP TABLE IF EXISTS `addcompany`;
CREATE TABLE `addcompany` (
  `tinnumber` int(11) NOT NULL,
  `companyname` varchar(255) DEFAULT NULL,
  `companyissuename` varchar(255) DEFAULT NULL,
  `nominalvalue` int(11) DEFAULT NULL,
  `netsale` int(11) DEFAULT NULL,
  `netprofit` int(11) DEFAULT NULL,
  `netasset` int(11) DEFAULT NULL,
  PRIMARY KEY (`tinnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addcompany`
--

/*!40000 ALTER TABLE `addcompany` DISABLE KEYS */;
INSERT INTO `addcompany` (`tinnumber`,`companyname`,`companyissuename`,`nominalvalue`,`netsale`,`netprofit`,`netasset`) VALUES 
 (945129,'Indian Oil Corp','Indian Oil Corp',1110103,93,95,78),
 (1098453,'Wipro Ltd','Wipro Ltd',805158,87,89,81),
 (1334986,'Idea Cellular Ltd.','Idea Cellular Ltd.',4505886,85,89,79),
 (3407689,'HDFC Bank','HDFC',79245,72,77,67),
 (4500345,'Voltas Ltd.','Voltas Ltd.',1265871,77,79,66),
 (4509876,'Infosys','Infosys',27891,93,98,89),
 (4567809,'Reliance Inds.','Reliance',107927,98,99,95),
 (4568932,'ITC LTD','ITC',436948,95,96,88),
 (6000987,'TVS Motor Co. Ltd.','TVS Motor Co. Ltd.',1390857,88,90,65),
 (6785678,'IDFC L','IDFC L',10648160,93,95,89),
 (7845678,'Indiabulls Real Esta','Indiabulls Real Esta',7849285,98,100,95),
 (7888934,'Tata Power Co.','Tata Power Co.',6724126,78,85,45),
 (8804534,'GAIL (India) Ltd.','GAIL (India) Ltd.',1162825,90,93,89),
 (8975435,'Tata Consultancy','Tata Consultancy',60000,88,92,85),
 (9084356,'Sun Pharma','Sun Pharma',456741,96,100,92),
 (9876324,'Bharti Airtel','Bharti Airtel',198543,85,82,78);
/*!40000 ALTER TABLE `addcompany` ENABLE KEYS */;


--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `accessright` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`),
  KEY `FK586034FB7C683BB` (`admin_id`),
  CONSTRAINT `FK586034FB7C683BB` FOREIGN KEY (`admin_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`admin_id`,`accessright`) VALUES 
 (4,'jalsjieuwuoiw'),
 (5,''),
 (7,''),
 (8,'');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `assistant`
--

DROP TABLE IF EXISTS `assistant`;
CREATE TABLE `assistant` (
  `assistant_id` int(11) NOT NULL,
  `joining_date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`assistant_id`),
  KEY `FK553972DE99E9B5CC` (`assistant_id`),
  CONSTRAINT `FK553972DE99E9B5CC` FOREIGN KEY (`assistant_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assistant`
--

/*!40000 ALTER TABLE `assistant` DISABLE KEYS */;
INSERT INTO `assistant` (`assistant_id`,`joining_date`) VALUES 
 (9,'05/04/2016');
/*!40000 ALTER TABLE `assistant` ENABLE KEYS */;


--
-- Definition of table `companyrecord`
--

DROP TABLE IF EXISTS `companyrecord`;
CREATE TABLE `companyrecord` (
  `recordid` int(11) NOT NULL,
  `companyissuename` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `openingprice` int(11) DEFAULT NULL,
  `closingprice` int(11) DEFAULT NULL,
  `crchange` int(11) DEFAULT NULL,
  `growth` int(11) DEFAULT NULL,
  PRIMARY KEY (`recordid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `companyrecord`
--

/*!40000 ALTER TABLE `companyrecord` DISABLE KEYS */;
INSERT INTO `companyrecord` (`recordid`,`companyissuename`,`date`,`openingprice`,`closingprice`,`crchange`,`growth`) VALUES 
 (3,'Bharti Airtel','05-APR-2016',78,88,10,10),
 (4,'HDFC','06-APR-2016',77,88,11,11),
 (5,'HDFC','07-APR-2016',67,78,11,11),
 (7,'HDFC','07-APR-2016',89,92,3,3),
 (8,'Infosys','06-APR-2016',90,98,8,8),
 (9,'Infosys','07-APR-2016',76,89,13,13),
 (10,'Infosys','08-APR-2016',80,89,9,9),
 (12,'Reliance','05-APR-2016',65,88,23,23),
 (13,'Reliance','06-APR-2016',70,88,18,18),
 (14,'Reliance','07-APR-2016',87,88,1,1),
 (15,'ITC','05-APR-2016',65,78,13,13),
 (16,'ITC','06-APR-2016',69,78,9,9),
 (17,'ITC','07-APR-2016',71,78,7,7),
 (18,'Tata Consultancy','05-APR-2016',34,78,44,44),
 (19,'Tata Consultancy','06-APR-2016',67,78,11,11),
 (20,'Tata Consultancy','07-APR-2016',71,75,4,4),
 (21,'Sun Pharma','05-APR-2016',71,75,4,4),
 (22,'Sun Pharma','06-APR-2016',75,85,10,10),
 (23,'Sun Pharma','07-APR-2016',85,97,12,12),
 (24,'Bharti Airtel','06-APR-2016',85,97,12,12),
 (25,'Bharti Airtel','07-APR-2016',86,88,2,2),
 (26,'Bharti Airtel','03-APR-2016',8,9,1,1);
INSERT INTO `companyrecord` (`recordid`,`companyissuename`,`date`,`openingprice`,`closingprice`,`crchange`,`growth`) VALUES 
 (27,'TVS Motor Co. Ltd.','03-APR-2016',8,9,1,1),
 (28,'Indiabulls Real Esta','20-APR-2016',9,10,1,5),
 (56,'Voltas Ltd.','16-APR-2016',56,76,55,44);
/*!40000 ALTER TABLE `companyrecord` ENABLE KEYS */;


--
-- Definition of table `companyregister`
--

DROP TABLE IF EXISTS `companyregister`;
CREATE TABLE `companyregister` (
  `tinnumber` int(11) NOT NULL,
  `exname` varchar(255) NOT NULL,
  `ipoprice` double DEFAULT NULL,
  `registerdate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tinnumber`,`exname`),
  KEY `FKE7F19E204AF3C23F` (`exname`),
  KEY `FKE7F19E2074DC84B3` (`tinnumber`),
  CONSTRAINT `FKE7F19E204AF3C23F` FOREIGN KEY (`exname`) REFERENCES `exchangemaster` (`exname`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FKE7F19E2074DC84B3` FOREIGN KEY (`tinnumber`) REFERENCES `addcompany` (`tinnumber`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `companyregister`
--

/*!40000 ALTER TABLE `companyregister` DISABLE KEYS */;
INSERT INTO `companyregister` (`tinnumber`,`exname`,`ipoprice`,`registerdate`) VALUES 
 (1098453,'nse',90,'07-AUG-2010'),
 (1334986,'nse',78,'03-JUN-2010'),
 (3407689,'bse',94,'11-APR-2012'),
 (4500345,'nse',97,'09-APR-2011'),
 (4509876,'bse',98,'12-MAY-2011'),
 (4567809,'bse',88,'05-JAN-2011'),
 (4568932,'bse',88,'26-DEC-2010'),
 (4568932,'nse',98,'06-JUN-2013'),
 (6000987,'nse',85,'21-AUG-2009'),
 (7845678,'nse',95,'10-APR-2009'),
 (7888934,'nse',80,'01-SEP-2012'),
 (8804534,'nse',89,'02-FEB-2011'),
 (8975435,'bse',99,'15-JAN-2011'),
 (9084356,'bse',96,'05-FEB-2011'),
 (9876324,'bse',56,'07-FEB-2011');
/*!40000 ALTER TABLE `companyregister` ENABLE KEYS */;


--
-- Definition of table `exchangemaster`
--

DROP TABLE IF EXISTS `exchangemaster`;
CREATE TABLE `exchangemaster` (
  `exname` varchar(255) NOT NULL,
  `country` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `pinnumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`exname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exchangemaster`
--

/*!40000 ALTER TABLE `exchangemaster` DISABLE KEYS */;
INSERT INTO `exchangemaster` (`exname`,`country`,`city`,`state`,`street`,`district`,`pinnumber`) VALUES 
 ('BSC','India','Mumbai','Maharashtra','Mumbai','Maharashtra',340001),
 ('bse','in','v','g','c','b',39999),
 ('NSC','India','Mumbai','maharashtra','Mumbai','Maharashtra',340001),
 ('nse','hkj','kljl','kjhj','hkjjl','hjl',546);
/*!40000 ALTER TABLE `exchangemaster` ENABLE KEYS */;


--
-- Definition of table `exchangerecord`
--

DROP TABLE IF EXISTS `exchangerecord`;
CREATE TABLE `exchangerecord` (
  `exchangerecid` int(11) NOT NULL,
  `exname` varchar(255) DEFAULT NULL,
  `openingindex` int(11) DEFAULT NULL,
  `closingindex` int(11) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `mychange` double DEFAULT NULL,
  `exchangename` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`exchangerecid`),
  KEY `FK18779434ED0F0BAF` (`exchangename`),
  CONSTRAINT `FK18779434ED0F0BAF` FOREIGN KEY (`exchangename`) REFERENCES `exchangemaster` (`exname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exchangerecord`
--

/*!40000 ALTER TABLE `exchangerecord` DISABLE KEYS */;
INSERT INTO `exchangerecord` (`exchangerecid`,`exname`,`openingindex`,`closingindex`,`date`,`mychange`,`exchangename`) VALUES 
 (1,'BSC',67,78,'04-APR-2016',11,NULL),
 (2,'BSC',78,80,'05-APR-2016',2,NULL),
 (3,'NSC',87,95,'06-APR-2016',8,NULL),
 (4,'NSC',86,92,'05-APR-2016',6,NULL);
/*!40000 ALTER TABLE `exchangerecord` ENABLE KEYS */;


--
-- Definition of table `finance`
--

DROP TABLE IF EXISTS `finance`;
CREATE TABLE `finance` (
  `sfname` varchar(255) NOT NULL,
  `typename` varchar(255) NOT NULL,
  `companyname` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `pinnumber` int(11) DEFAULT NULL,
  `interestrate` int(11) DEFAULT NULL,
  `borrowamount` int(11) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `financialinstitutetype` varchar(255) DEFAULT NULL,
  `branchcode` varchar(255) DEFAULT NULL,
  `financeid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sfname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `finance`
--

/*!40000 ALTER TABLE `finance` DISABLE KEYS */;
INSERT INTO `finance` (`sfname`,`typename`,`companyname`,`country`,`city`,`state`,`street`,`district`,`date`,`pinnumber`,`interestrate`,`borrowamount`,`duration`,`financialinstitutetype`,`branchcode`,`financeid`) VALUES 
 ('aaa','bank','asu','i','i','i','i','i','18-MAR-2016',66,5,5,5,'Bank','45',NULL),
 ('mmm','bank','abc','india','vadodara','guj','hhh','vado','19-MAR-2016',39333,12,788999,3,'Bank','999',NULL),
 ('xxx','bank','Indian Oil Corp','India','v','gujarat','ch','vado','07-APR-2016',3900002,10,10,5,'Bank','365',NULL),
 ('xxxggggg','financialinstitute','Wipro Ltd','India','vggh','gujarat','ch','vado','07-APR-2016',3900002,10,10,5,'FinancialInstitute',NULL,'zxcvvv');
/*!40000 ALTER TABLE `finance` ENABLE KEYS */;


--
-- Definition of table `shareholder`
--

DROP TABLE IF EXISTS `shareholder`;
CREATE TABLE `shareholder` (
  `shareholder_id` int(11) NOT NULL,
  `dmat` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`shareholder_id`),
  KEY `FK27627A4B2E80DB3F` (`shareholder_id`),
  CONSTRAINT `FK27627A4B2E80DB3F` FOREIGN KEY (`shareholder_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shareholder`
--

/*!40000 ALTER TABLE `shareholder` DISABLE KEYS */;
INSERT INTO `shareholder` (`shareholder_id`,`dmat`) VALUES 
 (10,'6789543');
/*!40000 ALTER TABLE `shareholder` ENABLE KEYS */;


--
-- Definition of table `shareholdertransaction`
--

DROP TABLE IF EXISTS `shareholdertransaction`;
CREATE TABLE `shareholdertransaction` (
  `tinnumber` int(11) NOT NULL,
  `shareholder_id` int(11) NOT NULL,
  `transactionmode` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `numberofissue` int(11) DEFAULT NULL,
  `currentvalue` int(11) DEFAULT NULL,
  `netvalue` int(11) DEFAULT NULL,
  PRIMARY KEY (`tinnumber`,`shareholder_id`),
  KEY `FK30D98BB374DC84B3` (`tinnumber`),
  KEY `FK30D98BB3D9E75A75` (`shareholder_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shareholdertransaction`
--

/*!40000 ALTER TABLE `shareholdertransaction` DISABLE KEYS */;
INSERT INTO `shareholdertransaction` (`tinnumber`,`shareholder_id`,`transactionmode`,`date`,`numberofissue`,`currentvalue`,`netvalue`) VALUES 
 (1232,787877,'Purchase','18-MAR-2016',12,12,12),
 (9999,787877,'Selling','19-MAR-2016',6,52,45);
/*!40000 ALTER TABLE `shareholdertransaction` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `middle_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `pin_no` varchar(255) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `allow` int(11) DEFAULT '0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`,`username`,`first_name`,`middle_name`,`last_name`,`password`,`phone_no`,`country`,`state`,`district`,`street`,`city`,`gender`,`pin_no`,`date_of_birth`,`type`,`allow`) VALUES 
 (4,'jay.bhatt','jay','dharmendrakumar','bhatt','123','13234656','india','gujarat','vadodara','t.p13','vadodara','Male','390002','08-MAR-2016','Admin',1),
 (5,'Arpansinh','Arpansinh','Indrajitsinh','Solanki','12345','8866447572','India','Gujarat','Panchmahal','Dahod','Dahod','Male','36001','08-APR-1993','Admin',1),
 (7,'ronak.dave.65','Ronakkumar','Gopalprasad','Dave','12345','9558995949','India','Gujarat','Kheda','Wanakbori','Wanakbori','Male','388239','06-MAY-1993','Admin',1),
 (8,'Shihab.mansuri','Shihab','arifbhai','Mansuri','12345','7698128498','India','Gujarat','Kheda','Wanakbori','Wanakbori','Male','388239','11-NOV-1992','Admin',0),
 (9,'dave.assistant','Ronny','Gopalprasad','Dave','12345','9558995949','India','Gujarat','Kheda','Nadiad','Nadiad','Male','387001','06-MAY-1993','Assistant',1),
 (10,'sharma.shareholder','Jaimin','Rameshchandra','Sharma','12345','9888342897','India','Gujarat','Kheda','Nadiad','Nadiad','Male','387001','09-APR-1992','Shareholder',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
