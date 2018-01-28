# SpringBootAngular4

This is a sample Todo App of the Spring boot and Angular 4. User can create his tasks and Once he completes the task can mark it as done.

# Technologies Used

- Angular 4
- Bootstrap 3
- Spring boot 1.5.x
- H2 database ( in Memory)

# Prerequisites

1. Latest version of nodeJS
2. Maven 


# How to configure 

Application is devided into two parts Todo-Server and Todo-Client which are the Spring boot and Angular4 applications respectively. 

production build - 

1. Angular App Build

  a. Go to the Todo-Client folder by command line and type npm install.
  b. Once the npm install completes successfully type command ng build.

2. Spring boot application
  a. Go to Todo-server folder by command line and type mvn install
  b. Once the mvn install completed successfully type command mvn package.
  c. Go to Todo-server\target folder "TodoServer-0.0.1-SNAPSHOT.jar" will be ready
  d. Run the command java -jar TodoServer-0.0.1-SNAPSHOT.jar, and wait until the server get started.
  e. Go to Browser and type http://localhost:8080, site will be displayed.

Development mode
  1. Spring boot application
    a. Go to Todo-server folder by command line and type mvn install
    b. Once the mvn install completed successfully import the project in your IDE (I have used eclipse).
    c. Right click on eclipse and go to Run as - > Java Application 
    d. Once the server started successfully start the Angular App.

  2.Angular App configuration
    a. Go to the Todo-Client folder by command line and type npm install.
    b. Once the npm install completes successfully type command npm start( not ng serve).
    c. Go to Browser and type http://localhost:4200 app will be displayed on browser.
   
  
# Pending Tasks
  - Delete task funtionality.


  
  
