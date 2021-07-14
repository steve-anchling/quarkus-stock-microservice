package com.techtalksteve.stock;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class StockResourcesTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/stock/all")
          .then()
             .statusCode(200);
    }

}