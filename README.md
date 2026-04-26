
# 🩺 Sistema de Gerenciamento de Casos Clínicos

Este projeto foi desenvolvido como parte da avaliação da 2ª Nota da disciplina de Banco de Dados do curso de Engenharia de Software. O objetivo é aplicar conceitos de modelagem relacional e integração entre uma aplicação Java e um banco de dados PostgreSQL.

---

## 📝 Descrição do Projeto
O sistema permite o cadastro, consulta, atualização e exclusão de casos clínicos, associando-os a professores responsáveis e perguntas específicas. A aplicação foca na organização acadêmica de estudos de caso para a área da saúde.

---

## 🚀 Tecnologias Utilizadas
* **Linguagem:** Java
* **Interface Gráfica:** Java Swing
* **Banco de Dados:** PostgreSQL
* **Bibliotecas:** JDBC (PostgreSQL Driver)

---

## 📂 Estrutura do Repositório
* `/diagrama`: Contém o Diagrama Entidade-Relacionamento (DER).
* `/ddl`: Scripts de criação das tabelas e chaves (PK/FK).
* `/dml`: Scripts de inserção (população) e manipulação de dados.
* `/dql`: Scripts de consultas complexas (Inner, Left e Right Joins).
* `/TrabalhoJava`: Código-fonte da aplicação Java.

---

## 📸 Capturas de Tela

### 1. Tela de Login
![Login]<img width="752" height="518" alt="Login tela" src="https://github.com/user-attachments/assets/71b32948-aa6a-4918-958b-5e651432ea4a" />


### 2. Menu Principal
![Menu Principal]<img width="750" height="512" alt="Tela Principal" src="https://github.com/user-attachments/assets/ead43cf6-0eaf-4af5-aef3-f4bb73065de2" />

### 3. Consulta com JOIN
![Consulta Join]<img width="752" height="545" alt="image" src="https://github.com/user-attachments/assets/f6350ae6-bb6b-4c9a-b91b-1e9a5b119576" />


---

## 🛠️ Instruções de Execução
Para rodar este projeto localmente, siga estes passos:

1.  **Configurar o Banco de Dados:**
    * Crie um banco de dados no PostgreSQL.
    * Execute o script localizado em `/ddl/script.sql`.
    * (Opcional) Execute `/dml/script.sql` para inserir dados de teste.
2.  **Configurar a Aplicação:**
    * Abra o projeto na sua IDE (NetBeans, IntelliJ, etc.).
    * Na classe de Conexão, ajuste a URL do banco, usuário e senha.
3.  **Executar:**
    * Rode a classe principal de Login localizada na pasta `view` e `TelaInicial`.

---

## 🎥 Demonstração em Vídeo
Confira a explicação detalhada do sistema, do código e das consultas SQL:
👉 [Insira o Link do Vídeo Aqui]

---

## 👤 Desenvolvedora
* **Nome:** Emanuel Cândido da Silva Lima
* **Disciplina:** Banco de Dados
