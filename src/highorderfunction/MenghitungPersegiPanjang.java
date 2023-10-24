package highorderfunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MenghitungPersegiPanjang {
    public static void main(String[] args) {
        Integer result;
        Integer panjang = 10;
        Integer lebar = 5;

        Function<BiFunction, Integer> persegiPanjang = setPersegiPanjang(panjang, lebar);
        BiFunction<Integer, Integer, Integer> rumusLuas = (p, l) -> p * l;
        BiFunction<Integer, Integer, Integer> rumusKeliling = (p, l) -> (2 * p) + (2 * l);

        System.out.println("Detail Persegi Panjang :");
        System.out.println("Panjang\t: " + panjang + " cm");
        System.out.println("Lebar\t: " + lebar + " cm");

        System.out.println();
        System.out.println("Perhitungan :");

        result = persegiPanjang.apply(rumusLuas);
        System.out.println("Luas\t\t: " + result + " cm persegi");

        result = persegiPanjang.apply(rumusKeliling);
        System.out.println("Keliling\t: " + result + " cm");
    }

    static Function<BiFunction, Integer> setPersegiPanjang(Integer p, Integer l) {
        return (f) -> (Integer) f.apply(p, l);
    }
}
