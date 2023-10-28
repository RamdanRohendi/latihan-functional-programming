package highorderfunction;

import java.util.Arrays;
import java.util.List;

public class forEachHof {
    public static void main(String[] args) {
        List<Integer> listAngka = Arrays.asList(1, 9, 20, 2, 11, 19);
        listAngka.forEach((x) -> System.out.println("Angka " + x + " itu " + (x % 2 == 0 ? "Genap" : "Ganjil")));
    }
}
