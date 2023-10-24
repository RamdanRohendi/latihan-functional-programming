package highorderfunction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparedTo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 4, 9, 7);

        Collections.sort(numbers, (a, b) -> { return a.compareTo(b); });

        System.out.println(numbers);
        Comparator<Integer> comparator = (a, b) -> { return a.compareTo(b); };
        Comparator<Integer> reverseComparator = comparator.reversed();

        Collections.sort(numbers, reverseComparator);
        System.out.println(numbers);
    }
}
