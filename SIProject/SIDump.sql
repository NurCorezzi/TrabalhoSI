DROP TABLE IF EXISTS `dadossig`;
CREATE TABLE `dadossig` (
  `ID` int(11) DEFAULT NULL,
  `Atendimentos` int(11) DEFAULT NULL,
  `Auditor` VARCHAR(255),
  `Profissao` VARCHAR(255),
  `Nome` VARCHAR(255),
  `Nome2` VARCHAR(255),
  `Sobrenome` VARCHAR(255),
  `Sobrenome1` VARCHAR(255),
  `RG` int(11) DEFAULT NULL,
  `Idade` VARCHAR(255),
  `Sexo` VARCHAR(255),
  `DataEntrada` VARCHAR(255),
  `Peso` double DEFAULT NULL,
  `Altura` int(11) DEFAULT NULL,
  `TAS` int(11) DEFAULT NULL,
  `TAD` int(11) DEFAULT NULL,
  `Hemodialises` int(11) DEFAULT NULL,
  `DoseDialisis` double DEFAULT NULL,
  `Hemoglobina` double DEFAULT NULL,
  `Albumina` double DEFAULT NULL,
  `Fosforo` double DEFAULT NULL
)DEFAULT CHARSET=utf8;

INSERT INTO `dadossig` VALUES (1,1,'Jose Luis','Médico','NELSON',NULL,'LASSO',NULL,16452681,'1969-06-10','M','2008-09-12',67.6,164,138,74,2,1.1,12.5,3.3,5.1),(2,1,'Jose Luis','Médico','MARIA',NULL,'GUTIERREZ',NULL,31468393,'1954-07-21','F','2016-01-01',52.4,145,160,90,98,98,11.3,3.3,4.9),(3,1,'Jose Luis','Médico','LUIS',NULL,'ANGULO',NULL,6177059,'1961-05-18','M','2016-01-01',52,157,148,79,1,1.7,13.7,4.7,5.8),(4,1,'Jose Luis','Médico','ANANIAS',NULL,'GONZALIAZ',NULL,1456351,'1937-10-17','M','2016-01-01',48.5,155,120,70,1,1.5,12.4,4.2,5.5),(5,1,'Jose Luis','Médico','ANTONIO',NULL,'MONTES',NULL,5983783,'1954-03-13','M','2016-01-01',62,160,132,70,1,1.6,11.3,3.6,4.2),(6,1,'Jose Luis','Médico','FAUNIEL',NULL,'GOMEZ',NULL,6557484,'1952-02-25','M','2016-01-01',86.8,158,128,78,1,1.3,11,4.1,7.5),(7,1,'Jose Luis','Médico','NUBIA',NULL,'OJEDA',NULL,31470931,'1946-05-11','F','2016-01-01',86,147,132,77,1,1.7,10.6,3.8,6.7),(8,1,'Jose Luis','Médico','JOSE',NULL,'MUNOZ',NULL,76296328,'1970-12-22','M','2016-01-01',69.6,160,133,84,1,1.6,11.9,4.4,6.4),(9,1,'Jose Luis','Médico','CESAR',NULL,'AMAYA',NULL,1053799265,'1989-11-02','M','2016-01-01',54.9,160,160,72,1,1.9,13.7,4.8,4.5),(10,1,'Jose Luis','Médico','ROGELIO',NULL,'OSPINA',NULL,7247445,'1958-11-24','M','2016-01-01',67.2,160,148,82,1,1.4,10.9,4.2,2.9),(11,1,'Jose Luis','Médico','JOSE',NULL,'LOPEZ',NULL,9920308,'1963-07-11','M','2016-01-01',61.2,160,134,78,2,1.5,14.5,4.4,3.4),(12,1,'Jose Luis','Médico','JOSE',NULL,'VERGARA',NULL,10231142,'1954-12-02','M','2016-01-01',69.9,180,150,80,1,1.5,11.9,4.3,4.6),(13,1,'Jose Luis','Médico','MARIA',NULL,'GALVIS',NULL,24836470,'1953-04-05','F','2016-01-01',63,145,150,70,1,1.6,12.9,3.4,4.6),(14,2,'Daniel Molano','Enfermeiro','LUCELLY',NULL,'OSPINA',NULL,30354050,'1970-01-24','F','2002-03-20',71.5,155,182,82,1,1.8,10.4,4,3.4),(15,1,'Jose Luis','Médico','JOSE',NULL,'CEBALLOS',NULL,3452007,'1956-05-13','M','2016-01-01',71.1,160,155,68,2,1.4,12.3,4,3.4),(16,1,'Jose Luis','Médico','MARIA',NULL,'QUINTERO',NULL,24368166,'1970-09-17','F','2016-01-01',75.6,151,187,97,98,98,8.7,3.9,3.9),(17,1,'Jose Luis','Médico','WILDER',NULL,'RESTREPO',NULL,4457460,'1982-07-19','M','2016-01-01',73,175,135,96,98,98,12.6,3.8,5.4),(18,1,'Daniel Molano','Enfermeiro','JORGE',NULL,'GUARIN',NULL,75098430,'1981-04-26','M','2016-01-01',57.8,160,123,70,1,1.7,15.5,4.1,5.2),(19,1,'Jose Luis','Médico','ALBA',NULL,'ARBOLEDA',NULL,30277431,'1961-09-01','F','2016-01-01',44.7,145,111,56,1,2.6,12.3,4.3,4.7),(20,1,'Jose Luis','Médico','DAVID',NULL,'QUINTERO',NULL,4322812,'1944-04-26','M','2016-01-01',53.4,164,166,90,2,1.6,15.6,3.6,4.9),(21,1,'Jose Luis','Médico','MARGOTH',NULL,'SANCHEZ',NULL,24306424,'1948-07-20','F','2016-01-01',55.5,160,157,52,1,1.8,13.4,4,4.7),(22,1,'Jose Luis','Médico','ANA',NULL,'VIDAL',NULL,25100994,'1956-05-10','F','2016-01-01',39.7,150,156,66,1,3,11.2,4.2,4.4),(23,1,'Jose Luis','Médico','MARIA',NULL,'VILLADA',NULL,24284196,'1939-07-22','F','2016-01-01',60.6,160,150,65,1,1.6,13,4,4.5),(24,1,'Jose Luis','Médico','LUZ',NULL,'GARCIA',NULL,30321331,'1967-05-08','F','2016-01-01',57.9,155,107,74,98,98,13.7,4.1,4.5),(25,1,'Jose Luis','Médico','NICOLAS',NULL,'MARTINEZ',NULL,10244721,'1959-05-23','M','2016-01-01',63.6,163,147,91,98,98,12.4,3,6.3),(26,1,'Jose Luis','Médico','JHON',NULL,'BEDOYA',NULL,10278476,'1967-08-12','M','2016-01-01',58.7,160,146,78,1,1.8,11.9,3.8,4.1),(27,1,'Jose Luis','Médico','SOFIA',NULL,'COLINA',NULL,1007233597,'2000-06-05','F','2016-01-01',44,140,133,83,2,1.4,13.1,4.6,5.6),(28,1,'Jose Luis','Médico','ALBA',NULL,'JIMENEZ',NULL,24285412,'1941-02-15','F','2016-01-01',62,155,132,65,1,1.9,11.9,4.1,5),(29,1,'Jose Luis','Médico','GLORIA',NULL,'LOPEZ',NULL,1053769565,'1975-08-24','F','2016-01-01',55.8,150,145,96,1,2.6,12.5,4,4.3),(30,1,'Jose Luis','Médico','ANCIZAR',NULL,'SERNA',NULL,1206455,'1929-03-19','M','2016-01-01',63.2,166,112,56,2,1.6,11.4,3,4.5),(31,1,'Jose Luis','Médico','MARIA',NULL,'ROMAN',NULL,24301082,'1947-01-14','F','2014-04-30',76.1,155,150,70,1,1.9,11.3,4,3.2),(32,1,'Jose Luis','Médico','GERMAN',NULL,'PARRA',NULL,4348433,'1959-07-20','M','2006-07-01',51.5,150,130,80,1,1.7,12.4,4,3.4),(33,1,'Jose Luis','Médico','DUBERNEY',NULL,'ZULUAGA',NULL,1054994264,'1993-04-16','M','2006-07-01',62.1,160,173,67,2,1.5,12.5,4.1,5.2),(34,1,'Jose Luis','Médico','MARIA',NULL,'OSPINA',NULL,30289568,'1959-03-12','F','2016-01-01',67.6,160,160,85,2,1.9,11.8,4,4.4),(35,1,'Jose Luis','Médico','ALEJANDRO',NULL,'OROZCO',NULL,16078937,'1984-12-02','M','2016-01-01',52,160,134,79,1,2,12.1,3.7,5.1),(36,1,'Jose Luis','Médico','MAGDALENA',NULL,'GASPAR',NULL,24331245,'1980-10-27','F','2016-01-01',42.4,151,169,85,1,2.3,11.2,4,6.3),(37,1,'Jose Luis','Médico','MIGUEL',NULL,'LOPEZ',NULL,10261277,'1963-03-03','M','2016-01-01',70.9,160,201,99,1,1.1,11.9,4.1,5.4),(38,1,'Daniel Molano','Enfermeiro','BEATRIZ',NULL,'BEDOYA',NULL,30273374,'1959-11-14','F','2016-01-01',56.7,151,106,54,1,2.2,11.5,4.3,4.9),(39,1,'Jose Luis','Médico','NUBIA',NULL,'ALZATE',NULL,25055397,'1954-06-12','F','2016-01-01',65,160,144,60,1,1.8,11.4,4.3,3.8),(40,1,'Jose Luis','Médico','DIEGO',NULL,'CANON',NULL,1053768090,'1985-03-03','M','2016-01-01',43.1,152,117,90,2,1.8,10.9,4,5.1),(41,1,'Jose Luis','Médico','CESAR',NULL,'ARENAS',NULL,15990639,'1979-10-11','M','2016-01-01',66.2,155,150,90,1,1.5,13.2,4.2,4),(42,1,'Jose Luis','Médico','MARIA',NULL,'ATEHORTUA',NULL,30332720,'1974-07-02','F','2016-01-01',41.8,154,160,100,1,2.2,11,4,5.6);