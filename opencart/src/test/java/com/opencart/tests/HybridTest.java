package com.opencart.tests;

import com.opencart.base.BaseClass;
import com.opencart.utilities.ApiUtility;
import com.opencart.utilities.ExtentReportManager;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HybridTest extends BaseClass {

    @Test
    public void verifyHybridWorkflow() {
        // Step 1: API Testing Validation
        ExtentReportManager.test.info("Sending GET request to JSONPlaceholder API");
        String endPoint = "https://jsonplaceholder.typicode.com/users/1";
        Response response = ApiUtility.sendGetRequest(endPoint);
        
        boolean isValidCode = ApiUtility.validateStatusCode(response, 200);
        Assert.assertTrue(isValidCode, "API Status code is not 200");
        ExtentReportManager.test.info("API Status code verified as 200");

        String username = ApiUtility.getJsonValue(response, "username");
        Assert.assertEquals(username, "Bret", "API Username does not match");
        ExtentReportManager.test.info("API Username validated successfully: " + username);
        
        System.out.println("API Verification Passed Successfully in Hybrid Flow!");

        // Step 2: UI Testing Validation
        ExtentReportManager.test.info("Validating Opencart browser title");
        String currentTitle = driver.getTitle();
        System.out.println("Opencart Browser Title: " + currentTitle);
        
        Assert.assertTrue(currentTitle != null, "Browser title is null");
        ExtentReportManager.test.info("UI Title verified successfully: " + currentTitle);
    }
}