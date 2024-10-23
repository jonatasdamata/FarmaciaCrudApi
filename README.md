# API de Estoque Farmacêutico
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/jonatasdamata/FarmaciaCrudApi/blob/master/LICENSE) 


## Descrição
Uma API CRUD para controle de estoque de medicamentos desenvolvida com **Spring Boot** e **MySQL**. <br>
Esta API permite gerenciar o estoque de medicamentos, proporcionando funcionalidades para cadastrar, pesquisar, editar e deletar itens do estoque. O projeto foi desenvolvido utilizando as melhores práticas de desenvolvimento de APIs RESTful.

## Funcionalidades

- **Cadastro de Medicamentos**: Permite adicionar novos medicamentos ao estoque.
- **Pesquisa de Medicamentos por ID**: Permite buscar medicamentos por código de identificação.
- **Edição de Medicamentos**: Permite atualizar informações de medicamentos existentes.
- **Exclusão de Medicamentos**: Permite remover medicamentos do estoque.
- **Listagem de Medicamentos**: Permite obter uma lista de todos os medicamentos disponíveis no estoque.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.1**
- **MySQL 8.0.37**
- **Spring Data JPA**
- **Maven**
- **Postman** (para consumo da API)

## Imagens do Projeto

![Captura de tela 2024-10-23 095356](https://github.com/user-attachments/assets/60bae9b0-e541-4d9d-a559-343cfaae9da6)


## Como Executar o Projeto

### Pré-requisitos

1. Certifique-se de ter o [Java JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) instalado.
2. Tenha o [MySQL](https://www.mysql.com/downloads/) instalado e em execução.
3. Certifique-se de ter o [Maven](https://maven.apache.org/download.cgi) instalado.

### Configuração do Banco de Dados

1. Crie um banco de dados no MySQL chamado `farmacia_db`.
2. Configure as credenciais de acesso no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/farmacia_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

## Executando a Aplicação

### Clone este repositório:
```bash
git clone https://github.com/jonatasdamata/FarmaciaCrudApi
```

### Navegue até o diretório do projeto:
```bash
cd farmacia
```
A API estará disponível em http://localhost:8080

## Endpoints da API

| Método | Endpoint                       | Descrição                        |
|--------|--------------------------------|----------------------------------|
| POST   | /api/items                    | Cadastra um novo medicamento      |
| GET    | /api/items/{id}               | Obtém um medicamento pelo ID      |
| PUT    | /api/items/{id}               | Atualiza um medicamento pelo ID   |
| DELETE | /api/items/{id}               | Remove um medicamento pelo ID     |
| GET    | /api/items                    | Obtém todos os medicamentos       |


## Autor

Jonatas da Mata <br>
https://www.linkedin.com/in/jonatasdamata/
