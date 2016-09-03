-- MySQL dump 10.13  Distrib 5.5.20, for Win32 (x86)
--
-- Host: localhost    Database: hmis
-- ------------------------------------------------------
-- Server version	5.5.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `ID` bigint(20) NOT NULL,
  `DTYPE` varchar(31) DEFAULT NULL,
  `CREATEDAT` datetime DEFAULT NULL,
  `DEPARTMENTTYPE` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `RETIRECOMMENTS` varchar(255) DEFAULT NULL,
  `RETIRED` tinyint(1) DEFAULT '0',
  `RETIREDAT` datetime DEFAULT NULL,
  `SNAME` varchar(255) DEFAULT NULL,
  `TNAME` varchar(255) DEFAULT NULL,
  `CREATER_ID` bigint(20) DEFAULT NULL,
  `INSTITUTION_ID` bigint(20) DEFAULT NULL,
  `LABDEPARTMENT_ID` bigint(20) DEFAULT NULL,
  `LABINSTITUTION_ID` bigint(20) DEFAULT NULL,
  `RETIRER_ID` bigint(20) DEFAULT NULL,
  `SAMPLEDEPARTMENT_ID` bigint(20) DEFAULT NULL,
  `SAMPLEINSTITUTION_ID` bigint(20) DEFAULT NULL,
  `SUPERDEPARTMENT_ID` bigint(20) DEFAULT NULL,
  `DEPARTMENTCODE` varchar(255) DEFAULT NULL,
  `MAXDISCOUNT` double DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `FAX` varchar(255) DEFAULT NULL,
  `PRINTINGNAME` varchar(255) DEFAULT NULL,
  `TELEPHONE1` varchar(255) DEFAULT NULL,
  `TELEPHONE2` varchar(255) DEFAULT NULL,
  `MARGIN` double DEFAULT NULL,
  `PHARMACYMARGINFROMPURCHASERATE` double DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DEPARTMENT_SAMPLEINSTITUTION_ID` (`SAMPLEINSTITUTION_ID`),
  KEY `FK_DEPARTMENT_SAMPLEDEPARTMENT_ID` (`SAMPLEDEPARTMENT_ID`),
  KEY `FK_DEPARTMENT_LABDEPARTMENT_ID` (`LABDEPARTMENT_ID`),
  KEY `FK_DEPARTMENT_LABINSTITUTION_ID` (`LABINSTITUTION_ID`),
  KEY `FK_DEPARTMENT_SUPERDEPARTMENT_ID` (`SUPERDEPARTMENT_ID`),
  KEY `FK_DEPARTMENT_INSTITUTION_ID` (`INSTITUTION_ID`),
  KEY `FK_DEPARTMENT_RETIRER_ID` (`RETIRER_ID`),
  KEY `FK_DEPARTMENT_CREATER_ID` (`CREATER_ID`),
  KEY `department_PRINTINGNAME_idx` (`PRINTINGNAME`),
  CONSTRAINT `FK_DEPARTMENT_CREATER_ID` FOREIGN KEY (`CREATER_ID`) REFERENCES `webuser` (`ID`),
  CONSTRAINT `FK_DEPARTMENT_INSTITUTION_ID` FOREIGN KEY (`INSTITUTION_ID`) REFERENCES `institution` (`ID`),
  CONSTRAINT `FK_DEPARTMENT_LABDEPARTMENT_ID` FOREIGN KEY (`LABDEPARTMENT_ID`) REFERENCES `department` (`ID`),
  CONSTRAINT `FK_DEPARTMENT_LABINSTITUTION_ID` FOREIGN KEY (`LABINSTITUTION_ID`) REFERENCES `institution` (`ID`),
  CONSTRAINT `FK_DEPARTMENT_RETIRER_ID` FOREIGN KEY (`RETIRER_ID`) REFERENCES `webuser` (`ID`),
  CONSTRAINT `FK_DEPARTMENT_SAMPLEDEPARTMENT_ID` FOREIGN KEY (`SAMPLEDEPARTMENT_ID`) REFERENCES `department` (`ID`),
  CONSTRAINT `FK_DEPARTMENT_SAMPLEINSTITUTION_ID` FOREIGN KEY (`SAMPLEINSTITUTION_ID`) REFERENCES `institution` (`ID`),
  CONSTRAINT `FK_DEPARTMENT_SUPERDEPARTMENT_ID` FOREIGN KEY (`SUPERDEPARTMENT_ID`) REFERENCES `department` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (101,'Department','2013-06-25 22:48:29',NULL,'Cashier',NULL,0,NULL,NULL,NULL,5,5764,NULL,NULL,NULL,NULL,NULL,NULL,'CA',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(151,'Department','2013-06-25 23:13:19',NULL,'Andrology Lab',NULL,0,NULL,NULL,NULL,5,5764,NULL,NULL,NULL,NULL,NULL,NULL,'AN',20,'','','','Andrology Lab','','',NULL,0,NULL),(168,'Department','2013-06-25 23:21:22','Lab','Pathology Lab',NULL,0,NULL,NULL,NULL,5,15951,NULL,NULL,NULL,NULL,NULL,NULL,'LA',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(169,'Department','2013-06-25 23:21:30',NULL,'Office',NULL,0,NULL,NULL,NULL,5,5764,NULL,NULL,NULL,NULL,NULL,NULL,'OF',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(170,'Department','2013-06-25 23:21:40','Pharmacy','Pharmacy',NULL,0,NULL,NULL,NULL,5,5764,NULL,NULL,NULL,NULL,NULL,NULL,'RHPH',20,'','','','','','',NULL,NULL,NULL),(2252,'Department','2013-06-27 10:00:42',NULL,'Checking',NULL,1,'2013-07-31 10:42:27',NULL,NULL,171,5764,NULL,NULL,3216,NULL,NULL,NULL,'Ch',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2265,'Department','2013-06-27 14:22:40',NULL,'11',NULL,1,'2013-06-27 14:23:15',NULL,NULL,171,2264,NULL,NULL,171,NULL,NULL,NULL,'2',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2267,'Department','2013-06-27 14:26:58',NULL,'pp2',NULL,1,'2013-06-27 14:27:21',NULL,NULL,171,NULL,NULL,NULL,171,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2268,'Department','2013-06-27 14:37:07',NULL,'22',NULL,1,'2013-06-27 14:37:27',NULL,NULL,171,NULL,NULL,NULL,171,NULL,NULL,NULL,'22',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4451,'Department','2013-07-03 18:24:55','Store','A',NULL,1,'2013-07-15 16:13:18',NULL,NULL,3151,2281,NULL,NULL,3216,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4501,'Department','2013-07-03 18:27:31','Lab','TestDep2',NULL,1,'2013-07-31 10:42:22',NULL,NULL,3151,5764,NULL,NULL,3216,NULL,NULL,NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7801,'Department','2013-07-11 11:37:48',NULL,'Radiology',NULL,0,NULL,NULL,NULL,3452,5764,NULL,NULL,NULL,NULL,NULL,NULL,'RAD',20,'','','','','','',NULL,NULL,NULL),(8039,'Department','2013-07-11 15:48:20',NULL,'City Lab ',NULL,1,'2013-09-20 10:24:34',NULL,NULL,3151,15951,NULL,NULL,3216,NULL,NULL,NULL,'4000',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14638,'Department','2013-07-26 11:06:11',NULL,'OPD',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'PD',20,'','','','OPD','','',NULL,NULL,NULL),(14639,'Department','2013-07-26 11:07:55',NULL,'ICU',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'ICU',20,'','','','ICU','','',NULL,NULL,NULL),(14876,'Department','2013-07-26 15:01:52',NULL,'Channel',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'CH',20,'','','','Channel','','',NULL,NULL,NULL),(27595,'Department','2013-08-03 12:15:04',NULL,'Theatre',NULL,0,NULL,NULL,NULL,19051,5764,NULL,NULL,NULL,NULL,NULL,NULL,'TH',20,'','','','Theatre','','',NULL,NULL,NULL),(51901,'Department','2013-08-22 10:58:02',NULL,'12 (D/Syringe 5 CC (Nipro)',NULL,1,'2013-08-22 12:09:40',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'6200',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51902,'Department','2013-08-22 10:58:42',NULL,'Audiogram',NULL,0,NULL,NULL,NULL,3469,5764,NULL,NULL,NULL,NULL,NULL,NULL,'AU',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51903,'Department','2013-08-22 10:59:31',NULL,'CTG',NULL,1,'2013-08-22 12:34:50',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'6400',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51904,'Department','2013-08-22 11:00:04',NULL,'Dietary Management',NULL,1,'2013-08-22 12:36:43',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'6500',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51905,'Department','2013-08-22 11:00:46',NULL,'Doppler Scanning (P K)',NULL,1,'2013-08-22 12:10:02',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'6600',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51906,'Department','2013-08-22 11:01:10',NULL,'Doppler Scanning (P L K)',NULL,1,'2013-08-22 12:10:06',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'6700',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51907,'Department','2013-08-22 11:02:10',NULL,'Doppler Scanning (R U)',NULL,1,'2013-08-22 12:10:11',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'6800',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51908,'Department','2013-08-22 11:02:42',NULL,'Doppler Scanning (S I)',NULL,1,'2013-08-22 12:10:27',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'6900',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51909,'Department','2013-08-22 11:03:26',NULL,'Doppler Scanning (S T L)',NULL,1,'2013-08-22 12:10:33',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'7100',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51910,'Department','2013-08-22 11:04:02',NULL,'Dressing (219A) & Suture Materials ',NULL,1,'2013-08-22 12:10:38',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'7200',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51911,'Department','2013-08-22 11:05:01',NULL,'Dressing (Orthopaedic)',NULL,1,'2013-08-22 12:10:49',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'7300',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51912,'Department','2013-08-22 11:05:28',NULL,'E.E.G. ',NULL,1,'2013-08-22 12:11:03',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'7400',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51913,'Department','2013-08-22 11:05:57',NULL,'EEG',NULL,0,NULL,NULL,NULL,3469,5764,NULL,NULL,NULL,NULL,NULL,NULL,'EEG',20,'','','','','','',NULL,NULL,NULL),(51914,'Department','2013-08-22 11:06:22',NULL,'Echo',NULL,0,NULL,NULL,NULL,3469,5764,NULL,NULL,NULL,NULL,NULL,NULL,'EC',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51915,'Department','2013-08-22 11:06:54',NULL,'Exercise E.C.G.',NULL,0,NULL,NULL,NULL,3469,5764,NULL,NULL,NULL,NULL,NULL,NULL,'EX',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51916,'Department','2013-08-22 11:07:25',NULL,'Immunization',NULL,1,'2013-09-20 10:25:36',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'7800',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51917,'Department','2013-08-22 11:08:08',NULL,'M.S.L.T.',NULL,1,'2013-08-22 12:35:30',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'7900',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51918,'Department','2013-08-22 11:08:40',NULL,'Mammogram Reading',NULL,1,'2013-08-22 12:39:20',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51919,'Department','2013-08-22 11:09:10',NULL,'Meal Charges',NULL,1,'2013-08-22 12:35:05',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8100',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51920,'Department','2013-08-22 11:09:36',NULL,'Meals-staff',NULL,1,'2013-08-22 12:12:59',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8200',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51921,'Department','2013-08-22 11:09:59',NULL,'Occupational Therapy',NULL,1,'2013-08-22 12:39:11',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8300',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51922,'Department','2013-08-22 11:10:25',NULL,'OPD Income',NULL,1,'2013-08-22 12:11:33',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8400',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51923,'Department','2013-08-22 11:10:55',NULL,'OPD Income',NULL,1,'2013-08-22 12:12:04',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8500',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51924,'Department','2013-08-22 11:11:17',NULL,'OPD Income Night',NULL,1,'2013-08-22 12:12:10',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8600',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51925,'Department','2013-08-22 11:11:42',NULL,'OPD Income Night Suture Materials ',NULL,1,'2013-08-22 12:12:16',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8700',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51926,'Department','2013-08-22 11:12:21',NULL,'OPD Income Suture Materials ',NULL,1,'2013-08-22 12:12:24',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8800',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51927,'Department','2013-08-22 11:13:00',NULL,'Traction Bed',NULL,1,'2013-08-22 12:35:12',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'8900',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51928,'Department','2013-08-22 11:14:04',NULL,'TV Scan',NULL,1,'2013-08-22 12:12:35',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'9100',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51929,'Department','2013-08-22 11:14:28',NULL,'Ultra Sound Scan',NULL,1,'2013-08-22 12:11:41',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'9200',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51930,'Department','2013-08-22 11:15:21',NULL,'X-RAY READING',NULL,1,'2013-08-22 12:10:23',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'9300',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51936,'Department','2013-08-22 12:16:51',NULL,'Dressing (219A) & Suture Materials ',NULL,1,'2013-08-22 12:36:47',NULL,NULL,3469,5764,NULL,NULL,3216,NULL,NULL,NULL,'9400',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(52379,'Department','2013-08-24 11:53:10','Opd','E.C.G',NULL,1,'2013-09-20 10:24:46',NULL,NULL,3216,5764,NULL,NULL,3216,NULL,NULL,NULL,'700',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(55240,'Department','2013-08-31 14:40:56',NULL,'E.T.U',NULL,1,'2013-09-20 11:03:02',NULL,NULL,3216,NULL,NULL,NULL,3216,NULL,NULL,NULL,'11100',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(59061,'Department','2013-09-05 10:58:47',NULL,'Kitchen',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'KT',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(60997,'Department','2013-09-07 13:22:45',NULL,'Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'SW',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(67503,'Department','2013-09-20 10:29:22',NULL,'General Stores',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'GS',20,'Karapitiya,Galle','info@ruhunuhospital.lk','091 2234061','Ruhunu Hospital (Pvt) Ltd','091 2234059-60','',NULL,NULL,NULL),(67505,'Department','2013-09-20 10:35:46',NULL,'Nawaloka Metropolis',NULL,0,NULL,NULL,NULL,3216,15951,NULL,NULL,NULL,NULL,NULL,NULL,'NLM',20,'','','','Nawaloka Metropolis','','',NULL,15,NULL),(67621,'Department','2013-09-20 11:04:48',NULL,'Linen Room',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'LN',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(68923,'Department','2013-09-20 17:24:53',NULL,'First Floor',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'FR',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(68924,'Department','2013-09-20 17:25:48',NULL,'Second Floor',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'SF',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(68941,'Department','2013-09-21 16:10:49',NULL,'Dialysis',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'DL',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(68942,'Department','2013-09-21 16:12:32',NULL,'Front Office',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'FO',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(68943,'Department','2013-09-21 16:13:38',NULL,'Ambulance',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'AM',20,'','','','','','',NULL,15,NULL),(68944,'Department','2013-09-21 16:15:32',NULL,'Administration',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'AD',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(70034,'Department','2013-09-24 14:17:30',NULL,'Ward Bed',NULL,0,NULL,NULL,NULL,67555,5764,NULL,NULL,NULL,NULL,NULL,NULL,'WB',20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(77109,'Department','2013-10-11 15:39:49','Opd','Eye Checkup',NULL,0,NULL,NULL,NULL,67555,5764,NULL,NULL,NULL,NULL,NULL,NULL,'EY',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(77915,'Department','2013-10-19 11:52:34',NULL,'ETU',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'ETU',NULL,'','','','','','',NULL,NULL,NULL),(90348,'Department','2013-11-12 15:48:25',NULL,'Billing',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'BL',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(131443,'Department','2013-11-26 19:03:21','Lab','FNA(Pathology)',NULL,0,NULL,NULL,NULL,3151,15951,NULL,NULL,NULL,NULL,NULL,NULL,'pfnac',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(171543,'Department','2013-12-02 14:25:54','Lab','PapSmear(Pathology)',NULL,0,NULL,NULL,NULL,3216,15951,NULL,NULL,NULL,NULL,NULL,NULL,'paps',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(257223,'Department','2013-12-17 14:57:53','Lab','Path Lab',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'RPL',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(361575,'Department','2013-12-29 09:59:26','Pharmacy','219 A  Pharmacy',NULL,0,NULL,NULL,NULL,67555,5764,NULL,NULL,NULL,NULL,NULL,NULL,'RH219',NULL,'Karapitiya,Galle','','','219 A  Pharmacy','','',NULL,NULL,NULL),(390427,'Department','2013-12-31 13:05:16','Pharmacy','New Pharmacy',NULL,1,'2014-01-04 20:19:28',NULL,NULL,3216,83579,NULL,NULL,3151,NULL,NULL,NULL,'RPCS',NULL,'','','','','','',NULL,NULL,NULL),(419502,'Department','2014-01-04 20:18:24','Pharmacy','New Pharmacy',NULL,0,NULL,NULL,NULL,3151,83579,NULL,NULL,NULL,NULL,NULL,NULL,'RPS',NULL,'','','','Ruhunu Pharmaceuticals & Services (Pvt) Ltd','091 7212899','',NULL,NULL,NULL),(451639,'Department','2014-01-08 12:38:25','Pharmacy','Rasika',NULL,0,'2014-05-09 14:47:03',NULL,NULL,3151,451636,NULL,NULL,68933,NULL,NULL,NULL,'',NULL,'','','','','','',NULL,NULL,NULL),(889783,'Department','2014-02-22 11:50:15',NULL,'Fertility Center',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'FC',NULL,'','','','','','',NULL,NULL,NULL),(1143002,'Department','2014-03-19 12:39:31','Store','Store',NULL,0,NULL,NULL,NULL,3151,5764,NULL,NULL,NULL,NULL,NULL,NULL,'RHMS',NULL,'','','','Store','','',NULL,NULL,NULL),(1202402,'Department','2014-03-25 14:07:45',NULL,'One Day ',NULL,0,NULL,NULL,NULL,68933,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','One Day ','','',NULL,NULL,NULL),(1359512,'Department','2014-04-09 11:16:06',NULL,'Oxygen Unit ',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'OX',NULL,'','','','Oxygen Unit ','','',NULL,NULL,NULL),(1555702,'Department','2014-04-29 23:01:45',NULL,'testing Department',NULL,0,NULL,NULL,NULL,3151,523581,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','','','',NULL,NULL,NULL),(1571556,'Department','2014-05-01 00:51:31','Pharmacy','Error Department',NULL,1,'2014-05-09 14:47:19',NULL,NULL,3151,5764,NULL,NULL,68933,NULL,NULL,NULL,'RHMP',NULL,'Karapitiya,Galle','','','Ruhunu Hospital (Pvt)Ltd','','',NULL,NULL,NULL),(1641335,'Department','2014-05-01 07:44:26','Pharmacy','Main Pharmacy',NULL,0,NULL,NULL,NULL,3151,5764,NULL,NULL,NULL,NULL,NULL,NULL,'RHMP',NULL,'Karapitiya,Galle','','','Ruhunu Hospital (Pvt)Ltd','','',NULL,NULL,NULL),(1682800,'Department','2014-05-02 13:08:48','Pharmacy','Test Issueing',NULL,0,NULL,NULL,NULL,68933,1682767,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','','','',NULL,NULL,NULL),(1767223,'Department','2014-05-06 18:13:39',NULL,'ECG',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','ECG','','',0,0,NULL),(1767231,'Department','2014-05-06 18:14:02',NULL,'ECG (ICU)',NULL,0,NULL,NULL,NULL,3216,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','ECG (ICU)','','',0,0,NULL),(1767244,'Department','2014-05-06 18:15:04',NULL,'ECG (OPD)',NULL,0,NULL,NULL,NULL,3216,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','ECG (OPD)','','',0,0,NULL),(1767313,'Department','2014-05-06 18:15:59',NULL,'Immunization',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Immunization','','',0,0,NULL),(1767347,'Department','2014-05-06 18:16:19',NULL,'Larbour Room',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Larbour Room','','',0,0,NULL),(1767384,'Department','2014-05-06 18:16:38',NULL,'New Ambulance',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Ambulance','','',0,0,NULL),(1767447,'Department','2014-05-06 18:17:33',NULL,'Theatre Replacement',NULL,0,NULL,NULL,NULL,3216,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Theatre Replacement','','',0,0,NULL),(1767507,'Department','2014-05-06 18:20:28',NULL,'Roentgents',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'RG',NULL,'','','','Roentgents','','',0,15,NULL),(1767533,'Department','2014-05-06 18:20:55',NULL,'Suture Book (OPD)',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Suture Book (OPD)','','',0,15,NULL),(1767557,'Department','2014-05-06 18:22:21',NULL,'ICU Replacement',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','ICU Replacement','','',0,0,NULL),(1776399,'Department','2014-05-07 10:18:22',NULL,'Scanning Room',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'SR',NULL,'','','','Scanning Room','','',0,0,NULL),(1776556,'Department','2014-05-07 10:20:28',NULL,'New Channel Hall',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Channel Hall','','',0,15,NULL),(1776557,'Department','2014-05-07 10:21:12',NULL,'New Channel Hall Scanning',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Channel Hall Scanning','','',0,15,NULL),(2086871,'Department','2014-05-23 10:13:01','Pharmacy','New Pharmacy (Cashier)',NULL,0,NULL,NULL,NULL,68933,83579,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Pharmacy (Cashier)','','',0,0,NULL),(3805587,'Department','2014-07-24 17:09:02',NULL,'Prosthetics & Orthotics Center',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'POC',NULL,'','','','','','',0,0,NULL),(3974060,'Department','2014-08-01 11:14:02','Opd','Office',NULL,0,NULL,NULL,NULL,3216,83579,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','','','',0,0,NULL),(4516430,'Department','2014-08-30 10:46:05',NULL,'Dental Unit',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'DEN',NULL,'','','','Dental Unit','','',0,15,NULL),(5256349,'Department','2014-10-10 13:09:29',NULL,'Security',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'ST',NULL,'','','','Security Service','','',0,0,NULL),(5257562,'Department','2014-10-10 14:29:16',NULL,'219 A Channel',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','219 A Channel','','',0,0,NULL),(5257570,'Department','2014-10-10 14:37:35',NULL,'Consultant - Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'CNW',NULL,'','','','Consultant - Welfare','','',0,0,NULL),(5257596,'Department','2014-10-10 15:12:37',NULL,'Ward 1',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Ward 1','','',0,0,NULL),(5257598,'Department','2014-10-10 15:13:01',NULL,'Ward 2',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Ward 2','','',0,0,NULL),(5258402,'Department','2014-10-10 15:13:44',NULL,'Metron Office',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Metron Office','','',0,0,NULL),(5258407,'Department','2014-10-10 15:14:34',NULL,'ICU - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','ICU - Staff Welfare','','',0,0,NULL),(5258411,'Department','2014-10-10 15:15:06',NULL,'Attendant ',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','','','',0,0,NULL),(5258462,'Department','2014-10-10 15:17:52',NULL,'219 A Channel - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','219 A Channel - Staff Welfare','','',0,0,NULL),(5258463,'Department','2014-10-10 15:18:26',NULL,'219 A Reception - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','219 A Reception - Staff Welfare','','',0,0,NULL),(5258464,'Department','2014-10-10 15:19:14',NULL,'Maintain - Electrical',NULL,1,'2014-10-17 09:17:39',NULL,NULL,3216,5764,NULL,NULL,3227370,NULL,NULL,NULL,'',NULL,'','','','Maintain - Electrical','','',0,0,NULL),(5258465,'Department','2014-10-10 15:20:50',NULL,'2 nd Floor - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','2 nd Floor - Staff Welfare','','',0,0,NULL),(5258466,'Department','2014-10-10 15:21:23',NULL,'Andrology Lab - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Andrology Lab - Staff Welfare','','',0,0,NULL),(5258470,'Department','2014-10-10 15:21:50',NULL,'Attandant - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Attandant - Staff Welfare','','',0,0,NULL),(5258480,'Department','2014-10-10 15:24:17',NULL,'Cashier - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Cashier - Staff Welfare','','',0,0,NULL),(5258481,'Department','2014-10-10 15:24:53',NULL,'Channel - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Channel - Staff Welfare','','',0,0,NULL),(5258483,'Department','2014-10-10 15:25:30',NULL,'Dialysis Unit - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Dialysis Unit - Staff Welfare','','',0,0,NULL),(5258676,'Department','2014-10-10 15:26:33','Opd','OPD Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'PDS',NULL,'','','','OPD Staff Welfare','','',0,0,NULL),(5258786,'Department','2014-10-10 15:49:18',NULL,'Operation Theatre - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Operation Theatre - Staff Welfare','','',0,0,NULL),(5258787,'Department','2014-10-10 15:51:10',NULL,'Pharmacy - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Pharmacy - Staff Welfare','','',0,0,NULL),(5280755,'Department','2014-10-11 14:16:46',NULL,'219 A Generator Upkeep',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','219 A Generator Upkeep','','',0,0,NULL),(5356300,'Department','2014-10-15 16:57:32',NULL,'New Pharmacy - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,83579,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Pharmacy - Staff Welfare','','',0,0,NULL),(5387607,'Department','2014-10-17 09:08:36',NULL,'Maintain Painting',NULL,0,NULL,NULL,NULL,3227370,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Maintain - Painting','','',0,0,NULL),(5387611,'Department','2014-10-17 09:09:14',NULL,'Maintain Electrical',NULL,0,NULL,NULL,NULL,3227370,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Maintain - Electrical','','',0,0,NULL),(5387741,'Department','2014-10-17 09:14:17',NULL,'Maintency Section',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Maintency Section','','',0,0,NULL),(5387742,'Department','2014-10-17 09:15:59',NULL,'Doctor\'s Party 2014',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Doctor\'s Party 2014','','',0,0,NULL),(5387743,'Department','2014-10-17 09:16:28',NULL,'Room Rearrangement',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Room Rearrangement','','',0,0,NULL),(5387744,'Department','2014-10-17 09:18:07',NULL,'Channel Upkeep',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Channel Upkeep','','',0,0,NULL),(5387746,'Department','2014-10-17 09:18:58',NULL,'Miantance Garden',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Miantance - Garden','','',0,0,NULL),(5387747,'Department','2014-10-17 09:21:20',NULL,'New Building Project (ii)',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Building Project (ii)','','',0,0,NULL),(5387748,'Department','2014-10-17 09:22:34',NULL,'New Building Project (ii) - Electrical',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Building Project (ii) - Electrical','','',0,0,NULL),(5387749,'Department','2014-10-17 09:23:39',NULL,'New Building Project (ii) - Plumbing',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Building Project (ii) - Plumbing','','',0,0,NULL),(5391067,'Department','2014-10-17 12:24:37',NULL,'Computer Upkeep',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Computer Upkeep','','',0,0,NULL),(5391068,'Department','2014-10-17 12:32:14',NULL,'Repair & Maintance AC Machines',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Repair & Maintance AC Machines','','',0,0,NULL),(5492204,'Department','2014-10-23 11:49:43',NULL,'First Floor - Staff Welfare',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','First Floor - Staff Welfare','','',0,0,NULL),(5638121,'Department','2014-10-31 11:00:50','Pharmacy','219 A Pharmacy - Staff Welfare',NULL,0,NULL,NULL,NULL,3151,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','219 A Pharmacy - Staff Welfare','','',0,0,NULL),(5641736,'Department','2014-10-31 15:53:17',NULL,'219 A Counter',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','219 A Counter','','',0,0,NULL),(5736127,'Department','2014-11-04 16:57:59',NULL,'Cleaning Service (Sithumina)',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Cleaning Service (Sithumina)','','',0,0,NULL),(5853603,'Department','2014-11-11 09:44:17',NULL,'New Building Project (ii) - Painting',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Building Project (ii) - Painting','','',0,0,NULL),(5853650,'Department','2014-11-11 09:46:26',NULL,'New Building Project (ii) - Roof',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Building Project (ii) - Roof','','',0,0,NULL),(5855528,'Department','2014-11-11 10:52:58',NULL,'Maintance - Plumbing',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Maintance - Plumbing','','',0,0,NULL),(5857258,'Department','2014-11-11 11:50:30',NULL,'Generator Upkeep',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'Generator Upkeep',NULL,'','','','','','',0,0,NULL),(5857260,'Department','2014-11-11 11:51:01',NULL,'New Generator Upkeep',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'New Generator Upkeep',NULL,'','','','','','',0,0,NULL),(5934760,'Department','2014-11-14 12:11:57','Lab','Andrology Lab Rearrangement',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Andrology Lab Rearrangement','','',0,0,NULL),(5934776,'Department','2014-11-14 12:13:54',NULL,'Counter Rearrangement',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Counter Rearrangement','','',0,0,NULL),(6010179,'Department','2014-11-18 16:13:18','Inventry','Office Cupboard',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Office Cupboard','','',0,0,NULL),(6231777,'Department','2014-11-28 16:33:14',NULL,'Marketing & Advertising',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Marketing & Advertising','','',0,0,NULL),(6858696,'Department','2014-12-29 18:40:51',NULL,'Diabetic Center',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Diabetic Center','','',0,0,NULL),(6910403,'Department','2014-12-31 15:24:10',NULL,'New Oxygen Room',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','New Oxygen Room','','',0,0,NULL),(7239929,'Department','2015-01-17 11:30:05',NULL,'Maintance - Building',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Maintance - Building','','',0,0,NULL),(7340420,'Department','2015-01-22 16:27:49',NULL,'Maintance - Record Room',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,'','','','Maintance - Record Room','','',0,0,NULL),(7728713,'Department','2015-02-09 12:49:15',NULL,'Minor Staff',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'MNS',NULL,'','','','Minor Staff','','',0,0,NULL),(7728871,'Department','2015-02-09 12:50:02',NULL,'Minor Staff (Theatre)',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'MNST',NULL,'','','','Minor Staff (Theatre)','','',0,0,NULL),(7782376,'Department','2015-02-11 12:21:47',NULL,'Ambulance Repair (48-9090)',NULL,0,NULL,NULL,NULL,3216,5764,NULL,NULL,NULL,NULL,NULL,NULL,'AMBR48',NULL,'','','','Ambulance Repair (48-9090)','','',0,0,NULL);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-27  0:27:10