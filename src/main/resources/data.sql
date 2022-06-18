INSERT INTO USUARIO (nome, email, senha) VALUES ('Renan', 'renan@gmail.com', '$2a$10$DBFgMHdJHiggDk63vEXG8u1FmynI0eBQFMBNvauaQC1QAj/j.EgRm'); -- 123456

INSERT INTO CURSO(nome, categoria) VALUES ('Java', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES ('Python', 'Programação');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES ('Topico 1', 'Mensagem 1', '2020-01-01', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES ('Topico 2', 'Mensagem 2', '2020-01-01', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES ('Topico 3', 'Mensagem 3', '2020-01-01', 'NAO_RESPONDIDO', 1, 1);