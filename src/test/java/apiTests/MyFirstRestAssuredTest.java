package apiTests;

import data.UserData;
import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class MyFirstRestAssuredTest {

    private static final String url = "https://reqres.in/";

    @Test
    public void checkAvatarIdTest () {
        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(url + "api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
    }
}
