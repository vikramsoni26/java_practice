package Interface;

class Test implements A, B {
    @Override
    public void show() {
        System.out.println("show method");
    }

    @Override
    public void display() {
        System.out.println("display method");
    }
}
