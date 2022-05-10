-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: auros_db
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
-- Dumping data for table `k_pac`
--

LOCK TABLES `k_pac` WRITE;
/*!40000 ALTER TABLE `k_pac` DISABLE KEYS */;
INSERT INTO `k_pac` VALUES (1,'Physical','Physical geography (or physiography) focuses on geography as an Earth science. It aims to understand the physical problems and the issues of lithosphere, hydrosphere, atmosphere, pedosphere, and global flora and fauna patterns (biosphere). Physical geography is the study of earth\'s seasons, climate, atmosphere, soil, streams, landforms, and oceans.','06-05-22'),(2,'Human','Human geography (or anthropogeography) is a branch of geography that focuses on the study of patterns and processes that shape the human society. It encompasses the human, political, cultural, social, and economic aspects.','06-05-22'),(3,'Integrated','Integrated geography is concerned with the description of the spatial interactions between humans and the natural world.','06-05-22'),(8,'sadaaa','adasdasda','10-05-22');
/*!40000 ALTER TABLE `k_pac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `k_pac_k_pac_set`
--

LOCK TABLES `k_pac_k_pac_set` WRITE;
/*!40000 ALTER TABLE `k_pac_k_pac_set` DISABLE KEYS */;
INSERT INTO `k_pac_k_pac_set` VALUES (1,1),(2,1),(3,1);
/*!40000 ALTER TABLE `k_pac_k_pac_set` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `k_pac_set`
--

LOCK TABLES `k_pac_set` WRITE;
/*!40000 ALTER TABLE `k_pac_set` DISABLE KEYS */;
INSERT INTO `k_pac_set` VALUES (1,'Geography'),(2,'Mathematics'),(3,'dftgdtr'),(4,'asrfafsdfds'),(5,'dsfsdf'),(6,'werewrewr'),(7,'rette'),(8,'reter'),(9,'rtret'),(10,'eqwe');
/*!40000 ALTER TABLE `k_pac_set` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-10 18:31:55
