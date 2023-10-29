package lambdaexpression.praktikumrumah;

public class LingkaranLambda {
    private final double radius;

    public LingkaranLambda(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    interface Rumus {
        double getNilai(double r);
    }

    public static void main(String[] args) {
        Rumus getLuas = r -> 3.14 * r * r;
        Rumus getKeliling = r -> 2 * 3.14 * r;

        LingkaranLambda lingkaran = new LingkaranLambda(10);

        System.out.println("Radius\t\t= " + lingkaran.getRadius());
        System.out.println("Luas\t\t= " + getLuas.getNilai(lingkaran.getRadius()));
        System.out.println("Keliling\t= " + getKeliling.getNilai(lingkaran.getRadius()));
    }
}
