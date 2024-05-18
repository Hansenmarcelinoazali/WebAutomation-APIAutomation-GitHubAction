How to run?

###Web Automation testing
1. ./gradlew test |or| ./gradlew clean test --info |or| ./gradlew cucumber -> generate report
2. ./gradlew cucumber -Ptags="" -> base on tags cucumber 


Tools: 
1. Java
2. Gherkin 
3. Cucumber
4. Selenium
5. POM -> Page Object Model
--> using POM for to separate each process
--> StepDef for step definition every schenario
--> Page for logic every schenario

Case:
Positif case -> Login with valid username and password, insert one product to cart, klik option and logout
Website = https://www.saucedemo.com/

Negatif Case ->  Login with invalid username and password
Website = https://www.saucedemo.com/

Boundaries Case -> Input product to chart with value -1
Website = https://automationexercise.com/
notes = boundaries case is failed because this website let you add product with quantity -1



###Running API Manually =
1. "./gradlew clean test" -> to build
2. "allure serve build/allure-results" -> test result with allure report

Api test using TestNG
Case = 
1. Get all employees -> pass
2. Post new employee -> pass
3.  Boundaries test -> failed because the email field is too long. expected http response 400 or 401