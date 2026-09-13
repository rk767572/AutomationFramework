# 🛒 Enterprise-Grade Hybrid Automation Framework - Opencart

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-4.21.0-green.svg)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-7.10.2-red.svg)](https(https://testng.org/))
[![Maven](https://img.shields.io/badge/Maven-Build-blue.svg)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

An industry-standard, robust **Hybrid Test Automation Framework** built from scratch for the **Opencart** e-commerce platform. Designed using **Page Object Model (POM)** with Page Factory, data-driven capabilities, and comprehensive reporting.

---

## 🚀 Key Features

* **Design Pattern**: Implements **Page Object Model (POM)** with Page Factory for clear separation of test logic and page locators.
* **Test Execution**: Managed via **TestNG** suite xml files supporting parallel execution and group-based testing.
* **Reporting**: Integrated **ExtentReports (v5)** for rich, HTML-based visual test execution reports accompanied by automated screenshots on test failures.
* **Cross-Browser Support**: Configured to run tests seamlessly across multiple modern browsers (Chrome, Firefox, Edge).
* **Robust Utilities**: Built-in explicit waits, properties file readers, and data providers for reading test data from Excel.

---

## 🛠️ Tech Stack & Dependencies

* **Language**: Java (JDK 17)
* **Automation Core**: Selenium WebDriver 4.21.0
* **Test Framework**: TestNG 7.10.2
* **Build Tool**: Apache Maven
* **Reporting Tool**: ExtentReports 5.1.1
* **Version Control**: Git & GitHub

---

## 📂 Framework Architecture

```text
AutomationFramework/
├── src/main/java
│   ├── com.opencart.base          # Base class for driver initialization & teardown
│   ├── com.opencart.pages         # Page Object classes (Locators & Actions)
│   └── com.opencart.utilities     # ExtentReport manager, Excel utils, Config readers
├── src/test/java
│   └── com.opencart.tests         # Test classes containing TestNG annotations
├── TestNG                         # XML suite configuration files
├── reports                        # Generated Extent HTML reports
├── screenshots                    # Failure screenshots captured automatically
├── pom.xml                        # Maven project object model dependency configuration
└── README.md