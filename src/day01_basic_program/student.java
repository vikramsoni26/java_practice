package day01_basic_program;

public class student {
    // Create a class Student with private name and age variables; use getters and setters.
           String name;
           int age;
           int id;
           String address;
           String email;

           // //Setter or Mutator method
           public void setValue(String n, int a, int i, String a1, String e){
               name=n;
               age=a;
               id=i;
               address=a1;
               email=e;
           }
           // Setter or Accessor method
           public String getDetails(){
               return "Name is: "+name+"\nage is: "+age+"\naddress is: "+address+"\nemail is: "+email;
           }


}
