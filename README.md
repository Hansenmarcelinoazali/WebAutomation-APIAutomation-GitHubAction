How to run?

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