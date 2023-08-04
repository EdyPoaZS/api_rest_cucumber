Feature: Validando o funcionamento da API "dummyjson"

  Como usuario da API "dummyjson"
  Desejo executar as requisições GETs e POSTs
  Para validar o funcionamento das operações disponibilizadas pelo serviço

  Scenario: Validar status da aplicação
    Given que eu informe o endpoint "test"
    Then  deve retornar o codigo 200
    And   a resposta do campo status "ok"
    And   a resposta do campo method "GET"

  Scenario: Validar usuário para autenticação
    Given que eu informe o endpoint "users"
    And   busco usuario pelo firstName "Terry"
    Then  deve retornar o codigo 200
    And   deve retornar o campo username preenchido
    And   deve retornar o campo password preenchido

  Scenario: Validar criação de token para Autenticação
    Given que eu informe o endpoint "auth/login"
    And   informo "kminchelle" e "0lelplR"
    Then  deve retornar o token gerado

  Scenario: Validar busca de produtos autenticados com token válido
    Given que eu informe o endpoint "auth/products"
    When  informo um token autenticado válido
    Then  deve retornar o codigo "200"
    And   deve retornar a listagem de produtos

   Scenario:  Validar busca de todos produtos
     Given que eu informe o endpoint "products"
     Then  deve retornar o status 200
     And   deve retornar todos os produtos"

  Scenario Outline: Validar busca por produto existente
    Given que eu informe o endpoint <uri>
    Then ao informar o codigo <str> retornar o status <int1>
    Examples:
      | uri         | str   | int1 |
      | "products/" | "1"   | 200  |
      | "products/" | "2"   | 200  |
      | "products/" | "3"   | 200  |
      | "products/" | "4"   | 200  |
      | "products/" | "10"  | 200  |
      | "products/" | "20"  | 200 |
      | "products/" | "100" | 200 |

  Scenario Outline: Validar busca por produto inexistente
    Given que eu informe o endpoint <uri>
    Then ao informar o codigo de produto inexistente <str> retorna o status  <int1> e a mensagem  <mensagem>
    Examples:
      | uri         | str   | int1   | mensagem                        |
      | "products/" | "0"   | 404    | "Product with id '0' not found" |
      | "products/" | "101" | 404  | "Product with id '101' not found" |
      | "products/" | "200" | 404  | "Product with id '200' not found" |
      | "products/" | "230" | 404  | "Product with id '230' not found" |
      | "products/" | "539" | 404  | "Product with id '539' not found" |