package praktikummethod;

public class PraktikumOverloading {

    // hitungLuas :: Number -> Number -> Number
    public int hitungLuas(int p, int l) {
        return p * l;
    }

    // hitungLuas :: Number -> Number -> Number
    public double hitungLuas(double p, double l) {
        return p * l;
    }

    // hitungLuas :: Number -> Number -> Number
    public double hitungLuas(int r) {
        return 3.14 * (r * r);
    }

    // hitungLuas :: Number -> Number -> Number
    public double hitungLuas(double r) {
        return 3.14 * (r * r);
    }

    public static void main(String[] args) {
        PraktikumOverloading overloading = new PraktikumOverloading();

        System.out.println("Luas Persegi = " + overloading.hitungLuas(2, 3));
        System.out.println("Luas Persegi = " + overloading.hitungLuas(2.35, 3.20));
        System.out.println("Luas Lingkaran = " + overloading.hitungLuas(2));
        System.out.println("Luas Lingkaran = " + overloading.hitungLuas(2.50));
    }
}
