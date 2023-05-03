-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: bankdb
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `banka`
--

DROP TABLE IF EXISTS `banka`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banka` (
  `M_No` varchar(15) DEFAULT NULL,
  `IslemNo` varchar(45) DEFAULT NULL,
  `Tarih` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banka`
--

LOCK TABLES `banka` WRITE;
/*!40000 ALTER TABLE `banka` DISABLE KEYS */;
INSERT INTO `banka` VALUES ('123456789','4','12.05.2022'),('123456789','4','12.05.2022'),('123456789','4','12.05.2022'),('123456789','1','12.05.2022'),('123456789','4','12.05.2022'),('123456789','2','12.05.2022'),('123456789','4','12.05.2022'),('123456789','3','12.05.2022'),('29','4','12.05.2022'),('29','2','12.05.2022'),('29','2','12.05.2022'),('29','2','12.05.2022'),('29','4','12.05.2022'),('29','5','12.05.2022'),('29','4','12.05.2022'),('29','4','12.05.2022'),('29','2','13.05.2022'),('29','1','13.05.2022'),('29','1','13.05.2022'),('29','4','13.05.2022'),('29','1','13.05.2022'),('29','4','13.05.2022'),('29','4','13.05.2022'),('29','1','13.05.2022'),('29','4','13.05.2022'),('29','4','13.05.2022'),('29','1','13.05.2022'),('29','4','13.05.2022'),('29','2','13.05.2022'),('29','4','13.05.2022'),('29','3','13.05.2022'),('29','4','13.05.2022'),('29','4','14.05.2022'),('29','2','14.05.2022'),('29','4','14.05.2022'),('29','4','14.05.2022'),('29','3','14.05.2022'),('29','4','14.05.2022'),('29','4','15.05.2022'),('29','4','15.05.2022'),('29','1','15.05.2022'),('29','4','15.05.2022'),('29','2','15.05.2022'),('29','4','15.05.2022'),('29','3','15.05.2022'),('29','4','15.05.2022'),('29','4','15.05.2022'),('29','2','15.05.2022'),('29','4','16.05.2022'),('29','1','16.05.2022'),('29','4','16.05.2022'),('29','3','16.05.2022');
/*!40000 ALTER TABLE `banka` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-04  2:36:53