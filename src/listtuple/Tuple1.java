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
    }
}
