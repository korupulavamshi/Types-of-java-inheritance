Student Management System

📌 Project Description

This is a simple Student Management System developed using Java.

The project demonstrates the concept of Inheritance in Java. A Student class inherits the properties and methods of the Person class.

🛠️ Technologies Used
Java
Eclipse IDE
GitHub
📚 Java Concept Used
Inheritance

The project uses Single Inheritance.

Person
   ↓
Student
Person is the parent/base class.
Student is the child/derived class.
The Student class inherits from the Person class.

📂 Project Structure

StudentManagement

│

└──
src

        └── studentmanagement
  
          └── person.java
          
👤 Person Class

The Person class contains:

name – Stores the student's name.
age – Stores the student's age.
setName() – Sets the person's name.
setAge() – Sets the person's age.
displayPersonDetails() – Displays name and age.

🎓 Student Class

The Student class extends the Person class.

It contains:

rollNo – Stores the student's roll number.
course – Stores the student's course.
setRollNo() – Sets the roll number.
setCourse() – Sets the course.
displayStudentDetails() – Displays student information.

▶️ How to Run
Open Eclipse IDE.
Import or create the StudentManagement project.

Make sure the package name is:

package studentmanagement;
Create the person.java file.
Add the provided Java code.
Create a separate class containing the main() method to create a Student object.
Run the program.

💡 Example

A Student object can access its own methods as well as the inherited methods from Person.

Student s = new Student();

s.setName("Vamshi");
s.setAge(22);
s.setRollNo(101);
s.setCourse("B.Tech CSM");

s.displayPersonDetails();
s.displayStudentDetails();

🎯 Objective

The main objective of this project is to understand:

Classes and Objects

Encapsulation

Inheritance

Methods

Private variables

Setter methods

Java packages
