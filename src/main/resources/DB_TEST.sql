CREATE DATABASE ecobanho_app;
USE ecobanho_app;
DROP DATABASE ecobanho_app;

/* CRIANDO TABELAS */

CREATE TABLE CHUVEIRO(
	ID_CHUVEIRO int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	TIPO_CHUVEIRO VARCHAR(255) NOT NULL,
	VAZAO int NOT NULL
);

CREATE TABLE GRUPO(
	ID_GRUPO int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	NOME_GRUPO VARCHAR(255) NOT NULL,
	NUM_INTEGRANTES int NOT NULL	
);

CREATE TABLE USUARIO(
	ID_USUARIO int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	NICKNAME VARCHAR(255) NOT NULL,
	NOME_USUARIO VARCHAR(255) NOT NULL,
	SEXO BOOLEAN NOT NULL,
	TEMPO_USUAL int NOT NULL,
	FK_TIPO_CHUVEIRO int NOT NULL,
	FK_ID_GRUPO int,

	FOREIGN KEY (FK_TIPO_CHUVEIRO) REFERENCES CHUVEIRO(ID_CHUVEIRO),
	FOREIGN KEY (FK_ID_GRUPO) REFERENCES GRUPO(ID_GRUPO)
);

CREATE TABLE BANHO(
	ID_BANHO int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	DATA_BANHO DATE NOT NULL,
	TEMPO_REAL int NOT NULL,
	CONSUMO_REAL int NOT NULL,
	TEMPO_IDEAL int NOT NULL,
	CONSUMO_IDEAL int NOT NULL,
	ECONOMIA int NOT NULL,
	FK_USUARIO int NOT NULL,
	FK_CHUVEIRO int NOT NULL,

	FOREIGN KEY(FK_USUARIO) REFERENCES USUARIO(ID_USUARIO),
	FOREIGN KEY(FK_CHUVEIRO) REFERENCES CHUVEIRO(ID_CHUVEIRO)
);


/* INSERTS DAS TABELAS */

/* INSERT CHUVEIRO */

INSERT INTO chuveiro (tipo_chuveiro, vazao) VALUES ('DUCHA', '25');
INSERT INTO chuveiro (tipo_chuveiro, vazao) VALUES ('ELÉTRICO', '15');


/* INSERT GRUPO */

INSERT INTO grupo (nome_grupo, num_integrantes) VALUES ('SILVA', 3);
INSERT INTO grupo (nome_grupo, num_integrantes) VALUES ('MARTINS', 4);


/* INSERT USUARIO */

INSERT INTO usuario (nickname, nome_usuario, sexo, tempo_usual, fk_tipo_chuveiro, fk_id_grupo) VALUES ('nick1', 'marcos', 'masculino', 600, 1, 1);
INSERT INTO usuario (nickname, nome_usuario, sexo, tempo_usual, fk_tipo_chuveiro, fk_id_grupo) VALUES ('nick2', 'antonio', 'masculino', 700, 2, 2);
INSERT INTO usuario (nickname, nome_usuario, sexo, tempo_usual, fk_tipo_chuveiro, fk_id_grupo) VALUES ('nick3', 'vinicius', 'masculino', 900, 1, 1);
INSERT INTO usuario (nickname, nome_usuario, sexo, tempo_usual, fk_tipo_chuveiro, fk_id_grupo) VALUES ('nick4', 'maria', 'feminino', 600, 1, 1);
INSERT INTO usuario (nickname, nome_usuario, sexo, tempo_usual, fk_tipo_chuveiro, fk_id_grupo) VALUES ('nick5', 'graça', 'feminino', 700, 2, 2);
INSERT INTO usuario (nickname, nome_usuario, sexo, tempo_usual, fk_tipo_chuveiro, fk_id_grupo) VALUES ('nick6', 'marcela', 'feminino', 800, 2, 2);
INSERT INTO usuario (nickname, nome_usuario, sexo, tempo_usual, fk_tipo_chuveiro, fk_id_grupo) VALUES ('nick7', 'janaina', 'feminino', 900, 2, 2);


/* INSERTS USUARIOS */

insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-15', 600, 9000, 720, 10800, 1800, 1, 2);
insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-16', 700, 10500, 720, 10800, 300, 1, 2);


insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-15', 800, 12000, 720, 10800, -1200, 2, 2);
insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-16', 600, 9000, 720, 10800, 1800, 2, 2);


insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-15', 700, 10500, 720, 10800, 300, 3, 2);
insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-16', 800, 12000, 720, 10800, -1200, 3, 2);


insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-15', 600, 9000, 720, 10800, 1800, 4, 2);
insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-16', 700, 10500, 720, 10800, 300, 4, 2);


insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-15', 800, 20000, 720, 18000, -2000, 5, 1);
insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-16', 600, 15000, 720, 18000, 3000, 5, 1);


insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-16', 700, 17500, 720, 18000, 500, 6, 1);
insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-15', 800, 20000, 720, 18000, -2000, 6, 1);


insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-16', 600, 15000, 720, 18000, 3000, 7, 1);
insert into banho (data_banho, tempo_real, consumo_real, tempo_ideal, consumo_ideal, economia,fk_usuario,fk_chuveiro) values ('2019-04-16', 700, 17500, 720, 18000, 500, 7, 1);




/* TESTE DE SELECT */

SELECT 
USUARIO.ID_USUARIO,
USUARIO.NOME_USUARIO,
USUARIO.NICKNAME,
BANHO.ECONOMIA,
BANHO.DATA_BANHO
FROM USUARIO, BANHO  
WHERE USUARIO.ID_USUARIO = 6
AND DATA_BANHO >= '2019-04-15'
AND DATA_BANHO <= '2019-04-16'
ORDER BY DATA_BANHO;



select USUARIO.ID_USUARIO as ID from USUARIO;


SELECT 
USUARIO.ID_USUARIO,
USUARIO.NOME_USUARIO,
USUARIO.NICKNAME,
BANHO.ECONOMIA,
BANHO.DATA_BANHO
FROM USUARIO, BANHO  
WHERE USUARIO.ID_USUARIO = 6
AND DATA_BANHO = '2019-04-15'
ORDER BY DATA_BANHO;	




