

# StudentManagementSystem

## Overview

This repository contains a Java implementation of a Student class, designed to manage student data and perform various operations related to student information. The class includes attributes such as name, roll number, and fees, along with methods to calculate fees with and without discounts, average marks, and percentage of obtained marks.

## Features

- *Attributes:*
  - Name
  - Roll Number
  - Fees
  - Student Count (Static)

- *Constructors:*
  - Default Constructor
  - Parameterized Constructor
  - Copy Constructor

- *Methods:*
  - Getters and Setters for all attributes
  - calcFeeWithDiscount(int discountPercentage): Calculates the fee after applying a discount.
  - calcFeeWithoutDiscount(): Returns the original fee without any discount.
  - calcAvg(int lastYearMarks, int presentYearMarks): Calculates the average of two given marks.
  - calcPercentage(int totalMarks, int obtainMarks): Calculates the percentage of obtained marks out of total marks.
  - print(): Prints all the data member values.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- A Java Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans

### Installation

1. Clone the repository:
   bash
   git clone https://github.com/yourusername/StudentManagementSystem.git
   

2. Navigate to the project directory:
   bash
   cd StudentManagementSystem
   

3. Open the project in your preferred Java IDE.

### Usage

1. Compile the Student class:
   bash
   javac Student.java
   

2. Run the Student class:
   bash
   java Student
   

### Example

Here's an example of how to create and use Student objects:

java
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1, 1000.0);
        student1.print();
        
        Student student2 = new Student(student1); // Using copy constructor
        student2.setName("Bob");
        student2.setRollNumber(2);
        student2.setFees(1200.0);
        student2.print();

        System.out.println("Fees with 10% discount: " + student2.calcFeeWithDiscount(10));
        System.out.println("Average marks: " + student2.calcAvg(85, 90));
        System.out.println("Percentage: " + student2.calcPercentage(500, 450));
    }
}


### Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue to discuss improvements or additions to the project.

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

This README provides a clear overview of the project, including its features, installation steps, usage instructions, and information on contributing and licensing. Adjust the repository URL and any other specific details as needed.
