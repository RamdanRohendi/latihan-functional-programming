package praktikummethod;

public class Latihan3 {
    public String returnHelloWorld() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Latihan3 example = new Latihan3();
        String result =  example.returnHelloWorld();
        System.out.println(result);
    }
}
