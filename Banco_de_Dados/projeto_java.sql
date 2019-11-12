banco_de_dados

CREATE TABLE consulta (
  id int(11) NOT NULL,
  crm_medico varchar(16) NOT NULL,
  data_consulta datetime NOT NULL,
  aberta tinyint(4) NOT NULL DEFAULT 0,
  diagnostico int(11) NOT NULL
);


CREATE TABLE diagnosticos (
  id int(11) NOT NULL PRIMARY KEY,
  crm_medico varchar(16) NOT NULL,
  sintomas varchar(500) NOT NULL,
  receita varchar(500) NOT NULL,
  doencas varchar(100) DEFAULT NULL,
  FOREIGN KEY (crm_medico) REFERENCES medicos(crm)
);

CREATE TABLE doencas (
  id int(11) NOT NULL,
  nome varchar(250) NOT NULL,
  sintomas varchar(500) DEFAULT NULL,
  tratamentos varchar(500) DEFAULT NULL
);


CREATE TABLE medicos (
  id int(11) NOT NULL,
  crm varchar(16) NOT NULL PRIMARY KEY,
  FOREIGN KEY (id) REFERENCES profissionais(id)
);

CREATE TABLE pacientes (
  id int(11) NOT NULL,
  nome varchar(250) NOT NULL,
  nascimento date NOT NULL,
  cpf varchar(14) NOT NULL,
  cartao_sus varchar(20) NOT NULL,
  rg varchar(16) NOT NULL,
  rua varchar(180) NOT NULL,
  bairro varchar(180) NOT NULL,
  numero varchar(11) NOT NULL,
  complemento varchar(150) NOT NULL,
  cidade varchar(100) NOT NULL,
  estado varchar(25) NOT NULL,
  ddd varchar(6) NOT NULL,
  telefone varchar(20) NOT NULL,
  escola varchar(140) DEFAULT NULL
);


CREATE TABLE profissionais (
  id int(11) NOT NULL,
  nome varchar(250) NOT NULL,
  cpf varchar(14) NOT NULL,
  nascimento date NOT NULL,
  cargo varchar(250) NOT NULL,
  crm varchar(16) DEFAULT NULL,
  area_especializacao varchar(150) DEFAULT NULL
);


ALTER TABLE consulta
  ADD PRIMARY KEY (id),
  ADD KEY diagnostico (diagnostico),
  ADD KEY crm_medico (crm_medico);


ALTER TABLE diagnosticos
  ADD PRIMARY KEY (id);


ALTER TABLE doencas
  ADD PRIMARY KEY (id);


ALTER TABLE medicos
  ADD PRIMARY KEY (crm),
  ADD KEY id (id);


ALTER TABLE pacientes
  ADD PRIMARY KEY (id),
  ADD UNIQUE KEY cpf (cpf),
  ADD UNIQUE KEY cartao_sus (cartao_sus),
  ADD UNIQUE KEY rg (rg);

ALTER TABLE profissionais
  ADD PRIMARY KEY (id);

ALTER TABLE consulta
  MODIFY id int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE diagnosticos
  MODIFY id int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE doencas
  MODIFY id int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE pacientes
  MODIFY id int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE profissionais
  MODIFY id int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE consulta
  ADD CONSTRAINT consulta_ibfk_1 FOREIGN KEY (diagnostico) REFERENCES diagnosticos (id),
  ADD CONSTRAINT consulta_ibfk_2 FOREIGN KEY (crm_medico) REFERENCES medicos (crm);

ALTER TABLE medicos
  ADD CONSTRAINT medicos_ibfk_1 FOREIGN KEY (id) REFERENCES profissionais (id);
=======
-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 02-Nov-2019 às 22:38
-- Versão do servidor: 10.4.8-MariaDB
-- versão do PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

create database trabalhoNp2;
use trabalhoNp2;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projeto_java`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `consulta`
--

CREATE TABLE `consulta` (
  `id` int(11) NOT NULL,
  `crm_medico` varchar(16) NOT NULL,
  `data_consulta` datetime NOT NULL,
  `aberta` tinyint(4) NOT NULL DEFAULT 0,
  `diagnostico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `diagnosticos`
--

CREATE TABLE `diagnosticos` (
  `id` int(11) NOT NULL,
  `sintomas` varchar(500) NOT NULL,
  `receita` varchar(500) NOT NULL,
  `doencas` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `doencas`
--

CREATE TABLE `doencas` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `sintomas` varchar(500) DEFAULT NULL,
  `tratamentos` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `medicos`
--

CREATE TABLE `medicos` (
  `id` int(11) NOT NULL,
  `crm` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pacientes`
--

CREATE TABLE `pacientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `nascimento` date NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `cartao_sus` varchar(20) NOT NULL,
  `rg` varchar(16) NOT NULL,
  `rua` varchar(180) NOT NULL,
  `bairro` varchar(180) NOT NULL,
  `numero` varchar(11) NOT NULL,
  `complemento` varchar(150) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `estado` varchar(25) NOT NULL,
  `ddd` varchar(6) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `escola` varchar(140) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `profissionais`
--

CREATE TABLE `profissionais` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `nascimento` date NOT NULL,
  `cargo` varchar(250) NOT NULL,
  `crm` varchar(16) DEFAULT NULL,
  `area_especializacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `diagnostico` (`diagnostico`),
  ADD KEY `crm_medico` (`crm_medico`);

--
-- Índices para tabela `diagnosticos`
--
ALTER TABLE `diagnosticos`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `doencas`
--
ALTER TABLE `doencas`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`crm`),
  ADD KEY `id` (`id`);

--
-- Índices para tabela `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cpf` (`cpf`),
  ADD UNIQUE KEY `cartao_sus` (`cartao_sus`),
  ADD UNIQUE KEY `rg` (`rg`);

--
-- Índices para tabela `profissionais`
--
ALTER TABLE `profissionais`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `consulta`
--
ALTER TABLE `consulta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `diagnosticos`
--
ALTER TABLE `diagnosticos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `doencas`
--
ALTER TABLE `doencas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `profissionais`
--
ALTER TABLE `profissionais`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `consulta_ibfk_1` FOREIGN KEY (`diagnostico`) REFERENCES `diagnosticos` (`id`),
  ADD CONSTRAINT `consulta_ibfk_2` FOREIGN KEY (`crm_medico`) REFERENCES `medicos` (`crm`);

--
-- Limitadores para a tabela `medicos`
--
ALTER TABLE `medicos`
  ADD CONSTRAINT `medicos_ibfk_1` FOREIGN KEY (`id`) REFERENCES `profissionais` (`id`);



