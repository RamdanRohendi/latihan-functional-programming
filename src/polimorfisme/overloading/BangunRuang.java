package polimorfisme.overloading;

public class BangunRuang {
    double rumus(double p, double l) {
        return (l*p);
    }

    double rumus(double s) {
        return (s*s);
    }

    public static void main(String[] args) {
        BangunRuang objek = new BangunRuang();
        System.out.println("Luas persegi panjang: " + objek.rumus(5.55, 6.78));
        System.out.println("Luas persegi: " + objek.rumus(3.45));
    }
}
