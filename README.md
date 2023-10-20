# crud-spring-product
Repositório destinado a documentação do aprendizado em Spring boot.

## API Product-Controller

Este repositório contém uma API RESTful que lida com operações CRUD (Create, Read, Update, Delete) de produtos. A API pode ser executada na porta 8080 do Spring Boot e fornece acesso à documentação da API através do Swagger UI na mesma porta.

## Endpoints

A API possui os seguintes endpoints:

- **GET /api/product**: Recupera a lista de todos os produtos.
- **PUT /api/product**: Atualiza um produto existente.
- **POST /api/product**: Cria um novo produto.
- **DELETE /api/product/{id}**: Exclui um produto com o ID especificado.

## Banco de dados

Foi utilizado o Postgres para o projeto, com isso é necesário criar anteriormente um banco chamado ```product```, por padrão ele executa na porta ```5432```, outros detalhes pondem ser vistos em ```resources/application.properties```.

## Executando a API

Certifique-se de ter o ambiente de desenvolvimento configurado corretamente, incluindo o Java e o Spring Boot.

1. Clone este repositório em seu ambiente local.
2. Navegue até a pasta do projeto.
3. Execute o aplicativo Spring Boot que possui o main como ```CrudTutorialApplication.java``` e se encontra na raiz de ```crudtutorial```.

A aplicação será iniciada na porta 8080.

## Acesso ao Swagger

Você pode acessar a documentação da API e experimentar os endpoints usando o Swagger UI.

Abra um navegador e acesse o seguinte URL:

```
http://localhost:8080/swagger-ui.html
```

Isso abrirá a interface do Swagger, onde você pode explorar e testar todos os endpoints disponíveis na API.

## Contribuição

Se você encontrar problemas ou desejar adicionar novos recursos, crie uma issue ou envie um pull request. Agradeço a sua colaboração!
