# Hospital Administration System

In order to run this project, the Database should be created with the following Query (In this project we are using MySQL)

```
CREATE DATABASE `hospitaladministration` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `patients` (
  `ID` varchar(10) NOT NULL,
  `Lastname` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `History` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `users` (
  `ID` varchar(100) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Lastname` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Specialty` varchar(45) DEFAULT NULL,
  `Price` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `schedule` (
  `Doctor` varchar(100) NOT NULL,
  `Patient` varchar(10) DEFAULT NULL,
  `ID` varchar(45) NOT NULL,
  `Date` datetime NOT NULL,
  `Taken` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  KEY `Patient_idx` (`Patient`),
  CONSTRAINT `Doctor` FOREIGN KEY (`ID`) REFERENCES `users` (`ID`),
  CONSTRAINT `Patient` FOREIGN KEY (`Patient`) REFERENCES `patients` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


```
