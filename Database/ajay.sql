-- phpMyAdmin SQL Dump
-- version 4.3.11.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 09, 2015 at 02:23 AM
-- Server version: 5.6.23
-- PHP Version: 5.5.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ajay`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE IF NOT EXISTS `tbl_users` (
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `phoneNo` int(10) NOT NULL,
  `address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`firstName`, `lastName`, `phoneNo`, `address`) VALUES
('ajay', 'videkar', 1234567890, '1050 Benton Street'),
('Abhishek', 'Birjepatil', 1231231231, '1050 Benton Street'),
('Kaushik', 'Srivatvsan', 1123211111, '1050 Benton Street'),
('Rohan', 'Phatak', 1111222233, '1050 Benton Street'),
('Prajakta', 'Patil', 510962112, '1050 Benton Street'),
('Prajakta', 'Patil', 510962112, '1050 Benton Street'),
('ajay', 'videkar', 1231231, '1050'),
('ajay', 'videkar', 1231231, '1050'),
('ajay', 'videkar', 1231231, '1050'),
('ajay', 'videkar', 1231231, '1050'),
('ajay', 'videkar', 1231231, '1050'),
('ajay', 'videkar', 1231231, '1050'),
('ajay', 'videkar', 1231231, '1050'),
('ajay', 'videkar', 1231231, '1050'),
('ajay', 'videkar', 1231231, '1050'),
('Nathan', 'Gaini', 123321, 'adjfnkafn');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
