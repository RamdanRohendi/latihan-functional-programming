package rekursivemethod;

import java.util.Scanner;

public class PraktikumRekursifBarisBilangan {
    private static int deretBilangan(int n) {
        if (n == 0) {
            return 1;
        }

        return 2 * deretBilangan(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Masukkan jumlah deret angka terlihat = ");
        n = in.nextInt();

        System.out.println();
        System.out.println("Deret Angka :");

        for (int i = 0; i < n; i++) {
            System.out.print(deretBilangan(i));

            if (i == n-1) {
                System.out.print("...");
            } else {
                System.out.print(", ");
            }
        }
    }
}
