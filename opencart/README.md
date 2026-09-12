# OpenCart Hybrid Automation Framework

Enterprise-grade Test Automation Framework designed using Java, Selenium WebDriver, and TestNG.

## Tech Stack
* **Language:** Java 17
* **Web Automation:** Selenium WebDriver 4.x
* **Test Runner:** TestNG 7.x
* **Design Pattern:** Page Object Model (POM)
* **Build Tool:** Maven

## Project Architecture
* `src/main/java`: Page Objects, Utility Classes, Base Test setup.
* `src/test/java`: TestNG Test Scripts.
* `src/test/resources`: Test Data and Configuration files.

## Execution
Run tests via Maven:
```bash
mvn clean test