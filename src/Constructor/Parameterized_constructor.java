package Constructor;

public class Parameterized_constructor {
}

class Vehicle {
     String name;
     double Price;

     Vehicle (String n, double p){
         this.name=n;
         this.Price=p;
     }

}

class VehicleDriver {
    public static void main(String[] args) {

        Vehicle V1 = new Vehicle("Maruti" , 56898) ;
        System.out.println(V1.name);
        System.out.println(V1.Price);
    }
}
