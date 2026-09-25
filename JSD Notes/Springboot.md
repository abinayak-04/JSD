# Springboot
## What is Springboot?
- Springboot provides a good platform for java developers to develop a stand-alone and production-grade spring application that you can just run.
- It is open source
- Development year : 2013
---
## Advantage of Springboot:
- Easy to understand and develop spring application.
- Increase productivity.
- Reduce the development time.
---
## Goals:

Springboot is designed with the following goals.

* To avoid complex XML configuration in Spring.
* To develop a production ready spring application in an easier way
* To reduce the development time and run the application independently
* Offer an easier way of getting started with the application
---
## Why Spring Boot?
You can choose spring boot because of the features and benefits it offers as given here:
* It provides a flexible way to configure java Beans, XML configuration, and Database Transactions/
* It provides a powerful batch processing and manages REST endpoints.
* In Spring Boot, everything is auto configured, no manual configurations are needed.
* It offers annotation-based spring application.
* Eases dependency management.
* It includes Embedded servlet Container.
---
## How does it works?

- Spring Boot automatically configures your application based on the dependencies you have added to the project by using **@EnableAutoConfigure** annotation.

- **For example**
    - If MySQL database is on your classpath, but you have not configured any database connection, then Spring boot auto-configures an in-memory database.

- The entry point of the spring boot application is the class contains **@SpringBootApplication** annotation and the main method.

- Spring Boot automatically scans all the components included in the project by using **@ComponentScan** annotation.
----
## Annotation
-  @SpringBootApplication 
    - Main Application File
    - Start point contains.
                                -->SpringBootConfiguration
                                -->EnableAutoConfiguration
                                -->ComponentsScan

@RestController ================>Showing output contains:
                                -->Controller --->Request handle purpose
                                -->ResponseBody-->Send your data into http response data 

Know about controller process in browser?

Ctrl+shift+I --> network tab --> click your controller ---> see response headers and preview



Spring Boot MVC:
================
The Spring Boot framework leverages the Model-View-Controller(MVC) architectural pattern to structure web applications, promoting a clear separation of concerns.

1.Model:
========
The Model represents the apllications data and buisness logic.
It interacts with the data source(e.g database) to retrive, store, and manipulate data.
In a SpringBoot Application, this often involves entities, repositories(for data access), and service classes (for buisness logic).

2.View:
=======
The View is responsible for presenting the data to the user.
It renders the user interface based on the data provided by the model.
Common view technologies in Spring Boot include Thymeleaf, JSP or even returning JSON/XML for RESTFUL APIs.

3.Controller:
=============
The Controller acts as an intermediary between the model and the view.
It receives user requests, processes them, interacts with the Model to fetch or update data and then selected appropriate view to display the result.
In Spring Boot, controllers are typically Java classes annotated with @Controller or @RestController(fro RESTful services).

Spring Boot MVC Flow and Benefits:
==================================
This structure ensures that the presentation logic(view), buisness logic (Model), and request handling (Controller) are distinct, making the application more modular, maintainable and scalable.

FLOW In MVC:
============
1.User interacts with the view(e.g. submits a form)
2.Controller receives the user's action 
3.Controller interacts with the Model if necessary(e.g. to save data)
4.Controller selects and updates the appropriate View.
5.Updated View is presented to the user

BENEFITS OF MVC:
================
Seperation of concerns : each component has a specific role, making the application easier to develop and maintain
Modularity : COmponents can be developed and tested independently.
Flexibility : Easy to modify or replace individual components without affecting the entire system
Reusability : Models can be reused across different interfaces.

SPRINGBOOT VIEW CONCEPT FROM MVC:
==================================

## SpringBoot View Concept from MVC

**Step 1**
- install thymeleaf(purpose: to implement .html file)
- pom.xml: (project object model)