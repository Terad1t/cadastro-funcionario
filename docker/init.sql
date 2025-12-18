CREATE TABLE funcionario (
                             id SERIAL PRIMARY KEY,
                             nome VARCHAR(100) NOT NULL,
                             cargo VARCHAR(50),
                             salario NUMERIC(10,2),
                             ativo BOOLEAN DEFAULT TRUE
);

INSERT INTO funcionario (nome, cargo, salario)
VALUES ('João Silva', 'Analista', 4500.00);
