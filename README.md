
# Tutorialsninja Automation Testing

This project contains automation test scripts for the **Tutorialsninja** e-commerce web application. It is designed to verify core functionalities such as user registration, login, product search, cart management, and checkout using Selenium, Java, and TestNG.

## 📂 Project Structure

```
tutorialsninja/
│── .mvn
│── .settings
│── src/test/java/OpenCart              # Test scripts
│── test-output
│── .classpath
│── .gitignore
│── .project
│── OpenCart_TestCases_Automaion.xlsx   # Test case documentation
│── pom.xml                             # Maven dependencies
│── README.md                           # Project documentation
```

## ⚙️ Tools & Technologies

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Reporting:** TestNG Reports / Extent Reports

## 🚀 Features Covered

* ✅ User Registration
* ✅ Login / Logout
* ✅ Product Search
* ✅ Add to Cart
* ✅ Checkout Process

(All test cases are documented in **OpenCart\_TestCases\_Automaion.xlsx**)

## 🛠️ Setup & Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/tutorialsninja.git
   ```
2. Open the project in **Eclipse/IntelliJ**.
3. Install dependencies using Maven:

   ```bash
   mvn clean install
   ```
4. Update `config.properties` (if present) with:

   * Base URL
   * Browser
   * Test user credentials

## ▶️ Running the Tests

* To run all tests:

  ```bash
  mvn test
  ```
* To run specific TestNG suite:

  ```bash
  mvn test -DsuiteXmlFile=testng.xml
  ```

## 📊 Reports

* TestNG default reports are generated under:

  ```
  /test-output
  ```
* Extent Reports (if configured) under:

  ```
  /reports
  ```

## 📌 Test Case Reference

All manual test cases are available in:
📄 `OpenCart_TestCases_Automaion.xlsx`

---
