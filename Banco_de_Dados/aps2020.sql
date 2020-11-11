CREATE DATABASE aps2020;
USE aps2020;

CREATE TABLE informacao(
id int primary key auto_increment,
nivel int not null,
informacao longtext not null
);

CREATE TABLE usuario(
id int primary key auto_increment,
nome varchar(30),
nivel int not null,
digital longtext
);

INSERT INTO informacao(nivel, informacao) VALUES
(1, 'Total de assinantes: 45'),
(1, 'Assinantes do sexo masculino: 20'),
(1, 'Assinantes do sexo feminino: 25'),
(2, 'Valor recebido por cada assinante: R$900,00'),
(2, 'Folha salarial: R$5000,00'),
(3, 'Total de diretores cadastrados: 1');

INSERT INTO usuario(nome, nivel, digital) VALUES
('Roberto', 1, 'digital 1'),
('Augusto', 2, 'digital 2'),
('Victor', 3, 'digital 3');




