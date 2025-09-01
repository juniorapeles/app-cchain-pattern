# 🧪 JA Starter Template

Template inicial para projetos Spring Boot com autenticação JWT, documentação Swagger/OpenAPI e banco de dados em memória H2.

---

## 🚀 Tecnologias

- **Java 21**
- **Spring Boot 3.2.5**
  - Spring Web
  - Spring Security
  - Spring Data JPA
- **JWT (JSON Web Token)**
- **H2 Database**
- **Swagger / Springdoc OpenAPI**
- **Maven**

---

## ⚡ Funcionalidades

- Autenticação e autorização com JWT
- CRUD básico com Spring Data JPA
- Banco em memória H2 para testes rápidos
- Documentação da API via Swagger/OpenAPI
- Estrutura modular para iniciar novos projetos rapidamente

---

## 📦 Estrutura do Projeto

```
src
├─ main
│  ├─ java
│  │  └─ xyz/juniorapeles/mananger
│  │     ├─ controller
│  │     ├─ service
│  │     ├─ model
│  │     ├─ repository
│  │     └─ security
│  └─ resources
│     ├─ application.properties
│     └─ data.sql
└─ test
   └─ java
```

---

## 🚀 Rodando o Projeto

1. Clone o repositório:
```bash
git clone <URL_DO_REPOSITORIO>
cd <NOME_DO_PROJETO>
```

2. Build e run com Maven:
```bash
mvn clean install
mvn spring-boot:run
```

3. Acesse a documentação Swagger:
```
http://localhost:8080/swagger-ui.html
```

---

## 🔐 Autenticação JWT

- Endpoint para login: `/auth/login`
- Receba o token JWT e envie no header `Authorization: Bearer <token>` para acessar endpoints protegidos.

---

## 🛠 Próximos Passos

- Configurar banco de dados PostgreSQL/MySQL
- Implementar testes unitários e de integração
- Criar templates para logging e monitoramento

