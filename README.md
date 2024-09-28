
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Haonan Chen                |
| Date         | 09/27/2024                 |
| Course       | Fall                       |
| Assignment # | 1                          |

# Assignment Overview
In this assignment, the goal is to develop a fully automated beverage vending machine software system. The system allows users to select various beverages such as Espresso, Americano, Latte Macchiato, Black Tea, Green Tea, and Yellow Tea, and customize their drinks by adding extra condiments like milk and sugar. The beverage creation process is handled using a design pattern approach, where the brewing process is abstracted through the BrewBehavior interface, and its specific implementations handle different brewing steps like adding water, milk, foam, or espresso.

# GitHub Repository Link:
https://github.com/HaonanChen-2024/cs-665-assignment--1-

# Implementation Description 


For each assignment, please answer the following:
1.The vending machine allows users to select a beverage from options such as Espresso, Americano, and Latte Macchiato. Users can then choose to add condiments like milk and sugar, and the cost of each condiment is automatically added to the final price. This feature is handled through addMilk() and addSugar() methods in the Beverage class, ensuring flexibility for any type of condiment.

2.The entire beverage preparation process is managed through a series of brewing steps using the BrewBehavior interface. Each specific brewing behavior, such as adding water or brewing espresso, is encapsulated in classes like BrewWater and BrewEspresso. This modular approach allows for easy updates and maintenance of the brewing logic.

3.The project follows a clear object-oriented design using classes and methods to simulate the real-world behavior of a vending machine. Each beverage type is represented as a subclass of Beverage, while brewing behaviors are implemented using the Strategy Pattern, ensuring clean separation of concerns and flexibility in future extensions.

4.The Strategy Pattern is used to define various brewing behaviors, making the brewing process reusable and flexible. For example, both Americano and Espresso share the BrewEspresso behavior but can differ in the number of times water is added. This design enables easy updates or modifications to the brewing steps for any beverage without impacting others.

5.The program is designed to easily accommodate new beverages. By creating a new subclass of Beverage and adding the appropriate BrewBehavior combinations, new drinks can be introduced without changing the core functionality. This ensures that the design is scalable for future needs.

6.The use of base classes such as Beverage and interfaces like BrewBehavior ensures minimal code duplication. Common functionalities such as brewing steps are reused across different drink types, making the code more maintainable and easier to extend.

7.Although detailed payment processing is not fully implemented, the program accepts any numerical input as payment, and the final price is calculated based on the beverage and condiments selected. 



# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
The project uses Maven to manage dependencies and build the project. Ensure Maven is installed on your system, then run the following command to compile the code:

```bash
mvn clean compile
```

## Packaging
```bash
mvn package
```

## Running the Application
After compiling, you can run the main application from the command line:
```bash
java -classpath target/JavaProjectTemplate-1.0-SNAPSHOT.jar edu.bu.met.cs665.Main
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




