package lambdaexpression.praktikumrumah;

public class Lingkaran implements Bentuk{
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getLuas() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getKeliling() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("Radius\t\t= " + lingkaran.getRadius());
        System.out.println("Luas\t\t= " + lingkaran.getLuas());
        System.out.println("Keliling\t= " + lingkaran.getKeliling());
    }
}
