package listtuple;

import org.javatuples.*;

public class Tuple1 {
    public static void main(String[] args)
    {
        Triplet<String, String, String> tuple1 = Triplet.with("mangga", "jambu", "melon");
        Pair<String, String> tuple2 = tuple1.removeFrom0();
        Pair<String, String> tuple3 = tuple1.removeFrom1();

        System.out.println("Original Tuple: " + tuple1);
        System.out.println("Hapus element pada index 0: " + tuple2);
        System.out.println("Hapus element pada index 1: " + tuple3);
        System.out.println();

        // Mengubah Elemen index ke 2 dengan setAt2()
        Triplet<String, String, String> tupleUbah = tuple1.setAt2("Belimbing");
        System.out.println("Hasil perubahan index 2: " + tupleUbah);
        System.out.println();

        // Membuat jumlah elemen tuple2 jadi 4
        Quartet<String, String, Integer, Integer> tuple4 = tuple2.add(1, 9);
        System.out.println("Hasil pertambahan data: " + tuple4);
    }
}
