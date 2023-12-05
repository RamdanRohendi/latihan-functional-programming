package polimorfisme.overloading;

public class Sapaan {
    static void sapa() {
        System.out.println("Halo!");
    }

    static void sapa(String nama) {
        System.out.println("Halo " + nama + "!");
    }

    static void sapa(String sapaan, String nama) {
        System.out.println(sapaan + " " + nama + "!");
    }

    public static void main(String[] args) {
        sapa();
        sapa("Ramdan");
        sapa("Hai", "Ramdan");
    }
}
