# 📌 Sobre o Projeto

O **Investimento Financeiro com Servlet** é uma aplicação Java Web desenvolvida para simular o rendimento de diferentes tipos de investimentos, permitindo que o usuário informe um valor inicial, um prazo em meses e o tipo de investimento desejado.

---

## 🎯 Objetivo

Desenvolver uma aplicação web utilizando Java Servlets e uma classe de regra de negócio, aplicando os conceitos de programação Java e desenvolvimento web trabalhados em aula.

---

## ⚙️ Funcionalidades

### 💰 Simulação de Investimentos

- Informar o valor inicial do investimento.
- Definir a quantidade de meses da aplicação.
- Selecionar o tipo de investimento:
  - Poupança
  - CDI
  - Tesouro Direto
- Calcular o rendimento utilizando juros compostos.
- Exibir o valor inicial, tipo de investimento, período e valor final.

### 📈 Taxas de Rendimento

- **Poupança:** 0,38% ao mês.
- **CDI:** 0,53% ao mês.
- **Tesouro Direto:** 0,65% ao mês.

---

## 🧠 Tecnologias Utilizadas

### Backend
- Java 8
- Java Servlets
- Apache Tomcat 9
- Orientação a Objetos
- `Math.pow()` para cálculo de juros compostos

### Frontend
- HTML5
- CSS3

### Ambiente de Desenvolvimento
- Eclipse IDE

---

## 📐 Regra de Negócio

O cálculo do investimento utiliza a fórmula de juros compostos:

```text
M = C * (1 + i)^t
```

Onde:

- **M:** montante final.
- **C:** capital inicial.
- **i:** taxa de juros mensal (dividida por 100).
- **t:** quantidade de meses.

A classe `Investimento` é responsável por aplicar a taxa correspondente ao tipo de investimento selecionado e calcular o montante final.

---

## 🧩 Arquitetura

```text
Frontend (HTML + CSS)
        ↓
ServletInvestimento
        ↓
Classe Investimento (Business)
        ↓
Cálculo do Montante
        ↓
Resultado apresentado ao usuário
```

---

## 📂 Estrutura do Projeto

```text
Investimento-Financeiro-com-Servlet
│
├── src
│   ├── Business
│   │   └── Investimento.java
│   │
│   └── ServletInvestimento.java
│
└── WebContent
    ├── index.html
    └── style.css
```

---

## 🚀 Como executar o projeto

### 🔧 Pré-requisitos

- Java JDK/JRE 8.
- Eclipse IDE com suporte a projetos Web.
- Apache Tomcat 9.

### 💻 Execução

1. Importe o projeto no Eclipse.
2. Configure o Apache Tomcat 9 como servidor.
3. Configure o projeto para utilizar o runtime do Tomcat.
4. Execute o projeto no servidor.
5. Acesse a aplicação pelo navegador:

```text
http://localhost:8080/-Investimento-Financeiro-com-Servlet/
```

6. Informe os dados do investimento e clique em **Calcular**.

---

## 📊 Status do Projeto

✔ Formulário HTML desenvolvido  
✔ Seleção dos três tipos de investimento  
✔ Implementação da classe de negócio `Investimento`  
✔ Implementação do Servlet `ServletInvestimento`  
✔ Cálculo de juros compostos  
✔ Integração entre formulário, Servlet e classe de negócio  
✔ Exibição dos resultados no navegador  
✔ Testes realizados com os três tipos de investimento  

---

## 👨‍💻 Equipe

- João Paulo Zimmermann Matsui - [GitHub](https://github.com/JP-GhOsT) | [LinkedIn](https://linkedin.com/in/joaomatsui)
- Gustavo Sena de Souza - [GitHub](https://github.com/senaGustavo) | [LinkedIn](https://www.linkedin.com/in/gustavo-sena-ads-ia/)

---

## ⭐ Observação

Este projeto foi desenvolvido com finalidade acadêmica, aplicando conceitos de Java Web, Servlets, orientação a objetos e separação entre camada de apresentação e regra de negócio.

As taxas de rendimento utilizadas são fictícias e possuem finalidade exclusivamente didática.

---

**Project:** Investimento Financeiro com Servlet  
**Platform:** Java Web  
**Server:** Apache Tomcat 9  
**Language:** Java 8
