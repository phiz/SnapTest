# SnapTest
SnapTest is a small project to demonstrate knowledge of MVC, Spring and Java.

##Compile and Run
To compile the application, clone the respoitory into a local directory and then run the below Gradle command to create a JAR file

`gradle build`

This will create a JAR in the build/libs directory. To run the JAR file use the following command

```java -jar build/libs/gs-serving-web-content-0.1.0.jar```

Your application should now be running

##Usage

The application currently has two pages.

####Basic Page

To visit the Greetings page go to [http://localhost:8080/test](http://localhost:8080/test)

This page will allow you to enter a Greeting phrase and a Name. Upon clicking submit the application will combine the two phrases into a simple sentence and display the result.

####REST

To access the REST feature go to [http://localhost:8080/greeting](http://localhost:8080/greeting)

Here a basic Hello World message will be returned as a JSON object. This message can also be customized to display a greeting to anyone.

To change who is greeted go to http://localhost:8080/greeting?name=%Name% where %Name% is replaced by whichever name you like.
