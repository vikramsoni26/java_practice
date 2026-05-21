package What_is_Polymorphism;

public class Animal1 {
    void sound() {
        System.out.println("Anima1 make a sound");
    }
}

class Cat extends Animal1{
    void sound() {
        System.out.println("Cat meaow meaow");
    }
}

class Test {
    public static void main(String[] args) {
        Animal1 mycar1 = new Cat();
        mycar1.sound();
    }
}