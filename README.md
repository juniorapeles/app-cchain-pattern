# 🧪 JA Validation Chain Template

Template inicial para projetos Spring Boot focado em implementação do padrão Chain of Responsibility para validação de objetos.

---

## 🚀 Tecnologias

* **Java 21**
* **Spring Boot 3.2.5**

  * Spring Web
  * Spring Dependency Injection
* **Maven**

---

## ⚡ Funcionalidades

* Implementação do padrão **Chain of Responsibility**
* Validação de objetos `CustomerDTO`
* Extensível para adicionar novos validadores sem modificar a lógica existente
* Injeção de dependências Spring para composição dinâmica da chain

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

## 🔗 Configurando a Chain

* Criar handlers específicos estendendo `AbstractValidationHandler`
* Anotar com `@Order` para definir a sequência
* Registrar todos os handlers no Spring
* A fábrica `ValidationChainFactory` monta automaticamente a chain na ordem correta

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
