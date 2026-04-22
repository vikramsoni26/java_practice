package Interface;

class BottleImpl implements Bottle {

    @Override
    public void open() {
        System.out.println("Rotate the bottle cap");
    }

    @Override
    public void fill() {
        System.out.println("Pour water in the bottle");
    }

    @Override
    public void drink() {
        System.out.println("Sip the water");
    }
}
