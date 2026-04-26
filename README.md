# 🩺 Sistema de Gerenciamento de Casos Clínicos

[cite_start]Este projeto foi desenvolvido como parte da avaliação da 2ª Nota da disciplina de **Banco de Dados** [cite: 1, 2] do curso de Engenharia de Software. [cite_start]O objetivo é aplicar conceitos de modelagem relacional e integração entre uma aplicação Java e um banco de dados PostgreSQL[cite: 7, 8, 10].

---

## 📝 Descrição do Projeto
[cite_start]O sistema permite o cadastro, consulta, atualização e exclusão de casos clínicos, associando-os a professores responsáveis e perguntas específicas[cite: 12, 21]. A aplicação foca na organização acadêmica de estudos de caso para a área da saúde.

---

## 🚀 Tecnologias Utilizadas
* [cite_start]**Linguagem:** Java (JDK 17+) [cite: 17, 41]
* [cite_start]**Interface Gráfica:** Java Swing [cite: 30]
* [cite_start]**Banco de Dados:** PostgreSQL [cite: 41]
* [cite_start]**Bibliotecas:** JDBC (PostgreSQL Driver) [cite: 18]

---

## 📂 Estrutura do Repositório
[cite_start]Conforme os requisitos do trabalho[cite: 31, 32]:

* [cite_start]`📁 /diagrama`: Contém o Diagrama Entidade-Relacionamento (DER)[cite: 33].
* [cite_start]`📁 /ddl`: Scripts de criação das tabelas e chaves (PK/FK)[cite: 34].
* [cite_start]`📁 /dml`: Scripts de inserção (população) e manipulação de dados[cite: 35].
* [cite_start]`📁 /dql`: Scripts de consultas complexas (Inner, Left e Right Joins)[cite: 36].
* [cite_start]`📁 /src`: Código-fonte da aplicação Java[cite: 37].

---

## 📸 Capturas de Tela
[cite_start]*(Substitua os links abaixo pelas imagens reais do seu sistema após fazer o upload no GitHub)* [cite: 42]

### 1. Tela de Login
[cite_start]![Login](https://via.placeholder.com/600x400?text=Screenshot+da+Tela+de+Login) [cite: 43]

### 2. Menu Principal
[cite_start]![Menu Principal](https://via.placeholder.com/600x400?text=Screenshot+do+Menu+Principal) [cite: 44]

### 3. Consulta com JOIN (Resultado)
[cite_start]![Consulta Join](https://via.placeholder.com/600x400?text=Screenshot+da+Consulta+com+JOIN) [cite: 45]

---

## 🛠️ Instruções de Execução
[cite_start]Para rodar este projeto localmente, siga estes passos[cite: 46]:

1.  **Configurar o Banco de Dados:**
    * Crie um banco de dados no PostgreSQL.
    * Execute o script localizado em `/ddl/script.sql`.
    * (Opcional) Execute `/dml/script.sql` para dados de teste.
2.  **Configurar a Aplicação:**
    * Abra o projeto no NetBeans ou IntelliJ.
    * No arquivo `Conexao.java`, ajuste a URL do banco, usuário e senha.
3.  **Executar:**
    * Rode a classe `Login.java` na pasta `view`.

---

## 🎥 Demonstração em Vídeo
Confira a explicação detalhada do sistema, do código e das consultas SQL:
[cite_start]👉 [Link para o Vídeo no YouTube/Drive] [cite: 47, 53]

---

## 👤 Desenvolvedor
* **Nome:** Vitória Beatriz Carvalho Silva
* [cite_start]**Disciplina:** Banco de Dados [cite: 2]
* [cite_start]**Professor:** Anderson Costa [cite: 3]
