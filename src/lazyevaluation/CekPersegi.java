package lazyevaluation;

import java.util.function.Supplier;

public class CekPersegi {
    static int panjang = 5;
    static int lebar = 5;

    static double sudut_a = 100;
    static double sudut_b = 80;
    static double sudut_c = 80;
    static double sudut_d = 100;

    public static void main(String[] args) {
        System.out.println("Status Segi Empat : ");
        System.out.printf("Panjang : %d %n", panjang);
        System.out.printf("Lebar   : %d %n", lebar);
        System.out.printf("Sudut   : A=%f, B=%f, C=%f, D%f %n", sudut_a, sudut_b, sudut_c, sudut_d);
        System.out.println();

        System.out.println("Dengan Eager Evaluation : ");
        withEagerEvaluation();
        System.out.println();

        System.out.println("Dengan Lazy Evaluation : ");
        withLazyEvaluation();
        System.out.println();
    }

    static void withEagerEvaluation() {
        boolean isSisiSama = cekSisi(panjang, lebar);
        boolean isSudutSama = cekSudut(sudut_a, sudut_b, sudut_c, sudut_d);
        System.out.println("Status : " + isCocok(isSisiSama, isSudutSama));
    }

    static void withLazyEvaluation() {
        Supplier isSisiSama = () -> cekSisi(panjang, lebar);
        Supplier isSudutSama = () -> cekSudut(sudut_a, sudut_b, sudut_c, sudut_d);
        System.out.println("Status : " + isCocok(isSisiSama, isSudutSama));
    }

    static String isCocok(boolean isSisiSama, boolean isSudutSama) {
        return isSisiSama && isSudutSama ? "Persegi" : "Bukan Persegi";
    }

    static String isCocok(Supplier<Boolean> isSisiSama, Supplier<Boolean> isSudutSama) {
        return isSisiSama.get() && isSudutSama.get() ? "Persegi" : "Bukan Persegi";
    }

    static boolean cekSisi(int p, int l) {
        boolean isSama = false;

        System.out.print("Mengecek sisi... ");

        if (p == l) {
            isSama = true;
            System.out.println(" (true)");
        } else {
            System.out.println(" (false)");
        }

        return isSama;
    }

    static boolean cekSudut(double a, double b, double c, double d) {
        boolean isSama = false;

        System.out.print("Mengecek sudut...");
        if (a == b) {
            if (a == c) {
                if (a == d) {
                    isSama = true;
                    System.out.println(" (true)");
                } else {
                    System.out.println(" (false)");
                }
            } else {
                System.out.println(" (false)");
            }
        } else {
            System.out.println(" (false)");
        }

        return isSama;
    }
}
