package fungsievaluasi;

import java.util.stream.LongStream;

public class PrimeDeclarative {
    public static boolean isPrime(long number) {
        return number > 1 && LongStream
                .rangeClosed(2, (long) Math.sqrt(number))
                .parallel()
                .noneMatch(index -> number % index == 0);
    }

    public static void main(String[] args) {
        boolean hasil;
        hasil = isPrime(9220000000000000039L);

        System.out.println(hasil);
    }
}
