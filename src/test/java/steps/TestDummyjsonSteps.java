package steps;

import core.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDummyjsonSteps  {

    @Before
    public void iniciar(){
           BaseTest.setup();
     }

    @Given("que eu informe o endpoint {string}")
    public void que_eu_informe_o_endpoint(String uri) {

    }
    @Then("deve retornar o codigo {int}")
    public void deve_retornar_o_codigo(Integer int1) {
       TestDummyjsonMetodosSteps.TestStatusAplicacao(int1);

    }
    @And("a resposta do campo status {string}")
    public void a_resposta_do_campo_status(String msg) {
        TestDummyjsonMetodosSteps.TestMensagemStatus(msg);
    }
    @And("a resposta do campo method {string}")
    public void a_resposta_do_campo_method(String msg) {
        TestDummyjsonMetodosSteps.TestMensagemMethod(msg);
    }

    @Given("busco usuario pelo firstName {string}")
    public void busco_usuario_pelo_first_name(String user) {
    TestDummyjsonMetodosSteps.BuscaUsuario(user);
    }
    @Then("deve retornar o campo username preenchido")
    public void deve_retornar_o_campo_username_preenchido() {

    }
    @Then("deve retornar o campo password preenchido")
    public void deve_retornar_o_campo_password_preenchido() {

    }


    @Given("informo {string} e {string}")
    public void informo_e(String username, String password) {
        TestDummyjsonMetodosSteps.CriaToken(username,password);
    }
    @Then("deve retornar o token gerado")
    public void deve_retornar_o_token_gerado() {

    }

    @Then("informo token autenticado válido {string} e codigo {int}")
    public void informo_token_autenticado_valido_e_codigo(String token, Integer int1) {

    }




    @Then("deve retornar o codigo {int} ao informar os campos title {string}, description {string}, price {string}, discountPercentage {string}, rating {string}, stock {string}, brand {string}, category {string}, thumbnail {string}")
    public void deve_retornar_o_codigo_ao_informar_os_campos_title_description_price_discount_percentage_rating_stock_brand_category_thumbnail(Integer int1, String title, String description, String price, String discountPercentage, String rating, String stock, String brand, String category, String thumbnail) {
     TestDummyjsonMetodosSteps.validaAddProducts(int1,title,description,price,discountPercentage,rating,stock,brand,category,thumbnail);
    }


    @Then("deve retornar o status {int}")
    public void deve_retornar_o_status(Integer int1) {
        TestDummyjsonMetodosSteps.validaBuscaTodosProdutos(int1);
           }

    @And("deve retornar todos os produtos\"")
    public void deve_retornar_todos_os_produtos() {

    }




    @Then("ao informar o codigo {string} retornar o status {int}")
    public void ao_informar_o_codigo_retornar_o_status(String str, Integer int1) {
       TestDummyjsonMetodosSteps.validaBuscaPorProduto(int1, str);
    }

    @Then("ao informar o codigo de produto inexistente {string} retorna o status  {int} e a mensagem  {string}")
    public void ao_informar_o_codigo_de_produto_inexistente_retorna_o_status_e_a_mensagem(String str, Integer int1, String mensagem) {
     TestDummyjsonMetodosSteps.validaBuscaPorProdutoInexistente(int1, str, mensagem);
    }

    @When("informo um token autenticado válido")
    public void informo_um_token_autenticado_válido() {

    }
    @Then("deve retornar o codigo {string}")
    public void deve_retornar_o_codigo(String str) {
        TestDummyjsonMetodosSteps.BuscaProdutosAutenticado(str);

    }

    @Then("deve retornar a listagem de produtos")
    public void deve_retornar_a_listagem_de_produtos() {

    }


    @Given("que eu acesso o endpoint {string}")
    public void que_eu_acesso_o_endpoint(String string) {

    }
    @Then("informo token {string} válido <token> deve retornar o codigo {int} e a mensagem {string} e name {string}")
    public void informo_token_válido_token_deve_retornar_o_codigo_e_a_mensagem_e_name(String string, Integer int1, String string2, String string3) {

        }


    @Then("informo token {string} <token> deve retornar o codigo {string} e a mensagem {string} e name {int}")


    @Then("informo token {string} deve retornar o codigo {int} e a mensagem {string}")
    public void informo_token_deve_retornar_o_codigo_e_a_mensagem_e_name(String string, Integer int1, String string2) {
    TestDummyjsonMetodosSteps.BuscaProdutosSemAutenticado(string, string2, int1);
    }

}
