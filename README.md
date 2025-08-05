📦 Produto API - Backend com Spring Boot

Este é o backend de um sistema de gerenciamento de produtos, desenvolvido com Spring Boot. Ele fornece uma API RESTful completa para realizar operações CRUD (Create, Read, Update, Delete) sobre produtos.

src/main/java/com/exemplo/crud/
├── ProdutoApiApplication.java    # Classe principal da aplicação
├── entity/
│   └── Produto.java              # Entidade JPA que representa o produto
├── repository/
│   └── ProdutoRepository.java    # Interface de acesso a dados (Spring Data JPA)
├── service/
│   └── ProdutoService.java       # Camada de serviço (lógica de negócio)
└── controller/
    └── ProdutoController.java    # Camada de controle (API REST)


🔧 Tecnologias Utilizadas

    Java 11

    Spring Boot 2.7.18

    Spring Data JPA

    H2 Database (banco de dados em memória para testes)

    Maven

🚀 Como Executar a Aplicação
✅ Pré-requisitos

    Java 11 ou superior

    Maven 3.6 ou superior

▶️ Executar via Maven

mvn spring-boot:run

💡 Ou compilar e executar o JAR

mvn clean package
java -jar target/produto-api-1.0-SNAPSHOT.jar

    A aplicação será iniciada em: http://localhost:8080

