package Interface;

public class BottleDriver {
    public static void main(String[] args) {
        BottleImpl b = new BottleImpl();
        b.open();
        b.fill();
        b.drink();
    }
}
