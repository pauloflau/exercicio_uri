INSERT INTO customers (id, name, street, city, state, credit_limit)VALUES 
  (1,	'Pedro Augusto da Rocha',	'Rua Pedro Carlos Hoffman',	'Porto Alegre',	'RS',	700.00),
  (2,	'Antonio Carlos Mamel',	'Av. Pinheiros', 'Belo Horizonte',	'MG',	3500.50),
  (3,	'Luiza Augusta Mhor',	'Rua Salto Grande',	'Niteroi',	'RJ',	4000.00),	
  (4,	'Jane Ester',	'Av 7 de setembro',	'Erechim',	'RS',	800.00),
  (5, 'Marcos Antônio dos Santos',	'Av Farrapos',	'Porto Alegre',	'RS',	4250.25);
  
INSERT INTO genres (id, description)VALUES
  (1,	'Animation'),
  (2,	'Horror'),
  (3,	'Action'),
  (4,	'Drama'),
  (5,	'Comedy');
  
INSERT INTO movies (id, name, id_genres)VALUES
  (1,	'Batman',	3),
  (2,	'The Battle of the Dark River',	3),
  (3,	'White Duck',	1),
  (4,	'Breaking Barriers',	4),
  (5,	'The Two Hours',	2);
  
INSERT INTO providers (id, name, street, city, state)VALUES
  (1,	'Ajax SA',	'Rua Presidente Castelo Branco',	'Porto Alegre',	'RS'),
  (2,	'Sansul SA',	'Av Brasil',	'Rio de Janeiro',	'RJ'),
  (3,	'Pr Sheppard Chairs',	'Rua do Moinho',	'Santa Maria',	'RS'),
  (4,	'Elon Electro',	'Rua Apolo',	'São Paulo',	'SP'),
  (5,	'Mike Electro',	'Rua Pedro da Cunha',	'Curitiba',	'PR');
  
INSERT INTO products (id, name, amount, price, id_providers)VALUES
  (1,	'Blue Chair',	30,	300.00,	5),
  (2,	'Red Chair',	50,	2150.00,	2),
  (3,	'Disney Wardrobe',	400,	829.50,	4),
  (4,	'Executive Chair',	17,	9.90,	3),
  (5,	'Solar Panel',	30,	3000.25,	4);
  
INSERT INTO lawyers(register, name, customers_number) VALUES 
  (1648, 'Marty M. Harrison', 5),
  (2427, 'Jonathan J. Blevins', 15),
  (3365, 'Chelsey D. Sanders', 20),
  (4153, 'Dorothy W. Ford', 16),
  (5525, 'Penny J. Cormier', 6);