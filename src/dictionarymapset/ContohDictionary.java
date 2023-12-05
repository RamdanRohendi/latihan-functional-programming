package dictionarymapset;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class ContohDictionary {
    public static void main(String[] args) {
        Dictionary<String, Integer> myDict = new Hashtable<>();
        myDict.put("Apel", 1);
        myDict.put("Pisang", 2);
        myDict.put("Anggur", 3);

        Enumeration<String> keys = myDict.keys();
        for (String key = null; keys.hasMoreElements();) {
            key = keys.nextElement();
            System.out.println("Keys in Dictionary: " + key + " Value: " + myDict.get(key));
        }
        System.out.println("\nSize of Dictionary: " + myDict.size());
        System.out.println("\nRemove: " + myDict.remove("Apel"));

        Enumeration<String> key2 = myDict.keys();
        while (key2.hasMoreElements()) {
            String key = key2.nextElement();
            System.out.println("Key: " + key + ", Value: " + myDict.get(key));
        }

        System.out.println("\nSize of Dictionary: " + myDict.size());
    }
}
