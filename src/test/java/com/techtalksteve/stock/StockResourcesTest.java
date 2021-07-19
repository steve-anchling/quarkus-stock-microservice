package com.techtalksteve.stock;

import com.techtalksteve.stock.entity.HistoricalStockEntity;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.common.mapper.TypeRef;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.tuple;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
public class StockResourcesTest {
    @Test
    public void testStockEndpoint() {
        final List<HistoricalStockEntity> stocks = given()
                .when().get("/stock/all")
                .then()
                .statusCode(200)
                .extract().as(new TypeRef<>() {});

        assertThat(stocks).extracting("id", "currency", "symbol", "open")
                .containsExactlyInAnyOrder(tuple(
                        1L,
                        Currency.getInstance(Locale.US),
                        "AAPL",
                        new BigDecimal("137.90")
                ));
    }

}