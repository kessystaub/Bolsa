-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 27-Abr-2022 às 22:43
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
  `nome` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `dataNascimento` varchar(11) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `ativo` int(1) NOT NULL DEFAULT '1',
  `adm` int(1) NOT NULL DEFAULT '0',
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`id`, `nome`, `senha`, `telefone`, `dataNascimento`, `endereco`, `ativo`, `adm`, `email`) VALUES
(8, 'luiza', '3DC3ABF6A7CE3A3AA681A7873E33C9DC9F9D30159898CF623BFF50D6814D8075', '3255-2345', '31/04/1999', 'rua 21', 0, 0, 'luiza@yahoo.com'),
(9, 'ana', '24D4B96F58DA6D4A8512313BBD02A28EBF0CA95DEC6E4C86EF78CE7F01E788AC', '1554-1244', '12/12/2000', 'rua 921', 1, 1, 'ana@outlook.com'),
(10, 'luiz', 'A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3', '47996086784', '28/02/2000', 'rua 319', 1, 1, 'luiz@outlook.com'),
(11, 'paulo', '9D87609A3584D3FCA24B7084DC445C5B6F5B8AC2C6DB3A1FB0D3AB7FFE27E042', '1230-3125', '12/02/2000', 'rua 2914', 1, 0, 'paulo@outlook.com'),
(12, 'kessy', '656AEDF9E5AF4FD4C2D6DF51338DEAADC000DFF8681CBB441A554ED1CAE7700F', '1235-2345', '12/12/2001', 'rua 2193', 1, 0, 'kessy@hotmail.com'),
(13, 'rosangela', '55A6799C2EB6EF960ECB7E456BA0D7ED15A02C026788E13A09757A2F2B082720', '2342-2345', '29/02/2000', 'rua 78', 1, 1, 'rosangela123@yahoo.com.br'),
(14, 'louise', '55A5E9E78207B4DF8699D60886FA070079463547B095D1A05BC719BB4E6CD251', '3245-2345', '22/04/1999', 'rua 12', 1, 0, 'louise@hotmail.com'),
(15, 'vivian', '449E7C4FF29002EE7D7481D9FB9FDDFB2AE374501F96D8675B8D18FEEE414F19', '474366-5426', '03/12/1999', 'rua 78', 1, 0, 'vivian@yahoo.com'),
(16, 'amanda', '52E8E47B38E854580AFCE4AADE15DBD5CE0C0464DA711AFE71DA123687D5A4CD', '3255-2353', '23/12/1999', 'rua 213', 1, 0, 'amanda@hotmail.com'),
(17, 'felipe', '2BD2D3A31934D76198ACC030CACA4C31965474FE5FA48F35FEF79D0FD74EE1B2', '3213-2342', '21/02/1998', 'rua 214', 1, 1, 'felipe@yahoo.com'),
(25, 'Alex Rese', '55A5E9E78207B4DF8699D60886FA070079463547B095D1A05BC719BB4E6CD251', '47996019526', '23/10/1989', 'Itapema/SC', 1, 0, 'alexrese@outlook.com'),
(26, 'Alex Rese', '55A5E9E78207B4DF8699D60886FA070079463547B095D1A05BC719BB4E6CD251', '47996019526', '23/10/1989', 'Itapema/SC', 1, 1, 'alexrese@outlook.com');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
