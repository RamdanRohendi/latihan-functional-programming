package lambdaexpression.praktikumkampus;

public class SegitigaLambda {
    interface BangunRuang {
        double getKeliling(int a, int b, int c);
    }

    public static void main(String[] args) {
        BangunRuang rumus = (a, b, c) -> a + b + c;
        System.out.println(rumus.getKeliling(2, 3, 4));
    }
}
