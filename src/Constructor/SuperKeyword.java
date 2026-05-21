package Constructor;

public class SuperKeyword {
}
class Animal {
    public void animalsound() {
        System.out.println("The Animal make a sound");
    }
}

class Dog extends Animal {
    @Override
    public void animalsound() {
        super.animalsound(); // call the parent method
        System.out.println("The Dog says a bow bow");
    }
}

class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalsound();
    }
}
