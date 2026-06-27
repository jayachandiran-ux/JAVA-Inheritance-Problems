class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Child Class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Main Class
public class SingleInherit {
    public static void main(String[] args) {

        Car c = new Car();

        c.start();   // Inherited method
        c.drive();   // Child class method
    }
}