package polimorfisme.overriding.praktikum2;

public class Cat extends Animal {
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Miauww");
    }
}
