package lazyevaluation;

public class EagerEvaluation {
    public static void main(String[] args) {
        int lebar = 4;
        int panjang = 7;

        System.out.printf("Persegi panjang dengan panjang %d dan lebar %d memiliki :%n", panjang, lebar);
        System.out.printf("Luas     : %d%n", hitung("Luas", rumusLuas(panjang, lebar), rumusKeliling(panjang,lebar)));
        System.out.printf("Keliling : %d%n", hitung("Keliling", rumusLuas(panjang, lebar), rumusKeliling(panjang, lebar)));
    }

    static int rumusLuas(int p, int l) {
        return p * l;
    }

    static int rumusKeliling(int p, int l) {
        return 2 * (p + l);
    }

    static int hitung(String rumus, int onTrue, int onFalse) {
        return rumus.equalsIgnoreCase("luas") ? onTrue : onFalse;
    }
}
