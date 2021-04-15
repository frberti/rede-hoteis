CREATE DATABASE REDE_HOTEL;

CREATE TABLE ENDERECO (
ID INT NOT NULL auto_increment,
RUA VARCHAR(100),
NUMERO VARCHAR(10),
BAIRRO VARCHAR(50),
CIDADE VARCHAR(50),
PRIMARY KEY (ID)
);

CREATE TABLE HOTEL(
ID INT NOT NULL auto_increment,
NOME VARCHAR(50),
ENDERECO_ID INT,
PRIMARY KEY (ID),
FOREIGN KEY (ENDERECO_ID) REFERENCES ENDERECO (ID)
);

CREATE TABLE QUARTO (
ID int NOT NULL auto_increment,
NUMERO VARCHAR(4),
TIPO VARCHAR(10),
VALOR FLOAT,
HOTEL_ID INT,
PRIMARY KEY (ID),
FOREIGN KEY (HOTEL_ID) REFERENCES HOTEL(ID)
);

CREATE TABLE RESERVA (
ID int NOT NULL auto_increment,
DATA_INICIO DATETIME,
DATA_FIM DATETIME,
QUARTO_ID INT,
PRIMARY KEY (ID),
FOREIGN KEY (QUARTO_ID) REFERENCES QUARTO(ID)
);