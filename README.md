# 📦 Produto API - Backend com Spring Boot

API RESTful para gerenciamento de produtos desenvolvida com Spring Boot, oferecendo operações CRUD completas.

## 🚀 Funcionalidades

- CRUD completo de produtos
- Banco de dados em memória (H2) para desenvolvimento
- API RESTful seguindo melhores práticas
- Documentação Swagger integrada (disponível em `/swagger-ui.html`)

## 🏗️ Estrutura do Projeto


src/main/java/com/exemplo/crud/
├── ProdutoApiApplication.java # Classe principal da aplicação
├── entity/
│ └── Produto.java # Entidade JPA que representa o produto
├── repository/
│ └── ProdutoRepository.java # Interface de acesso a dados (Spring Data JPA)
├── service/
│ └── ProdutoService.java # Camada de serviço (lógica de negócio)
└── controller/
└── ProdutoController.java # Camada de controle (API REST)

## 🔧 Tecnologias Utilizadas

- **Java 11**
- **Spring Boot** 2.7.18
- **Spring Data JPA** - Persistência de dados
- **H2 Database** - Banco de dados em memória para desenvolvimento
- **Maven** - Gerenciamento de dependências
- **Swagger** - Documentação da API

## 🚀 Como Executar a Aplicação

### ✅ Pré-requisitos

- Java JDK 11 ou superior
- Maven 3.6 ou superior
- (Opcional) IDE como IntelliJ IDEA ou VS Code

### ▶️ Executando a Aplicação

#### Via Maven:

```bash
mvn spring-boot:run
````

Ou compilando e executando o JAR:
bash

mvn clean package
java -jar target/produto-api-1.0-SNAPSHOT.jar

A aplicação será iniciada em: http://localhost:8080
📚 Endpoints da API

A API oferece os seguintes endpoints:

    GET /api/produtos - Lista todos os produtos

    GET /api/produtos/{id} - Obtém um produto por ID

    POST /api/produtos - Cria um novo produto

    PUT /api/produtos/{id} - Atualiza um produto existente

    DELETE /api/produtos/{id} - Remove um produto

    Nota: Acesse /swagger-ui.html para documentação interativa da API.
