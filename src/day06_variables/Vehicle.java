package day06_variables;

class Vehicle {

    static int wheels = 4;
}


class VehicleDriver{

       static int x = 40;

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(VehicleDriver.x);
        System.out.println(Vehicle.wheels);
    }


}
