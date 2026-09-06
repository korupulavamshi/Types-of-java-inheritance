# Types of java Inheritance 

This repository contains Java programs that demonstrate different types of inheritance using real-world examples.

The programs included are:

1. **Student Management – Single Inheritance**
2. **Banking System – Multilevel Inheritance**
3. **Online Shopping – Hybrid Inheritance**

These examples help understand how inheritance allows one class to reuse the properties and methods of another class and create relationships between classes.

---

# 1. Student Management – Single Inheritance

## Description

This program demonstrates **Single Inheritance** using a student management example.

In single inheritance, one child class inherits from one parent class.

### Class Structure

```text
Person
   ↓
Student
```

* `Person` is the parent class.
* `Student` is the child class.
* `Student` inherits the properties and methods of `Person`.

## Classes and Responsibilities

### person.java

The `person` class contains:

* `name`
* `age`
* `setName()` method
* `setAge()` method
* `displayPersonDetails()` method

The `name` and `age` variables are declared as `private`, and setter methods are used to assign their values.

### Student class

The `Student` class extends the `person` class.

It contains:

* `rollNo`
* `course`
* `setRollNo()` method
* `setCourse()` method
* `displayStudentDetails()` method

It also inherits the methods of the `person` class.

### SchoolDemo.java

This is the main class.

It:

1. Creates a `Student` object.
2. Takes student information using `Scanner`.
3. Sets the values using setter methods.
4. Displays the person details.
5. Displays the student details.

## Files

```text
01_Student_Management/
├── person.java
└── SchoolDemo.java
```

## Run the Program

```text
javac *.java
java SchoolDemo
```

---

# 2. Banking System – Multilevel Inheritance

## Description

This program demonstrates **Multilevel Inheritance** using a banking system example.

In multilevel inheritance, a class inherits from another child class, creating a chain of inheritance.

### Class Structure

```text
Account
   ↓
SavingsAccount
   ↓
StudentSavingsAccount
```

* `Account` is the base class.
* `SavingsAccount` inherits from `Account`.
* `StudentSavingsAccount` inherits from `SavingsAccount`.
* Therefore, `StudentSavingsAccount` can access the inherited methods from both `SavingsAccount` and `Account`.

## Classes and Responsibilities

### Account.java

The `Account` class is the base class.

It contains:

* `accountHolder`
* `balance`
* `setAccountHolder()` method
* `setBalance()` method
* `displayAccountDetails()` method

It stores and displays basic account information.

### SavingsAccount.java

The `SavingsAccount` class extends the `Account` class.

It contains:

* `interestRate`
* `setInterestRate()` method
* `displaySavingsDetails()` method

It inherits the account details and methods from `Account`.

### StudentSavingsAccount.java

The `StudentSavingsAccount` class extends the `SavingsAccount` class.

It contains:

* `discount`
* `setDiscount()` method
* `displayStudentSavingsDetails()` method

It inherits the properties and methods from both `SavingsAccount` and `Account`.

### BankDemo.java

This is the main class.

It:

1. Creates a `StudentSavingsAccount` object.
2. Takes account holder name using `Scanner`.
3. Takes account balance.
4. Takes interest rate.
5. Takes student discount.
6. Displays account details.
7. Displays savings account details.
8. Displays student savings details.

## Files

```text
02_Banking_System/
├── Account.java
├── SavingsAccount.java
├── StudentSavingsAccount.java
└── BankDemo.java
```

## Run the Program

```text
javac *.java
java BankDemo
```

---

# 3. Online Shopping – Hybrid Inheritance

## Description

This program demonstrates **Hybrid Inheritance** using an online shopping example.

Hybrid inheritance is a combination of more than one inheritance structure.

In this example, **Hierarchical Inheritance** and **Multilevel Inheritance** are combined.

### Class Structure

```text
                 Product
                /       \
        Electronics    Clothing
             |
           Laptop
```

### Explanation

* `Product` is the base class.
* `Electronics` inherits from `Product`.
* `Clothing` also inherits from `Product`.
* `Laptop` inherits from `Electronics`.

Therefore, the program combines:

### Hierarchical Inheritance

```text
        Product
        /     \
 Electronics  Clothing
```

Both `Electronics` and `Clothing` inherit from `Product`.

### Multilevel Inheritance

```text
Product
   ↓
Electronics
   ↓
Laptop
```

`Laptop` inherits from `Electronics`, which itself inherits from `Product`.

Together, these structures form a hybrid inheritance example.

## Classes and Responsibilities

### Product.java

The `Product` class is the base class.

It contains:

* `productName`
* `price`
* `setProductName()` method
* `setPrice()` method
* `getPrice()` method
* `displayProductDetails()` method

It stores and displays common product information.

### Electronics.java

The `Electronics` class extends the `Product` class.

It contains:

* `brand`
* `setBrand()` method
* `displayElectronicsDetails()` method

It inherits product details and methods from `Product`.

### Clothing.java

The `Clothing` class also extends the `Product` class.

It contains:

* `size`
* `setSize()` method
* `displayClothingDetails()` method

It inherits product details and methods from `Product`.

### Laptop.java

The `Laptop` class extends the `Electronics` class.

It contains:

* `ram`
* `setRam()` method
* `displayLaptopDetails()` method

It inherits the properties and methods from both `Electronics` and `Product`.

### ShoppingDemo.java

This is the main class.

It:

1. Creates a `Laptop` object.
2. Takes laptop product information using `Scanner`.
3. Takes the laptop price.
4. Takes the brand.
5. Takes the RAM.
6. Displays laptop and product details.
7. Creates a `Clothing` object.
8. Takes clothing product information.
9. Takes the clothing price.
10. Takes the clothing size.
11. Displays clothing and product details.

## Files

```text
03_Online_Shopping/
├── Product.java
├── Electronics.java
├── Clothing.java
├── Laptop.java
└── ShoppingDemo.java
```

## Run the Program

```text
javac *.java
java ShoppingDemo
```

**Note:** Run `ShoppingDemo.java`, because it contains the `main()` method.

---

# Technologies Used

* Java
* Object-Oriented Programming
* Inheritance
* Encapsulation
* Classes and Objects
* Scanner for User Input

---

# Concepts Demonstrated

## Single Inheritance

One child class inherits from one parent class.

```text
Parent
   ↓
Child
```

Example:

```text
Person
   ↓
Student
```

---

## Multilevel Inheritance

A class inherits from another child class, creating a chain.

```text
Parent
   ↓
Child
   ↓
Grandchild
```

Example:

```text
Account
   ↓
SavingsAccount
   ↓
StudentSavingsAccount
```

---

## Hierarchical Inheritance

Multiple child classes inherit from the same parent class.

```text
       Parent
       /    \
   Child1  Child2
```

Example:

```text
       Product
       /     \
 Electronics Clothing
```

---

## Hybrid Inheritance

Hybrid inheritance combines different inheritance structures.

Example:

```text
                 Product
                /       \
        Electronics    Clothing
             |
           Laptop
```

This combines:

* Hierarchical Inheritance
* Multilevel Inheritance

---

# User Input

The programs use Java's `Scanner` class to take input from the user.

Example:

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter student name: ");
String name = sc.nextLine();
```

The use of `Scanner` makes the programs interactive and allows the user to enter information at runtime.

---

# How to Compile and Run

Open the terminal inside the required folder.

### Student Management

```text
cd 01_Student_Management
javac *.java
java SchoolDemo
```

### Banking System

```text
cd 02_Banking_System
javac *.java
java BankDemo
```

### Online Shopping

```text
cd 03_Online_Shopping
javac *.java
java ShoppingDemo
```

---

# Learning Outcome

These programs demonstrate how Java inheritance can be used to:

* Reuse code from parent classes.
* Create specialized child classes.
* Build relationships between classes.
* Implement different types of inheritance.
* Organize related classes.
* Use encapsulation with private variables and setter methods.
* Take dynamic input using `Scanner`.
* Understand the basics of Object-Oriented Programming.

---

# Repository Structure

```text
java-inheritance-situations/
│
├── README.md
│
├── 01_Student_Management/
│   ├── person.java
│   └── SchoolDemo.java
│
├── 02_Banking_System/
│   ├── Account.java
│   ├── SavingsAccount.java
│   ├── StudentSavingsAccount.java
│   └── BankDemo.java
│
└── 03_Online_Shopping/
    ├── Product.java
    ├── Electronics.java
    ├── Clothing.java
    ├── Laptop.java
    └── ShoppingDemo.java
```

---

# Author

**Vamshi**
