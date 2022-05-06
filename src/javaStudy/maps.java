package javaStudy;

import java.util.HashMap;
import java.util.TreeMap;

public class maps {
    public static void main(String[] args) {

        // Hashmap
        HashMap map1 = new HashMap();
        map1.put("Person", "Jay");
        map1.put("Dog", "Jeff");
        map1.put("Cat", "Pebbles");
        map1.put("Year", 2022);
        System.out.println(map1);
        System.out.println(map1.get("Dog"));

        // Treemap
        TreeMap map2 = new TreeMap();
        map2.put("Person", "Destina");
        map2.put("Dog", "Pippa");
        System.out.println(map2);

    }
}


// A map can be thought of as a dictionary.

// HASHMAPS:
// A Hashmap stores key/value pairs.
// A Hashmap is unordered.
// A HashMap cannot store multiple values per key; any new entry will overwrite the previous one.
// A Hashmap cannot have the same key twice, but it can have the same value twice.
// A Hashmap is more efficient in general so use it when order is not important.

// TREEMAPS:
// A Treemap stores key/value pairs.
// A Treemap is ordered.
// A Treemap cannot store multiple values per key; any new entry will overwrite the previous one.