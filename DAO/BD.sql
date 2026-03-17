CREATE DATABASE IF NOT EXISTS sistema_produtos;
USE sistema_produtos;

-
CREATE TABLE IF NOT EXISTS produtos (
    id INT PRIMARY KEY,           
    nome VARCHAR(100) NOT NULL,   
    preco DECIMAL(10, 2) NOT NULL 
)