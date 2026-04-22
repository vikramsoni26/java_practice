package What_is_Polymorphism;

class Animal {
    public void animalSound() {
        System.out.println("The Animal make sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says : Wee Wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says :Bark Bark");
    }
}