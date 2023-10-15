package jenisfungsi;

import java.util.Arrays;

public class DeclarativeCode {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};

        int[] evenArray  = Arrays.stream(array)
                .filter(a -> a % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(evenArray));
        System.out.println(sum(8, 9));
    }

    // Pure Function
    public static int sum(int a, int b) {
        return a + b;
    }
}
