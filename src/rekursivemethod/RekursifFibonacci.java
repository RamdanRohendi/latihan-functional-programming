package rekursivemethod;

import java.util.Scanner;

public class RekursifFibonacci {
    private static int fibonacci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Masukkan jumlah deret angka terlihat = ");
        n = in.nextInt();

        System.out.println();
        System.out.println("Deret Fibonacci :");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));

            if (i == n-1) {
                System.out.print("...");
            } else {
                System.out.print(", ");
            }
        }
    }
}
