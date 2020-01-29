-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cadastro
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `dependente`
--

DROP TABLE IF EXISTS `dependente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dependente` (
  `ID_DEPENDENTE` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(45) NOT NULL,
  `CPF` varchar(45) NOT NULL,
  `SEXO` varchar(1) NOT NULL,
  `DATA_NASCIMENTO` datetime NOT NULL,
  `ID_TRABALHADOR` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_DEPENDENTE`),
  UNIQUE KEY `NOME_UNIQUE` (`NOME`),
  UNIQUE KEY `CPF_UNIQUE` (`CPF`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dependente`
--

LOCK TABLES `dependente` WRITE;
/*!40000 ALTER TABLE `dependente` DISABLE KEYS */;
INSERT INTO `dependente` VALUES (1,'DEPENDENTE DO CARLOS','123.879.852-58','F','1994-07-12 00:00:00','1'),(3,'DEPENDENTE 2 DO CARLOS','125.879.852-58','F','1994-07-20 00:00:00','1'),(4,'DEPENDENTE DA MARIA DO CARMO','147.856.951-98','M','1995-08-21 00:00:00','2'),(5,'DEPENDENTE DO JOAO','158.987.951-82','F','1992-08-01 00:00:00','3');
/*!40000 ALTER TABLE `dependente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabalhador`
--

DROP TABLE IF EXISTS `trabalhador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trabalhador` (
  `ID_TRABALHADOR` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(60) NOT NULL,
  `CPF` varchar(45) NOT NULL,
  `SEXO` varchar(1) NOT NULL,
  `DATA_NASCIMENTO` datetime NOT NULL,
  PRIMARY KEY (`ID_TRABALHADOR`),
  UNIQUE KEY `idtrabalhador_UNIQUE` (`ID_TRABALHADOR`),
  UNIQUE KEY `nome_UNIQUE` (`NOME`),
  UNIQUE KEY `CPF_UNIQUE` (`CPF`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabalhador`
--

LOCK TABLES `trabalhador` WRITE;
/*!40000 ALTER TABLE `trabalhador` DISABLE KEYS */;
INSERT INTO `trabalhador` VALUES (1,'CARLOS HENRIQUE','123.456.987-87','M','1994-07-11 00:00:00'),(2,'MARIA DO CARMO','987.589.852-78','F','1994-07-12 00:00:00'),(3,'MARIA DA SILVA','852.589.852-78','F','1994-07-12 00:00:00'),(4,'JOAO DA SILVA','176.589.852-58','M','1994-07-12 00:00:00'),(5,'JOSE DA SILVEIRA','158.658.958-71','M','1993-08-11 00:00:00');
/*!40000 ALTER TABLE `trabalhador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'cadastro'
--

--
-- Dumping routines for database 'cadastro'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-29 20:43:45
