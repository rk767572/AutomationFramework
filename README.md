# Automation Framework - Selenium & TestNG

An enterprise-grade Hybrid Test Automation Framework built for web application testing using Java, Selenium WebDriver, TestNG, and Maven, following the Page Object Model (POM) design pattern.

## 🚀 Tech Stack
* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Management:** Maven
* **Design Pattern:** Page Object Model (POM)

## 📁 Project Architecture
```text
AutomationFramework/
│
├── src/main/java/
│   ├── com.opencart.base/       # Core setup (WebDriver lifecycle, properties loader)
│   └── com.opencart.pages/      # Page Object classes (Locators & Actions)
│
├── src/test/java/
│   └── com.opencart.tests/      # Test execution classes (TestNG assertions)
│
├── src/main/resources/
│   └── config.properties        # Configuration data (URLs, credentials)
│
└── pom.xml                      # Maven dependencies and build plugins
