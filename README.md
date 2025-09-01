# 🧪 JA Validation Chain Template

Template inicial para projetos Spring Boot focado em implementação do padrão **Chain of Responsibility** e uso de **Factory Pattern** para composição de validações.

---

## 🚀 Tecnologias

* **Java 21**
* **Spring Boot 3.2.5**

  * Spring Web
  * Spring Dependency Injection
* **Maven**

---

## ⚡ Padrões de Projeto Utilizados

### 1️⃣ Chain of Responsibility

* Permite encadear múltiplos validadores (`ValidationHandler`) de forma sequencial
* Cada handler processa o objeto ou passa para o próximo
* Facilita a adição de novas validações sem alterar o código existente
* Exemplo: validar CPF, e-mail, duplicidade de cliente em uma sequência

### 2️⃣ Factory Pattern

* Usado para criar e montar a chain de validação automaticamente
* `ValidationChainFactory` recebe todos os handlers do Spring, ordena e encadeia
* O service obtém a chain pronta sem precisar saber da composição interna

---

## 📦 Estrutura do Projeto

```
src
├─ main
│  ├─ java
│  │  └─ xyz/juniorapeles/mananger
│  │     ├─ controller
│  │     ├─ service
│  │     │  └─ customer
│  │     │     └─ chain
│  │     │        ├─ AbstractValidationHandler.java
│  │     │        ├─ ValidationHandler.java
│  │     │        └─ factory
│  │     │           └─ ValidationChainFactory.java
│  │     ├─ model
│  │     └─ repository
│  └─ resources
└─ test
   └─ java
```

---

## 🚀 Usando a Chain no Service

```java
@Service
public class CustomerService {
    private final ValidationHandler chain;

    public CustomerService(ValidationChainFactory factory) {
        this.chain = factory.validationChain();
    }

    public void registerCustomer(CustomerDTO customer) {
        chain.handle(customer);
        System.out.println("Cliente registrado com sucesso!");
    }
}
```

---

## 🛠 Próximos Passos

* Adicionar mais validadores customizados
* Integrar com logs ou interceptors para monitoramento de validações
* Criar testes unitários para cada handler
