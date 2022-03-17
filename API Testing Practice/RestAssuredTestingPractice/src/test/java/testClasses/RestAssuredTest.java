package testClasses;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class RestAssuredTest {
    /*
    * Below method prints the response of below https rquest on the console
    */
    public static void getResponseBody(){
        given().when().get("https://gorest.co.in/public/v2/posts").then().log().all();
    }

    /*
    * Below method prints the body of the response of below https request which satisfies all the parameter values
    */
    public static void getResponseWithQueryParameters(){
        given().queryParam("id", "1420")
                .queryParam("user_id","2915")
                .when()
                .get("https://gorest.co.in/public/v2/posts")
                .then()
                .log()
                .body();
    }

    /*
    * if we pass invalid query paramters , we can generate failure status codes e.g. 4XX / 5XX
    */
    public static void getResponseStatusCode(){
        int statusCode = given().queryParam("id", "1420")
                                .queryParam("user_id","2915")
                                .when()
                                .get("https://gorest.co.in/public/v2/posts")
                                .getStatusCode();
        System.out.println("The status code is : "+statusCode);

        given().when().get("https://gorest.co.in/public/v2/posts").then().assertThat().statusCode(200);
    }

    public static void getResponseHeaders(){

        System.out.println("Response Header : "+get("https://gorest.co.in/public/v2/posts").then().extract().headers());
    }
}
