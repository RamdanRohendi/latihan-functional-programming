package fungsievaluasi;

import java.util.Arrays;

public class DoubleNumberDeclarative {
    public static int[] findAndDoubleEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = new int[numbers.length];
        result = findAndDoubleEvenNumbers(numbers);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
