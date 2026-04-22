package Encapuslation_Pojo;

public class Main {
    public static void main(String[] args) {
        Person myobj = new Person();
 //     myobj.name = "john"; // error
        myobj.setName("John");// Set the value of the name variable in java
        System.out.println(myobj.getName()); // error
    }
 // If the variable was declared as public,
    // we would expect the following output:
    // However, as we try to access a private variable, we get an error:
    // Instead, we use the getName() and setName() methods to access and update the variable:
}
