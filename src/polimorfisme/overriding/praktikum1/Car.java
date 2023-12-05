package polimorfisme.overriding.praktikum1;

public class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}
