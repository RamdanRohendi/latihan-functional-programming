package highorderfunction;

import java.util.function.Function;

public class FunctionReturn {
    public static void main(String[] args) {
        Function<Integer, Integer> tambahSatu = tambah(1);
        Function<Integer, Integer> tambahDua = tambah(2);

        // Variabel Baru
        Function<Integer, Integer> tambahTiga = tambah(3);
        Function<Integer, Integer> kurangEmpat = kurang(4);

        Integer result = tambahSatu.apply(6);
        System.out.println(result);

        result = tambahDua.apply(4);
        System.out.println(result);

        // Pemakaian Variabel tambahTiga
        result = tambahTiga.apply(2);
        System.out.println(result);

        // Pemakaian Variabel kurangEmpat
        result = kurangEmpat.apply(4);
        System.out.println(result);
    }

    static Function<Integer, Integer> tambah(Integer x) {
        return y -> y + x;
    }

    // Fungsi HoF untuk mengurangi nilai
    static Function<Integer, Integer> kurang(Integer x) {
        return y -> y - x;
    }
}
