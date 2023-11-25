package lazyevaluation;

interface Luas<T, R> {
    R hasil(T p, T l);
}

interface Keliling<T, R> {
    R hasil(T p, T l);
}

public class LazyEvaluation {
    public static void main(String[] args) {
        Luas<Integer, Integer> rumusLuas = (p, l) -> p * l;
        Keliling<Integer, Integer> rumusKeliling = (p, l) -> 2 * (p + l);

        int lebar = 4;
        int panjang = 7;

        System.out.printf("Persegi panjang dengan panjang %d dan lebar %d memiliki :%n", panjang, lebar);
        System.out.printf("Luas     : %d%n", hitung("Luas", rumusLuas, rumusKeliling, panjang, lebar));
        System.out.printf("Keliling : %d%n", hitung("Keliling", rumusLuas, rumusKeliling, panjang, lebar));
    }

    static <T, R> R hitung(String rumus, Luas<T, R> onTrue, Keliling<T, R> onFalse, T p, T l) {
        return rumus.equalsIgnoreCase("luas") ? onTrue.hasil(p, l) : onFalse.hasil(p, l);
    }
}
