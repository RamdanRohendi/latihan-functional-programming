package rekursivemethod;

import java.util.Scanner;

public class RekursifPenjumlahan {
    private static int penjumlahan(int n) {
        System.out.println(" penjumlahan = " + n);
        if(n == 0) {
            return n;
        }

        return n + penjumlahan(n - 1);
    }

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int hasil;

        System.out.print("masukkan nilai = ");
        int nilai = angka.nextInt();
        System.out.println("nilai = " + nilai);

        hasil = penjumlahan(nilai);
        System.out.println("hasil = " + hasil);
        System.out.println("====================");
    }
}
