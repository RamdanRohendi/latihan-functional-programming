package dictionarymapset;

import java.util.HashSet;
import java.util.Set;

public class ContohSet {
    public static void main(String[] args) {
        Set<String> abjad = new HashSet<String>();

        abjad.add("A");
        abjad.add("B");
        abjad.add("C");
        abjad.add("D");
        abjad.add("R");
        abjad.add("R");
        abjad.add("R");

        for (String value : abjad)
            System.out.println(value + ", ");

        System.out.println(abjad);
    }
}
