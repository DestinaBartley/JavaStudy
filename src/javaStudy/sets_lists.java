package javaStudy;
import java.util.ArrayList;
import java.util.Set;

import java.util.HashSet;

public class sets_lists {
    public static void main(String[] args) {

        // HashSet: a mutable UNORDERED set that CAN'T contain the same element twice
        Set<Integer> t = new HashSet<>();
        t.add(5);
        t.add(10);
        t.add(-8);
        System.out.println(t);

        // checking if set contains a value
        boolean x = t.contains(5);
        System.out.println(x);

        // removing value from set
        t.remove(-8);
        System.out.println(t);

        // ArrayList: a mutable ORDERED list that CAN contain the same element twice
        ArrayList<Integer> y = new ArrayList<>();
        y.add(4);
        y.add(10);
        y.add(1);
        y.add(4);
        System.out.println(y);

    }
}

// SETS:
// A Set is a generic set of values with no duplicate elements.
// A HashSet is a set where the elements are UNORDERED.
// A TreeSet is a set where the elements are ORDERED.
// A HashSet is much faster.

// LISTS:

