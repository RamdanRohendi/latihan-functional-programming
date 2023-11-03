package fungsievaluasi;

public class FaktorialImperatif {
    public static int faktorial(int angka) {
        int hasil = angka;

        for (int i = (angka-1); i > 0; i--) {
            hasil *= i;
        }

        return hasil;
    }

    public static void main(String[] args) {
        int angka = 5;

        System.out.println("Faktorial dari " + angka + " adalah " + faktorial(angka));
    }
}
