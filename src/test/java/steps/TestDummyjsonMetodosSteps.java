package steps;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;

public class TestDummyjsonMetodosSteps  {

        public static void TestStatusAplicacao(Integer int1) {
       given()
      .when().get("/test")
      .then()
      .assertThat()
      .statusCode(int1);
    }

    public static void TestMensagemStatus(String msg) {
         given()
        .when().get("/test")
        .then()
        .body("status", is(msg));
    }

    public static void TestMensagemMethod(String msg) {
        given()
        .when().get("/test")
        .then()
        .body("method", is(msg));
    }

    public static void BuscaUsuario(String user){
       given()
       .when().get("/users")
       .then()
       .body("users.firstName", hasItem(user))
       .body("users.password",is(notNullValue()))
       .body("users.username", is(notNullValue()));
    }
    public static void CriaToken(String username, String password){
        JsonObject requestParams = new JsonObject();
        requestParams.add("username", username);
        requestParams.add("password", password);
        String token = given().contentType(ContentType.JSON)
        .body(requestParams.toString())
        .when().post("/auth/login")
        .then().statusCode(200)
        .extract()
        .path("token");
        System.out.println("O Token gerado: " + token);
    }

    public static void BuscaProdutosAutenticado(String str){
        String tk =  given()
        .body("{\n" +
                    "    \"username\": \"kminchelle\",\n" +
                    "    \"password\": \"0lelplR\"\n" +
                        "}")
       .when().post("/auth/login")
       .then().statusCode(Integer.parseInt(str))
       .extract()
       .path("token");

        given()
        .header("Authorization",  tk)
        .when().get("/auth/products")
        .then()
        .assertThat()
        .statusCode(Integer.parseInt(str))
         .body("products", is(notNullValue()));
    }

    public static void BuscaProdutosSemAutenticado(String str, String msg, Integer int1){
        given()
       .header("Authorization",  str)
       .when().get("/auth/products")
       .then().assertThat()
       .statusCode(int1)
       .body("message", is(msg));
    }


  public static void validaAddProducts(Integer int1, String title, String description, String price, String discountPercentage, String rating, String stock, String brand, String category, String thumbnail){
      JsonObject requestParams = new JsonObject();
      requestParams.add("title", title);
      requestParams.add("description", description);
      requestParams.add("price", price);
      requestParams.add("discountPercentage", 8);
      requestParams.add("rating", rating);
      requestParams.add("stock", stock);
      requestParams.add("brand", brand);
      requestParams.add("category", category);
      requestParams.add("thumbnail", thumbnail);
      given()
      .body(requestParams.toString())
      .when().post("/products/add")
      .then().statusCode(int1)
      .body("id", is(notNullValue()))
      .body("title", is(title))
      .body("description", is(description))
      .body("price", is(price))
      .body("discountPercentage", is(discountPercentage))
      .body("rating", is(rating))
      .body("stock", is(stock))
      .body("brand", is(brand))
      .body("category", is(category))
      .body("thumbnail", is(thumbnail));
  }

  public static void validaBuscaTodosProdutos(Integer int1) {
       given()
      .when()
      .get("/products")
      .then()
      .assertThat().statusCode(int1)
      .body("products", notNullValue());
  }

    public static void validaBuscaPorProduto(Integer int1, String str){
        given()
        .when().get("products/"+str)
        .then()
        .assertThat()
        .statusCode(int1)
        .body("$", notNullValue());

    }

    public static void validaBuscaPorProdutoInexistente(Integer int1, String str, String mensagem){
         given()
        .when().get("products/"+str)
        .then()
        .assertThat()
        .statusCode(int1)
        .body("message",is("Product with id " +"'"+ str +"'" + " not found"));
    }
}
