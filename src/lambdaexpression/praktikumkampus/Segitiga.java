package lambdaexpression.praktikumkampus;

public class Segitiga implements BangunRuang {
    @Override
    public double getKeliling(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Segitiga keliling = new Segitiga();
        System.out.println(keliling.getKeliling(2, 3, 4));
    }
}
