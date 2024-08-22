Project Description:

Selenium based automation project using the TestNG framework.
Selenium: Selenium is an open source framework for automated browser testing and web application automation providing us a suite of tools to communicate with the web browsers programmatically.
In selenium we have four main components they are: Selenium IDE, selenium webdriver ,Selenium grid and selenium RC. Selenium IDE- for record and playback options Selenium webdriver-for programmatic browser control Selenium grid - for parallel test execution Selenium RC- for simple browser actions and linear executions with the use of programming language.

Architecture of selenium:

![image](https://github.com/user-attachments/assets/6597784a-8861-4b21-aab4-e53e3e7494ff)

Application:

  Google Web application


![image](https://github.com/user-attachments/assets/ec3f1068-fac1-4b84-b54a-47c01d1b7ec7)



Installation and setup:

1.Install the spring tool suite ide 2.Create a new maven project 3.Create a new package in the src/test/java and create a new class. 
Structure of the Project:

![image](https://github.com/user-attachments/assets/73971aa4-8674-4802-9eaa-1ecc9e7cb4ad)


Advantages of Maven project:

1.Maven is a powerful build automation tool where we have the dependencies(libraries) for suggestions and many src folders. 

2.In maven we can use the annotations to create our tests like @Test, @beforetest, @aftertest, @beforeclass ,@afterclass, @beforesuite ,@aftersuite etc.

3.Here in maven we can prioritize our tests , create a depends on method to execute our tests, give a pre-requisites in the @beforetest and post-requisites in the @aftertest

4.Maven supports the cucumber testNG frameswork, framework where we can create the features file, runner file and test steps file, Page Object Model framework.

5.We can add waits in maven like implicit wait , explicit wait and thread.sleep.

Dependencies/libraries:

<project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>demo_project_selenium</groupId>
  <artifactId>demo_project_selenium</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies>
	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.4.0</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.8.0</version>
</dependency>

</dependencies>
</project>

Tools and stacks used:

image

1.Spring Tool Suite IDE( an integrated development)

![image](https://github.com/user-attachments/assets/030e0bee-a885-46c9-90ac-58524cf2ce53)

2.GitHub 

![image](https://github.com/user-attachments/assets/f61cb28c-8ab5-4ada-a3fe-5ec8f8ab4bc6)


3.Google drive

Git commands:

Git init -> initializes the git git remote add origin "url" -> command to create a remote origin for the local in the cloud and .git file is seen in the folder which represents the folder is linked to remote git add . -> command to add all the files in the local to remote git commit -m "message" -> command to write a commit message for the changes made to the folder for reference by our colleague in company git push origin master -> command to push our files to the remote repository

API used: In selenium we use the W3C protocol which acts as a communication medium between the wedriver and browsers driver.
