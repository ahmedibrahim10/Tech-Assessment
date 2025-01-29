package tests;
import io.qameta.allure.Attachment;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class CatFactsApiTest  {

    @Test
    public void testRandomCatFact()  {
        RestAssured.baseURI = "https://catfact.ninja/"; // Get the Base URI
        // Fetch the Response from the endpoint
        Response response = given()
                .when()
                .get("/fact")
                .then()
                .extract().response();

        String responseBody = response.getBody().asString(); // get the respose body as string
        System.out.println("Response Body: " + responseBody);
        attachResponse(responseBody);
        String fact = response.jsonPath().getString("fact");
        Assert.assertNotNull(fact, "Fact is null or empty."); // Check if Fact is NULL
        System.out.println("Random Cat Fact: " + fact);


}
    @Attachment(value = "API Response", type = "text/plain")
    private String attachResponse(String response) {
        return response;
    }



}
