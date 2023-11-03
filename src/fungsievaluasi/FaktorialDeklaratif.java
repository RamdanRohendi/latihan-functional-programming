package fungsievaluasi;

import java.util.stream.IntStream;

public class FaktorialDeklaratif {
    public static int faktorial(int angka) {
        return IntStream
                .rangeClosed(1, angka)
                .reduce((a, b) -> a * b)
                .getAsInt();
    }

    public static void main(String[] args) {
        int angka = 5;

        System.out.println("Faktorial dari " + angka + " adalah " + faktorial(angka));
    }
}
