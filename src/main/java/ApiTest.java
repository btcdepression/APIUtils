import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest {
    public static String sendGetRequest(String url) {
        RestAssured.baseURI = url;
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/posts")
                .then()
                .extract().response();
    //assertEquals(200, response.statusCode());
    return response.asString();
    }
}
