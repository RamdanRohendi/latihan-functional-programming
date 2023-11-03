package fungsievaluasi;

public class DoubleNumberImp {
    public static int[] findAndDoubleEvenNumbers(int[] arr) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] = arr[i] * 2;
            }
        }

        return result;
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
