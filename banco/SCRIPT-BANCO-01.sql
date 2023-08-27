-- DROP O BANCO DE EXISTIR
DROP DATABASE IF EXISTS projectUsuario;

-- CRIA O BANCO projectUsuario
CREATE DATABASE projectUsuario;

-- USA O BANCO
USE projectUsuario;

-- CRIAÇÃO DA TB USUARIO
CREATE TABLE usuario (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome_usuario VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);

-- INSERTIS PARA INICIAR 

INSERT INTO usuario (nome_usuario, senha) VALUES ('Joao_Silva', 'senha123');
INSERT INTO usuario (nome_usuario, senha) VALUES ('Maria_Pereira', 'maria456');
INSERT INTO usuario (nome_usuario, senha) VALUES ('Carlos_Rodrigues', 'carlos789');
INSERT INTO usuario (nome_usuario, senha) VALUES ('Fernanda_Costa', 'fernanda012');
