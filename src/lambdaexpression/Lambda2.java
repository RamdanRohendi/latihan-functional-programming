package lambdaexpression;

import java.util.Scanner;

public class Lambda2 {
    interface Berkebalikan {
        String kebalikan(String n);
    }

    public static void main(String[] args) {
        Berkebalikan rev = (str) -> {
            String hasil = "";
            for (int i = str.length()-1; i >= 0; i--)
                hasil += str.charAt(i);
            return hasil;
        };

        Scanner masuk = new Scanner(System.in);
        String huruf;

        System.out.print("Masukkan huruf : ");
        huruf = masuk.nextLine();

        System.out.println("Hasil dari kebalikan = " + rev.kebalikan(huruf));
    }
}
