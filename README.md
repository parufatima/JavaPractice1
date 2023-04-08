BDD Framework for the testing of web applications using the Page Object Model with Selenium, Cucumber, and TestNG.

Selenium Webdriver: Page Object Model (POM) With Page Factory

Prerequisite software
•	Download & Install JDK
•	Download & Install Eclipse IDE

Steps to setup Cucumber Test Automation Framework using Page Object Model

1.	Download and Install Java on the system
2.	Setup Maven on System
3.	Install Cucumber Eclipse Plugin 
4.	Create a new Maven Project
5.	Create a source folder – src/test/resources to create test scenarios in the Feature file
6.	Add Selenium, Cucumber, and TestNG dependencies to the project
7.	Add Maven Compiler Plugin and Surefire Plugin
8.	Create a feature file under src/test/resources
9.	Create the packages and classes for configuration, locators, actions, and utilities in src/test/java
10.	Create a StepDefinition package and classes in src/test/java
11.	Create a Test Runner class in the src/test/java directory
12.	Create a Screenshot folder.
13.	Run the tests from TestNG
14.	Run the tests from testng.xml
15.	Run the tests from Command Line
16.	Cucumber Report Generation
17.	TestNG Report Generation

Create TestNG XML plugin install from Marketplace - Help >> Eclipse Marketplace >> search TestNG XML for eclipse>>Install.
•	convert the project to TestNG.
Cucumber Eclipse plugin install from Marketplace - Help >> Eclipse Marketplace >> search Cucumber>> Install.
•	Convert the project to the Cucumber project.
Related Resource
Page Object Model (POM) With Page Factory in Selenium Cucumber and TestNG
Page Object Model (POM) & Page Factory in Selenium
Run Test Case
Run Test Case - Go to Test Runner class, Right-click the mouse >> Run AS >> TestNG Test 
Run XML File - After creating the TestNG file, Right click the mouse on TestNG xml >> click on Run
Cucumber Report Generation
Right-click the project name >>Run As>>Maven Install
Then refresh the project and go to target>> cucumber-report-html>> cucumber-html-reports>> HomeheaderCamp-feature.html open with System Editor.
 


