/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */

/**
 * Author:  Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * Created: 29/11/2020
 */

/*
create table tarefa (
    id int not null auto_increment,
    descricao varchar(255) not null,
    concluida boolean,
    primary key(id)
);
*/

CREATE TABLE `tarefa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `concluida` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;