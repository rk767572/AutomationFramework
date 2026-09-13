package com.opencart.tests;

import com.opencart.utilities.ApiUtility;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTest {

    @Test
    public void verifyGetUserAPI() {
        String endPoint = "https://jsonplaceholder.typicode.com/users/1";
        Response response = ApiUtility.sendGetRequest(endPoint);
        
        boolean isValidCode = ApiUtility.validateStatusCode(response, 200);
        Assert.assertTrue(isValidCode, "Status code is not 200");

        String username = ApiUtility.getJsonValue(response, "username");
        Assert.assertEquals(username, "Bret", "Username does not match");
    }

    @Test
    public void verifyPostUserAPI() {
        String endPoint = "https://jsonplaceholder.typicode.com/posts";
        String payload = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}";
        
        Response response = ApiUtility.sendPostRequest(endPoint, payload);
        
        boolean isValidCode = ApiUtility.validateStatusCode(response, 201);
        Assert.assertTrue(isValidCode, "Status code is not 201");
        
        String title = ApiUtility.getJsonValue(response, "title");
        Assert.assertEquals(title, "foo", "Title does not match");
    }
}