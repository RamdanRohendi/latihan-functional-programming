package fungsievaluasi;

public class PrimeInteratif {
    public static boolean isPrime(long number) {
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return number > 1;
    }

    public static void main(String[] args) {
        boolean hasil;
        hasil = isPrime(9220000000000000039L);

        System.out.println(hasil);
    }
}
