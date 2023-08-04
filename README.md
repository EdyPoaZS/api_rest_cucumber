# Teste de API
Automação de Testes com Rest Assured

Projeto escrito com [Rest Assured](https://rest-assured.io/).


## Pré requisitos

Para clonar e executar este projeto, você precisará de:

- [git](https://https://gitlab.com/)
- [IntelliJ](https://www.jetbrains.com/pt-br/idea/)
- [Java 1.5 ou superior](https://www.java.com/pt-BR/download/)

## Dependências
- [Rest Assured](https://mvnrepository.com/artifact/io.rest-assured)
- [Cucumber](https://mvnrepository.com/artifact/io.cucumber)

Para instalar as dependências de desenvolvimento, será necessário copiar as tags e colar no arquivo pom.xml.

## Executando os testes

Após ter clonado o projeto e configurado o ambiente para executar os testes deve executar o arquivo TestDummyjson.feature.
No arquivo contém os seguintes cenários de testes:

- Validar status da aplicação
- Validar usuário para autenticação
- Validar criação de token para Autenticação
- Validar busca de produtos autenticados com token válido
- Validar busca de todos produtos
- Validar busca por produto existente
- Validar busca por produto inexistente



### Estrutura do Projeto

Arquivo: **TestDummyjson.feature** -> Localizado dentro da pasta **\\src\test\java\features:** contém os cenários de testes que descreve os requisitos e critérios de aceite do comportamento do serviço.

Arquivo: **TestDummyjsonMetodosSteps** -> Localizado dentro da pasta **\\src\test\java\steps:** contém a implementação/desenvolvimento dos métodos.

Arquivo: **TestDummyjsonSteps** -> Localizado dentro da pasta **\\src\test\java\steps:** contém as steps gerado através do arquivo TestDummyjson.feature, é onde são chamados os métodos.

Arquivo: **BaseTest** -> Localizado dentro da pasta **\\src\test\java\core:** contém as configurações estaticas que serão utilizadas no execução dos testes.

Arquivo: **Constantes** -> Localizado dentro da pasta **\\src\test\java\core:** contém as informações estaticas, como por exemplo: endereço do end-point, porta e etc.



### Técnicas utilizadas de teste
Foram utilizadas tecnicas de participação de equivalencia (Ex. cenarios com token valido, inválido e inexistente) nos verbos/contratos disponiveis.

___

Feito com ❤️ por [Edenilson Machado](https://www.linkedin.com/in/edenilson-machado-ctfl-ctal-ta-ctfl-at/).
