-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 20-Abr-2022 às 22:28
-- Versão do servidor: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistema`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `id` int(11) NOT NULL,
  `nome` varchar(11) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `dataNascimento` varchar(11) NOT NULL,
  `endereco` varchar(30) NOT NULL,
  `ativo` int(1) NOT NULL DEFAULT '1',
  `adm` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`id`, `nome`, `senha`, `telefone`, `dataNascimento`, `endereco`, `ativo`, `adm`) VALUES
(1, 'ana', '', '9990-1234', '12/12/2020', 'rua 234', 1, 0),
(2, 'fabiana', 'senha', '9923-8421', '12/12/2000', 'rua 213', 1, 0),
(3, 'rosangela', 'senha', '9933-8322', '11/11/2010', 'rua 313', 1, 1),
(4, 'roberto', 'senha123', '9923-8421', '12/12/2000', 'rua 213', 1, 0),
(5, 'roberto', '55A5E9E78207B4DF8699D60886FA070079463547B095D1A05BC719BB4E6CD251', '9923-8421', '12/12/2000', 'rua 213', 1, 0),
(6, 'roberto', '55A5E9E78207B4DF8699D60886FA070079463547B095D1A05BC719BB4E6CD251', '9923-8421', '12/12/2000', 'rua 213', 1, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
