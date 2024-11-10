CREATE TABLE pacientes (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           nome VARCHAR(255) NOT NULL,
                           cpf VARCHAR(14) NOT NULL,
                           email VARCHAR(255) NOT NULL,
                           telefone VARCHAR(15) NOT NULL,
                           logradouro varchar(100) not null,
                           bairro varchar(100) not null,
                           cep varchar(9) not null,
                           complemento varchar(100),
                           numero varchar(20),
                           uf char(2) not null,
                           cidade varchar(100) not null

);
