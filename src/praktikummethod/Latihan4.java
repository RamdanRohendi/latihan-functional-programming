package praktikummethod;

public class Latihan4 {
    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int product = Latihan4.multiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
    }
}
