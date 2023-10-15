import java.lang.reflect.Array;
import java.util.Arrays;

public class TestCoding {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    static String coba(String isi, int ulang) {
        if (ulang == 0) {
            return "isi";
        } else {
            return coba(isi, ulang-1);
        }
    }

    static int[] fibonacci(int[] angkaAwalDuaDigit, int jumlahdigit) {
        if (jumlahdigit != 0) {
            int angkaTerakhir = angkaAwalDuaDigit.length - 1;
            int sebelumAngkaTerakhir = angkaAwalDuaDigit.length - 2;

            Arrays.fill(angkaAwalDuaDigit, angkaAwalDuaDigit[angkaTerakhir] + angkaAwalDuaDigit[sebelumAngkaTerakhir]);
            return fibonacci(angkaAwalDuaDigit, jumlahdigit - 1);
        }

        System.out.println(Arrays.toString(angkaAwalDuaDigit));
        return angkaAwalDuaDigit;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(Arrays.toString(fibonacci(new int[]{1, 1}, 5)));
        System.out.println(coba("a ", 5));

        int[] arraynya = new int[] {1, 2};
        Arrays.fill(arraynya, 4);
        System.out.println(Arrays.toString(arraynya));
    }
}
