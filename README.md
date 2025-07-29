Backend - API REST com Spring Boot

📋 Visão Geral

Este é o backend do sistema de gerenciamento de produtos, desenvolvido com Spring Boot. Fornece uma API REST completa para operações CRUD.

🏗️ Arquitetura

Estrutura de Pacotes

Plain Text


src/main/java/com/exemplo/crud/
├── ProdutoApiApplication.java  # Classe principal
├── entity/
│   └── Produto.java           # Entidade JPA
├── repository/
│   └── ProdutoRepository.java # Repository Spring Data
├── service/
│   └── ProdutoService.java    # Lógica de negócio
└── controller/
    └── ProdutoController.java # Controller REST


🔧 Tecnologias

•
Java 11

•
Spring Boot 2.7.18

•
Spring Data JPA

•
H2 Database

•
Maven

🚀 Como Executar

Pré-requisitos

•
Java 11+

•
Maven 3.6+

Comandos

Bash


# Executar a aplicação
mvn spring-boot:run

# Ou compilar e executar
mvn clean package
java -jar target/produto-api-1.0-SNAPSHOT.jar


