public class sinheritance1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();
    }
}
class Vehicle {
    int wheels;

    Vehicle(int wheels) {
        this.wheels = wheels;
    }

    void display() {
        System.out.println("Number of wheels: " + wheels);
    }
}

class Car extends Vehicle {
    Car() {
        super(4);
    }
}

