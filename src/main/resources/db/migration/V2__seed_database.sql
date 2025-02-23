INSERT INTO `tab_user` (`username`, `password`, `email`, `created_at`)
VALUES ('test_user', 'test_password', 'test_user@example.com', NOW());

SET @user_id = LAST_INSERT_ID();

INSERT INTO `tab_deck` (`name`, `description`, `created_at`, `user_id`)
VALUES ('Deck de Teste', 'Este é um deck de teste.', NOW(), @user_id);

SET @deck_id = LAST_INSERT_ID();

INSERT INTO `tab_flashcard` (`question`, `answer`, `created_at`, `deck_id`) VALUES
('O que é Java?', 'Uma linguagem de programação.', NOW(), @deck_id),
('O que é um banco de dados relacional?', 'Um banco de dados baseado em tabelas e relações.', NOW(), @deck_id),
('O que é uma chave primária?', 'Um identificador único para cada registro em uma tabela.', NOW(), @deck_id),
('O que significa SQL?', 'Structured Query Language.', NOW(), @deck_id),
('O que é uma foreign key?', 'Uma chave que referencia outra tabela.', NOW(), @deck_id);


INSERT INTO `tab_deck` (`name`, `description`, `created_at`, `user_id`)
VALUES ('Deck de Teste 2', 'Este é um deck de teste 2.', NOW(), @user_id);

SET @deck_id = LAST_INSERT_ID();

INSERT INTO `tab_flashcard` (`question`, `answer`, `created_at`, `deck_id`) VALUES
('Lorem Ipsum', 'Uma linguagem de programação.', NOW(), @deck_id),
('Lorem Ipsum Lorem IpsumLorem Ipsum', 'Um banco de dados baseado em tabelas e relações.', NOW(), @deck_id),
('Lorem IpsumLorem IpsumLorem IpsumLorem Ipsum', 'Um identificador único para cada registro em uma tabela.', NOW(), @deck_id),
('Lorem IpsumLorem IpsumLorem IpsumLorem IpsumLorem Ipsum', 'Structured Query Language.', NOW(), @deck_id),
('Lorem IpsumLorem IpsumLorem IpsumLorem IpsumLorem IpsumLorem Ipsum', 'Uma chave que referencia outra tabela.', NOW(), @deck_id);