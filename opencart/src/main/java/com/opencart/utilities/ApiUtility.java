package com.opencart.utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiUtility {
    public static Response sendGetRequest(String endPoint) {
        return RestAssured.get(endPoint);
    }

    public static Response sendPostRequest(String endPoint, String payload) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .body(payload)
                .post(endPoint);
    }

    public static boolean validateStatusCode(Response response, int statusCode) {
        return response.getStatusCode() == statusCode;
    }

    public static String getJsonValue(Response response, String value) {
        return response.jsonPath().getString(value);
    }
}