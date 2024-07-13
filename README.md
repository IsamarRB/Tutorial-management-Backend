#Tutorial Management

#Project context

This project is a demo requested by a client for tutorial management. In the future, this system will allow users to 
upload and view tutorials similar to Udemy, as well as edit and delete tutorials.

#Project Description

The objective of this project is to develop a tutorial management system using Java and MySQL. The main functionalities 
of the system include:

1. View Tutorial.
2. Adding tutorials to the database.
3. Removing tutorials from the database.
4. Editing an existing tutorial.

#Execution Details:

System Structure: The system will adhere to an MVC (Model-View-Controller) architecture, incorporating the following components:

Model: Will include classes representing the data and business logic.
View: Will handle the data presentation to the user.
Controller: Will mediate between the Model and the View, processing user requests and updating the view as necessary.
System Components:

Model:

Tutorial: A class representing a tutorial with attributes such as id, title, description, author, and duration.
View:

User Interface (UI): Initially, this could be either a console application or a basic graphical user interface (GUI).
Controller:

TutorialController: A class that manages user requests and coordinates actions between the View and the Model.
MySQL Database: A MySQL database will be set up with a “Tutorials” table to store the tutorial information.

#SOLID Principles:

Single Responsibility Principle (SRP): Each class will have a single responsibility.
Open/Closed Principle (OCP): The system will be designed to allow for extension without modification of existing code.
Liskov Substitution Principle (LSP): Derived classes will be interchangeable with their base classes without affecting the system's functionality.
Interface Segregation Principle (ISP): Specific interfaces will be created for distinct sets of functionalities.
Dependency Inversion Principle (DIP): High-level modules will not depend on low-level modules; both will depend on abstractions.

#Technologies Used:

Java: Core application development.
MySQL: Database management.
Spring Framework: Implementing MVC architecture, Dependency Injection, and other enterprise features.
Hibernate: Object-Relational Mapping (ORM) with the MySQL database.
Maven: Project build and dependency management.
JUnit: Testing application components.

#Action Steps:

Database Design: Create the database and the Tutorials table.
Model Development: Implement the Tutorial classes.
View Development: Develop the user interface (TutorialServices).
Controller Development: Implement the TutorialController class.
Integration and Testing: Integrate all components and conduct tests to ensure the system's functionality.
Documentation and Demo: Prepare documentation and a functional demonstration for the client.

![CRUD Backend](https://github.com/IsamarRB/Tutorial-management-CRUD-Backend/assets/169648570/cb64e175-8e4e-46a1-9e55-cc04e4960095)
