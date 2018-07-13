DROP DATABASE IF EXISTS EstacionamentoDB;

CREATE DATABASE EstacionamentoDB;

USE EstacionamentoDB;


CREATE TABLE Veiculo (
	idVeiculo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	sMotorista VARCHAR(55) NOT NULL,
	sPlaca VARCHAR(10) NOT NULL unique,
	sTipoVeiculo VARCHAR(20),
	dDatIni VARCHAR(11),
	dDatFim VARCHAR(11),
	fk_idUsuario int,
	FOREIGN KEY (fk_idUsuario) REFERENCES Usuario(idUsuario)
);

CREATE TABLE Usuario (
	idUsuario INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sNome VARCHAR(55) NOT NULL,
    sLogin VARCHAR(20) NOT NULL,
    sSenha VARCHAR(20) NOT NULL,
	sCpf INT NOT NULL unique,
    sEmail VARCHAR(55) NOT NULL
);



