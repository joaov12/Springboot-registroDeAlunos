# CRUD de Gerenciamento de Alunos

<div><br>
  <img align="center" alt="Jv-Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg">
  <img align="center" alt="Jv-spring" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-plain-wordmark.svg">

  <img align="center" alt="jv-sql" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original-wordmark.svg">
  
</div>
<br>
Este é um projeto de exemplo que implementa um CRUD (Create, Read, Update, Delete) para gerenciamento de alunos utilizando as seguintes tecnologias:

- Java
- Spring Boot
- MySQL

O objetivo deste projeto é fornecer uma aplicação web simples e funcional para realizar operações básicas de cadastro, edição, listagem e exclusão de alunos.

## Pré-requisitos

Antes de executar este projeto, certifique-se de ter as seguintes ferramentas instaladas:

- JDK (Java Development Kit) 11 ou superior
- Maven
- MySQL

## Configuração do Banco de Dados

Antes de executar a aplicação, você precisa configurar o banco de dados. Siga as etapas abaixo:

    1. Crie um banco de dados no MySQL chamado `registrodealunos`.
    2. Abra o arquivo `src/main/resources/application.properties`.
    3. Modifique as propriedades `spring.datasource.username` 
       e `spring.datasource.password` de acordo com suas credenciais do MySQL.

## Executando a Aplicação

Siga as etapas abaixo para executar a aplicação:

    1. Clone este repositório para o seu ambiente local.
    2. Abra o terminal e navegue até o diretório raiz do projeto.
    3. Execute o seguinte comando para compilar o projeto:

```shell
mvn clean install
```

4. Após a compilação, execute o seguinte comando para iniciar a aplicação:

```shell
mvn spring-boot:run
```

5. A aplicação será iniciada e estará disponível em `http://localhost:8080`.

## Utilização da API

A API expõe os seguintes endpoints para gerenciamento de alunos:

- `GET /alunos/all`: Retorna a lista de todos os alunos cadastrados.
- `GET /alunos/find/{id}`: Retorna os detalhes de um aluno específico.
- `POST /alunos/add`: Cria um novo aluno com os dados fornecidos.
- `PUT /alunos/edit/{id}`: Atualiza os dados de um aluno existente.
- `DELETE /alunos/delete/{id}`: Exclui um aluno específico.

Para testar a API, você pode utilizar uma ferramenta como o Postman (Foi a que usei) mas você também pode usar a extensão Thunder Client do VsCode!

## Contribuição

Contribuições são muito bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request. Agradeço desde já!!!
