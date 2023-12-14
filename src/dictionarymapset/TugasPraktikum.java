package dictionarymapset;

import java.util.*;

public class TugasPraktikum {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Pisang", 2);
        map.put("Kiwi", 4);
        map.put("Anggur", 3);
        map.put("Apel", 1);

        Set<String> keys = map.keySet();
        Set<Integer> values = new LinkedHashSet<>(map.values());
        Set<Map.Entry<String, Integer>> datas = map.entrySet();

        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + datas);
    }
}
