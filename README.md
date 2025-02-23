# Flashcard API

## 📌 Sobre o Projeto

A Flashcard API é uma aplicação backend desenvolvida em Java com Spring Boot que permite aos usuários criar, organizar e estudar flashcards de forma eficiente.

A aplicação suporta:

Criação e organização de decks e subdecks

Armazenamento e gerenciamento de flashcards

Histórico de estudo para revisão espaçada

## 🛠️ Tecnologias Utilizadas

Java 17

Spring Boot (Spring Data JPA, Spring Security, etc.)

MySQL (Banco de dados relacional)

Flyway (Migração de banco de dados)

Docker (Containerização da aplicação)

# 🚀 Como Rodar o Projeto

## 1️⃣ Pré-requisitos

Certifique-se de ter instalado:

Docker e Docker Compose (caso opte por rodar com Docker)

Java 17 e Maven (caso opte por rodar localmente)

## 2️⃣ Configuração e Execução

## Rodando com Docker (Recomendado)

A aplicação já está dockerizada. Para iniciar o projeto, basta executar:

docker-compose up -d

Isso irá subir os containers do banco de dados e da API.

## Rodando Localmente (Sem Docker)

Caso prefira rodar sem Docker, será necessário ter Java 17 e Maven instalados:

### Clone o repositório
git clone https://github.com/seu-usuario/flashcard-api.git
cd flashcard-api

### Configure o banco de dados MySQL
### Atualize o application.yml se necessário

### Compile e execute a aplicação
mvn spring-boot:run

A aplicação estará disponível em: http://localhost:8080

# 📂 Estrutura do Projeto

flashcard-api/\
│── application/       # Casos de uso, lógica de aplicação (Services)\
│── domain/            # Entidades e regras de negócio\
│   ├── model/         # Representação das entidades\
│   ├── repository/    # Interfaces para acesso a dados\
│   ├── service/       # Regras de negócio\
│── infrastructure/    # Implementações técnicas (adapters, persistência, segurança, etc.)\
│   ├── persistence/   # Implementação dos repositórios (JPA, JDBC)\
│   ├── security/      # Configuração de autenticação/autorização\
│   ├── config/        # Configurações gerais (Beans, CORS, etc.)\
│── web/               # Controllers e DTOs (exposição da API)\
│   ├── controller/    # Pontos de entrada da API (REST controllers)\
│   ├── dto/           # DTOs para request/response\
│── util/              # Utilitários gerais\

## 📝 TODO



📌 Contribuições e sugestões são bem-vindas!
Sinta-se à vontade para abrir uma issue ou enviar um pull request. 🚀
