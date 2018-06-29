DROP DATABASE IF EXISTS EstacionamentoDB;

CREATE DATABASE EstacionamentoDB;

USE EstacionamentoDB;


CREATE TABLE Veiculos (
	id INT NOT NULL AUTO_INCREMENT,
	Motorista VARCHAR(55) NOT NULL,
	Placa VARCHAR(10) NOT NULL,
	TipoVeiculos VARCHAR(20),
	PRIMARY KEY (ID)
);

CREATE TABLE Usuario (
	id INT NOT NULL AUTO_INCREMENT,
    Nome VARCHAR(55) NOT NULL,
    Login VARCHAR(20) NOT NULL,
    senha VARCHAR(20) NOT NULL,
	Cpf INT NOT NULL,
    email VARCHAR(55) NOT NULL,
    PRIMARY KEY (ID)
);