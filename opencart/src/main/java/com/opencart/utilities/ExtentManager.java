package com.opencart.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    public static ExtentReports extent;

    public static ExtentReports createInstance() {
        String fileName = System.getProperty("user.dir") + "/reports/extent-report.html";
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setReportName("Functional Testing");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Tester", "Test Engineer");
        extent.setSystemInfo("OS", "Mac OS X");
        extent.setSystemInfo("Browser", "Chrome");

        return extent;
    }
}