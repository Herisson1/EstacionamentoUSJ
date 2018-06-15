CREATE DATABASE cadastroveiculo;
use cadastroveiculo;

create table informacoes(
	id INT NOT NULL AUTO_INCREMENT,
    nome varchar(50),
    placa int,
    tipoVeiculo varchar(20),
    primary key (id)
);
