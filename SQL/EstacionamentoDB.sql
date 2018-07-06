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

select * from Veiculos