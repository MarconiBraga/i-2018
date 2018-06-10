INSERT INTO individuo values (1, 123);
INSERT INTO individuo values (2, 222);

INSERT INTO comunicacao values (1, 'marconi@email.com', 'email', 'tarde', 'pessoal', 1);
INSERT INTO comunicacao values (2, '9999-9999', 'telefone', 'manha', 'pessoal', 2);

INSERT INTO nome values (1, 'Mr', 'Marconi', 'Braga', 'MB', false, 1);
INSERT INTO nome values (2, 'Mr', 'Marconi', 'Braga', 'MB', true, 2);

INSERT INTO representacao values (1, 'total', 'A', 1);
INSERT INTO representacao values (2, 'parcial', 'B', 2);

INSERT INTO identificador values (1, 'area 1', '01-02-2018',  'geral', 'emissor 1', 'abc',  'tipo 1', 1);
INSERT INTO identificador values (2, 'area 2',  '01-02-2018', 'parcial', 'emissor 2', 'xyz', 'tipo 2', 2);

INSERT INTO titulo_eleitoral values (1, 'secao 1', 'zona A', 1);
INSERT INTO titulo_eleitoral values (2, 'secao 2', 'zona B', 2);

INSERT INTO certidao values (1, 'tipo 1', 'cartorio X', 'livro 1', 'folha 2', 'termo 3', 1);
INSERT INTO certidao values (2, 'tipo 2', 'cartorio XXZ', 'livro 1', 'folha 3', 'termo 5', 2);

INSERT INTO ctps values (1, 'serie 123', 'GO', 1);
INSERT INTO ctps values (2, 'serie 321', 'SP', 2);

INSERT INTO utilizacao (id, uso, data_inicial, data_final, identificador_id, nome_id) 
	values (1, 'Uso total', '2018-01-01', '2018-01-01', 1, 1);
INSERT INTO utilizacao (id, uso, data_inicial, data_final, identificador_id, nome_id) 
	values (2, 'Uso parcial', '2018-01-01', '2018-01-01', 2, 2);
	
INSERT INTO vinculo values (1, '01-01-2018', '01-01-2019', 'unimed', 1, 1);
INSERT INTO vinculo values (2, '01-01-2018', '01-01-2019', 'ipasgo', 2, 2);

INSERT INTO nacionalidade values (1, '01-01-2018', 'GO', 'Goiania', 'Brasil');
INSERT INTO nacionalidade values (2, '01-01-2018', 'SP', 'Sao Paulo', 'Brasil');

INSERT INTO dado_demografico 
	values (1, 'passaporte invalido', '', 'brasileira', 'xx', 'yy', 'Maria da Silva', 'Roberto Dias', 'branca', 'M', 'dependente', 1, 1);
INSERT INTO dado_demografico 
	values (2, 'cpf nao informado', '', 'brasileira', 'abc', 'qwe', 'Luciana Rodrigues', 'Joao Ferreira', 'pardo', 'M', 'dependente', 2, 2);
	
INSERT INTO data values (1, '80%', '01-03-2018', 1);
INSERT INTO data values (2, '20%', '01-03-2018', 2);

INSERT INTO endereco 
	values (1, 'Jardim da Luz', '', '74123-123', '9', '12', 'GO', 'Brasil', 'abc', 'tipo A', 1, 1, 2);
INSERT INTO endereco 
	values (2, 'Jardins Madri', '', '74132-413', '9', '12', 'GO', 'Brasil', 'xyz', 'tipo B', 2, 2, 2);
	
INSERT INTO linha_endereco values (1, 'linha 1', 'ordem x', 1);
INSERT INTO linha_endereco values (2, 'linha 2', 'ordem y', 1);