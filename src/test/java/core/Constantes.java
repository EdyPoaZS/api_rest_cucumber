package core;

import io.restassured.http.ContentType;

public interface Constantes {
    String APP_BASE_URL = "https://dummyjson.com";
    Integer APP_PORT = 443; //https = 443 , http = 80
    String APP_BASE_PATH = "";

   ContentType APP_CONContentType = ContentType.JSON;

    long MAX_TIMEOUT = 5000L;


}
