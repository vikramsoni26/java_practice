package day08_Method.MethodOverriding;

class Animal1 {
      void sound(){
            System.out.println("Animal1 makes sound");
      }
}

class Dog1 extends Animal1{
    void sound(){
        System.out.println("Dog1 braks");
    }
}
