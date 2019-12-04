DROP DATABASE IF EXISTS `afip`;
CREATE DATABASE IF NOT EXISTS `afip`;

CREATE TABLE `afip`.`impuesto` (
	`id` INT NOT NULL AUTO_INCREMENT,
    `tipo` VARCHAR(20) NOT NULL,
    `fecha_liquidacion` DATE,
    PRIMARY KEY(`id`)
);

INSERT INTO `afip`.`impuesto` VALUES (DEFAULT, 'ganancias', NULL), 
									 (DEFAULT, 'iva', NULL),
                                     (DEFAULT, 'minima_presunta', NULL),
                                     (DEFAULT, 'bienes_personales', NULL),
                                     (DEFAULT, 'debitos_creditos', NULL),
                                     (DEFAULT, 'brutos', NULL),
                                     (DEFAULT, 'sello', NULL),
                                     (DEFAULT, 'inmuebles', NULL);
                                     
CREATE TABLE `afip`.`contribuyente` (
	`clave` INT NOT NULL AUTO_INCREMENT,
    `dni` INT NOT NULL,
    `email` VARCHAR(30),
    PRIMARY KEY(`clave`)
);

INSERT INTO `afip`.`contribuyente` VALUES (DEFAULT, 39486458, 'melianlucasnahuel@gmail.com');