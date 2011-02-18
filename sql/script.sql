--
-- Execute this script before before run the app 
-- Database: MySQL
-- 
-- Author: Loiane Groner
-- http://loianegroner.com (English)
-- http://loiane.com (Portuguese)
--

DROP SCHEMA IF EXISTS `blog_ibatis` ;
CREATE SCHEMA IF NOT EXISTS `blog_ibatis` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `blog_ibatis` ;

-- -----------------------------------------------------
-- Table `blog_ibatis`.`Blog`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `blog_ibatis`.`Blog` ;

CREATE  TABLE IF NOT EXISTS `blog_ibatis`.`Blog` (
  `idBlog` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NOT NULL ,
  `url` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idBlog`) ,
  UNIQUE INDEX `idBlog_UNIQUE` (`idBlog` ASC) )
ENGINE = InnoDB;


INSERT INTO `blog_ibatis`.`blog` (`idBlog`, `name`, `url`) VALUES ('1', 'Loiane Groner', 'http://loianegroner.com');