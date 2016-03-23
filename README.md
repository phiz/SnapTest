# SnapTest
SnapTest is a small project to demonstrate knowledge of MVC, Spring and Java.

##Compile and Run
This application requires mongodb to run. After installing mongodb, ensure it is running by using the following command.

`mongod`

To compile the application, clone the respoitory into a local directory and then run the below Gradle command to create a JAR file

`gradle build`

This will create a JAR in the build/libs directory. To run the JAR file use the following command

```java -jar build/libs/gs-serving-web-content-0.1.0.jar```

Your application should now be running

##Usage

The application currently has one page and a RESTful API.

####Basic Page

To visit the Greetings page go to [http://localhost:8080/test](http://localhost:8080/test)

This page will allow you to enter a Greeting phrase and a Name. Upon clicking submit the application will combine the two phrases into a simple sentence and display the result. It will also add the result into the database.

####RESTful API

The application has four ways to access data.

The first method is to get all greetings in the database. You can do this by navigating to [http://localhost:8080/greetings](http://localhost:8080/greetings)

Here all entries in the database for greetings will be returned as a JSON object.

To get a single entry by Id navigate to http://localhost:8080/greetingbyid?id=%query%

To get all entries for a certain name navigate to http://localhost:8080/greetingsbyname?name=%query%

To get all entries for a certain greeting navigate to http://localhost:8080/greetingsbygreeting?greeting=%query%
