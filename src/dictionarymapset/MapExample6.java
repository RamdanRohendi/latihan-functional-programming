package dictionarymapset;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(101, "Ani");
        map.put(101, "Toni");
        map.put(102, "Wati");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
