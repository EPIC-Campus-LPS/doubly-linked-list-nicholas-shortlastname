# Lab 7: Doubly Linked List

## Objective
You are to implement a `DoublyLinkedList` class, where each node in the list will point to the previous node and the next node. You will need to write an appropriate `Node` class with generics including necessary instance variables, constructors, and getter/setter methods.

Then you will need to implement a `DoublyLinkedList` class with the following methods:
- `void add(E element)`//adds to the end of the list
- `void add(int index, E element)` //adds element to index position in list
- `E remove(int index)`  //deletes and returns element at given index
- `E remove()` //deletes tail of list and returns it
- `E set(int index, E element)`//sets the element at index, returns what was replaced
- `String toString()`//returns the list as a String with this format: \[value1, value2, value3, …\]

Keep in mind that you may add additional variables to the `DoublyLinkedList` class to make your algorithms run more efficiently.

## Testing

This lab, we are going to start **JUnit testing**. JUnit is a framework for creating and running test cases in your project. We will run our JUnit tests run using Maven. From here on out, you will need to write appropriate JUnit tests for all of your projects. 

The number of tests you write doesn't matter as much as the quality of your tests. One way to assess test quality is through **code coverage** (how many lines of source code have been run by the test cases). When you run your tests, you can generate a code coverage report which will tell you what percentage of the lines of code in your main program were executed by the test cases. The first 80% is generally straightforward to cover; it's the last 20% that is tricky. Ideally your test cases will cover all 100%, but for this project we will aim for 80%. 

When writing test cases, focus not just on writing tests to test the accuracy of your code, but the resiliency. Write tests to check that your code is throwing errors when appropriate and rejecting inaccurate input. Coming up with these **edge cases** can be difficult, but is often the most valuable part of testing.

**Resources**
- [Getting Started with JUnit 5](https://www.jetbrains.com/help/idea/junit.html)
- [Creating Tests](https://www.jetbrains.com/help/idea/create-tests.html)
- [Running Tests with Coverage](https://www.jetbrains.com/help/idea/running-test-with-coverage.html#run-config-with-coverage)
- [Reading the Coverage Report](https://www.jetbrains.com/help/idea/viewing-code-coverage-results.html)
## Javadoc

For your `Node` class and `DoublyLinkedList` class, generate proper Javadoc documentation. The classes you generate to run your JUnit test do not have to commented using Javadoc notation, but should still include inline comments and follow style conventions to make their function understandable to an outside user.
## Rubric

4 points – All requested items are present. Functional and efficient Node and DoublyLinkedList class. Javadoc reference for both classes. JUnit tests with a coverage report of at least 80%.
3 points – Some of the requested items are missing. Classes are complete but are missing Javadoc reference. Test cases are missing or incomplete.
2 points – Missing or incomplete. Student should re-attempt

---
# Style Guidelines
## Lab 7: Style Guide
  
### Comments

The expectations for Javadoc comments are the same as the previous lab.  [Here is the IntelliJ  documentation](https://www.jetbrains.com/help/idea/javadocs.html) again if you need more information. In addition to Javadoc comments, your code should include regular comments to explain anything that is not immediately obvious.

# Data Structures Style Guide  
  
In this course, we will not only practice writing code but how to write good code. Learning how to write good code  includes a number of stylistic conventions. As we move further into the course, the expectations for appropriate  style and documentation will become more extensive as we continue to practice. It is expected that you keep the style  guidelines introduced in previous assignments in mind during the current assignment. This document will include a generic introduction to aspects of style relevant to this class in addition to specifics regarding this assignment.  
  
## Types of Style Guidelines  
  
There are six main categories of guidelines to look out for during this course.  
  
### Formatting  
  
  
Formatting refers to the way code is structured. This includes indentations, brackets, and whitespace. Using clear and  consistent formatting throughout makes writing and reading code easier. It is even more important when multiple people  are working on the same program. In IntelliJ, there are built-in formatting rules which you can apply by:  
  
- Going in the _Code_ menu and selecting _Reformat Code_.  
- Using the keyboard shortcut, which by default is Ctrl+Alt+L on Windows and Opt+Cmd+L on Mac.  
  
### Comments  
  
Comments are statements of code that are not executed by the compiler or interpreter. We use them to explain what  different pieces of do. Regardless of the complexity of the program, commenting all of your work appropriately is a good  habit to get into.  
  
In general, your comments should:  
  
- Be concise: only write as much as is necessary to convey relevant information  
- Help the reader: write them with the intention of a third party using them to understand your code, especially if it  is not immediately obvious  
- Break the code into smaller units: Comments help separate code at logical breaks like the beginning of a loop, a new  step in a larger calculation, or at the beginning of a function  
  
Commenting can be used as part of an effective code writing strategy as well. Instead of commenting after the code is  written, try commenting before writing the code. By breaking down your program logically into smaller chunks and then  working on those small chunks individually, you can avoid some bugs and logical errors  
  
#### Javadoc  
  
Javadoc is a tool that generates Java code documentation in the HTML format from Java source code. The documentation is  formed from Javadoc comments that are usually placed above classes, methods, or fields.
### Naming  
  
Naming variables, constants, functions, and classes is key to writing good code. Names should help the reader understand  what is going on in your program.  
  
In general, names should be:  
  
- Accurate and informative: Names should reflect the contents or purpose of the entity as much as possible  
- Concise: Names should be as concise as possible without sacrificing the above bullet point too much. It's a balance.  
- Consistent: Use consistent names and naming conventions throughout your programs. See the section below for more  information about Java-specific conventions.  
  
#### Java Conventions  
  
In Java there are a few different conventions programmers use.  
  
- For variables and functions, we will typically use camelCase  
- For constants, we use CAPS_SNAKE_CASES  
- For files, we use UpperCamelCase  
  
### Maintainability  
  
Maintainable code is easy to work on, update, and change without the original author needing to be present.  Maintainability is a broad catch-all category for other aspects of good code that make it easy for you and others on  your team to work on and debug code.  
  
### Efficiency  
  
It is important to not only write code that is correct, but efficiently uses resources (primarily memory and time). We  will talk about this more extensively later in the course, but is something to keep in mind. Efficient code is  increasing important as we write code to handle larger and larger inputs.  
  
### Concision  
  
Your code should be as concise as possible without sacrificing readability. Just like with commenting, this is a  balance.  
