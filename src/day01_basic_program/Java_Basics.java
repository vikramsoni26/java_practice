package day01_basic_program;

public class Java_Basics {
    /*
    Day 01 basics and theories.
    ---------------
    1.What is a Language?
    Any medium used for communication is called a language.
    Example: Humans use English or Hindi to communicate.
    Computers understand only binary language (0s and 1s).

    2.What is a Programming Language?
    A programming language is used to communicate with computers and give them instructions.

    3.Types of Programming Languages
    There are three main types:
    Low-Level Language, Assembly Language, High-Level Language.

    4.Low-Level Language
    Written in binary form (0 and 1).
    Easy for computer to understand, difficult for humans.
    Example: Machine language.
    Used in early computers for hardware-level communication.

    5.Assembly Language
    Uses mnemonics (predefined short words) instead of binary.
    Easier for humans than machine language.
    Computer can’t understand it directly.
    Needs an Assembler to convert Assembly code → Machine code.

    6.High-Level Language?
    Designed in human-readable form (English-like syntax).
    Easy for humans to write and understand.
    Computer can’t understand it directly → needs Compiler or Interpreter to translate.
    Example languages: C, C++, Java, Python.

    7.What is Compiler?
    Reads the entire code at once.
    If there are no syntax errors, it converts it into machine code.
    Provides faster execution because translation happens once.
    Example: C and C++ use only a compiler.

    8.What is Interpreter?
    Reads and executes the program line by line.
    Stops immediately if an error occurs.
    Example: Python and JavaScript use interpreters.

    9. Compiler vs Interpreter.
    Feature	        Compiler	             Interpreter
    Execution	Entire code at once	      Line by line
    Speed	         Faster	                Slower
    Error Detection	After full scan	      One by one
    Example	         C, C++	                       Python, JS

    10.Java: Compiled + Interpreted Language?
    Java first compiles source code into Bytecode (.class file).
    Then JVM (Java Virtual Machine) interprets that Bytecode line by line.
    That’s why Java is both Compiled and Interpreted.

    11. Types of Programming Languages (Based on Approach)
    1. Procedural Language (C)
    Follows step-by-step procedures.
    Focuses on functions.
    2. Object-Oriented Language (Java, C++, Python)
    Focuses on objects and classes.
    Secure, reusable, modular.

    12.What is Platform Dependent Language?
    Code works only on the platform where it was compiled.
    Example: C language
    Compiled on Windows → runs only on Windows.

    13. What is Platform Independent Language?
    Code runs on any platform (Windows, Mac, Linux, etc).
    Example: Java
    Source Code → (Compiler) → Bytecode (.class)
    Bytecode → (JVM) → Machine Code
    JVM makes Java WORA (Write Once, Run Anywhere).
    Note:Java is platform-independent,
    but JVM is platform-dependent (each OS has its own JVM).

    14.Difference b/w Process-Oriented vs Object-Oriented Language
         Feature	  Process-Oriented	      Object-Oriented
          Focus	          Functions	          Objects
        Security	   Less secure	          Highly secure
        Platform	     Dependent	          Independent
      OOP Concepts	    Not supported	      Supported
       Example	            C	              Java, C++.

    15. Four Pillars of OOP
    Encapsulation, Inheritance, Polymorphism, Abstraction.

    16. What is Encapsulation?
    Wrapping data (variables) and methods into a single unit called class.
    Restricts direct access to data and provides controlled access via getters and setters.
    Interview Tip:
    Encapsulation = Data hiding + Controlled access.
    Example:
    class Bank {
               private int locker;   // private variable
               public void setLocker(int gold) {
               // validation logic
               locker = gold;
               }
               public int getLocker() {
               return locker;
               }
              }.

   17. What is Inheritance?
   Enables child class to reuse features of parent class.
   Promotes code reusability.
   Example:
    class Vehicle {
                  void run() { System.out.println("Vehicle is running"); }
                  }
    class Car extends Vehicle {
    void run() { System.out.println("Car is running"); }
    }
    Interview Tip:
    Inheritance promotes code reusability and method overriding.

    18. What is Polymorphism?
    Means many forms — same method behaves differently based on context.
    Example:
    class Vehicle {
                   void run() { System.out.println("Vehicle running"); }
                  }
    class Bike extends Vehicle {
                   void run() { System.out.println("Bike running"); }
     }
     Interview Tip:Polymorphism = Same name, different behavior
     Types:Compile-time → Method Overloading.
     Runtime → Method Overriding.

     19.What is Abstraction?
     Hides implementation details and shows only functionality to the user.
     Example:
     abstract class Shape {
                           abstract void draw(); // no body
                          }

      class Circle extends Shape {
                         void draw() { System.out.println("Drawing Circle"); }
      }
      Interview Tip:
      Abstraction = Hiding internal details, showing only essentials.

      20. what is Exception Handling?
      Mechanism to handle runtime errors and maintain normal program flow.
      Example:
      try {
           int a = 10 / 0;
           } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
          }
          Interview Tip:
          Handled using try, catch, finally, throw, throws.

      21. Tokens in Java?
      Smallest building blocks of Java program.
      1. Keywords (e.g., if, else, for, class)
      2. Identifiers
      3. Literals
      4. Operators
      5. Separators

      22. Errors in Java?
      1. Compile-Time Error:
      Syntax mistakes (e.g., missing semicolon).
      2. Run-Time Error (Exception):
      Logical or unexpected errors during execution.

      23.Identifiers?
      Used to name variables, methods, classes, etc.
      Rules:
      Can use A–Z, a–z, 0–9, _, $
      Cannot start with a digit
      Cannot use keywords
      No spaces
      Examples:✅ StudentName, _count, $data,❌ 123Name, first name, public.
      Naming Conventions:
      Class → PascalCase (Example: EmployeeDetails)
      Method → camelCase (Example: getSalary())








    */
}
