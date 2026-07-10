# 🛒 Workshop API

API REST desenvolvida em Java com Spring Boot para simular um sistema de pedidos, permitindo o gerenciamento de usuários, produtos, categorias e pedidos.

Este projeto foi desenvolvido durante os estudos de Spring Boot e JPA/Hibernate com o objetivo de praticar modelagem de banco de dados, relacionamentos entre entidades e construção de APIs REST seguindo uma arquitetura em camadas.

---

# 🚀 Funcionalidades

- 👤 Gerenciamento de usuários
- 📦 Gerenciamento de produtos
- 📂 Gerenciamento de categorias
- 🛒 Gerenciamento de pedidos
- 💳 Pagamentos
- 🔍 Busca de recursos por ID
- ❌ Tratamento de exceções
- 📡 API REST

---

# 🧠 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- Banco H2
- PostgreSQL (caso configurado)
- Postman

---

# 📂 Arquitetura

```
Controller
      ↓
Service
      ↓
Repository
      ↓
Banco de Dados
```

O projeto segue a arquitetura em camadas, separando as responsabilidades da aplicação para facilitar manutenção, organização e reutilização do código.

---

# 📦 Estrutura do projeto

```
src/main/java

config
controller
service
repository
model
exception
```

---

# 📊 Modelo de domínio

O sistema é composto pelas seguintes entidades:

- User
- Order
- Product
- Category
- OrderItem
- Payment

Relacionamentos praticados durante o projeto:

- OneToMany
- ManyToOne
- ManyToMany
- OneToOne
- Chave composta com EmbeddedId

---

# 📡 Endpoints

## Usuários

| Método | Endpoint |
|---------|----------|
| GET | /users |
| GET | /users/{id} |
| POST | /users |
| PUT | /users/{id} |
| DELETE | /users/{id} |

---

## Produtos

| Método | Endpoint |
|---------|----------|
| GET | /products |
| GET | /products/{id} |

---

## Categorias

| Método | Endpoint |
|---------|----------|
| GET | /categories |
| GET | /categories/{id} |

---

## Pedidos

| Método | Endpoint |
|---------|----------|
| GET | /orders |
| GET | /orders/{id} |

---

# ⚙️ Conceitos praticados

Durante o desenvolvimento foram utilizados conceitos importantes como:

- API REST
- Spring Boot
- Spring Data JPA
- Hibernate
- Relacionamentos entre entidades
- Enum
- EmbeddedId
- Injeção de Dependência
- Arquitetura em Camadas
- Tratamento de exceções
- Serialização JSON

---

# ▶️ Como executar

Clone o projeto

```bash
git clone https://github.com/gabrielnormandio/workshop-api.git
```

Entre na pasta

```bash
cd workshop-api
```

Execute

```bash
./mvnw spring-boot:run
```

ou execute pela IDE.

---

# 💡 Aprendizados

Este projeto foi fundamental para consolidar conhecimentos em:

- Construção de APIs REST
- Persistência de dados com JPA
- Modelagem de banco de dados relacional
- Relacionamentos complexos entre entidades
- Organização de projetos Spring Boot
- Tratamento de erros em aplicações REST

---

# 👨‍💻 Autor

Gabriel Normandio de Lima

- LinkedIn: https://linkedin.com/in/gabrielnormandio
- GitHub: https://github.com/gabrielnormandio
