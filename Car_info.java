class Vehicle {
    void drive() {
        System.out.println("Driving vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing car.");
    }
}

public class Car_info {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();

        Car c = new Car();
        c.drive();
    }
}
