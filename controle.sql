-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 13-Jul-2015 às 04:39
-- Versão do servidor: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `controle`
--
CREATE DATABASE IF NOT EXISTS `controle` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `controle`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `companhia`
--

CREATE TABLE IF NOT EXISTS `companhia` (
  `id_companhia` varchar(20) COLLATE utf8_bin NOT NULL,
  `nome` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `usuario` varchar(50) COLLATE utf8_bin NOT NULL,
  `senha` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `radio`
--

CREATE TABLE IF NOT EXISTS `radio` (
  `marca` varchar(20) COLLATE utf8_bin NOT NULL,
  `modelo` varchar(20) COLLATE utf8_bin NOT NULL,
  `serie` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `serviço`
--

CREATE TABLE IF NOT EXISTS `serviço` (
  `codigo_serviço` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo_serviço`
--

CREATE TABLE IF NOT EXISTS `tipo_serviço` (
  `codigo_serviço` varchar(20) COLLATE utf8_bin NOT NULL,
  `nome_serviço` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Extraindo dados da tabela `tipo_serviço`
--

INSERT INTO `tipo_serviço` (`codigo_serviço`, `nome_serviço`) VALUES
('CONS', 'Conserto'),
('INST', 'Instalação'),
('RET', 'Retirada');

-- --------------------------------------------------------

--
-- Estrutura da tabela `viatura`
--

CREATE TABLE IF NOT EXISTS `viatura` (
  `id_viatura` varchar(20) COLLATE utf8_bin NOT NULL,
  `id_companhia` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `companhia`
--
ALTER TABLE `companhia`
 ADD PRIMARY KEY (`id_companhia`);

--
-- Indexes for table `serviço`
--
ALTER TABLE `serviço`
 ADD KEY `fk_tipo_serviço_idx` (`codigo_serviço`);

--
-- Indexes for table `tipo_serviço`
--
ALTER TABLE `tipo_serviço`
 ADD PRIMARY KEY (`codigo_serviço`);

--
-- Indexes for table `viatura`
--
ALTER TABLE `viatura`
 ADD KEY `fk_companhia_viatura_idx` (`id_companhia`);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `serviço`
--
ALTER TABLE `serviço`
ADD CONSTRAINT `fk_tipo_serviço` FOREIGN KEY (`codigo_serviço`) REFERENCES `tipo_serviço` (`codigo_serviço`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `viatura`
--
ALTER TABLE `viatura`
ADD CONSTRAINT `fk_companhia_viatura` FOREIGN KEY (`id_companhia`) REFERENCES `companhia` (`id_companhia`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
