package javaStudy;
import java.util.*;

public class SetsListsMaps {
    public static void main(String[] args) {

        // HASHSET: a mutable UNSORTED and UNORDERED set that CAN'T contain the same element twice
        Set<Integer> hs = new HashSet<>();
        hs.add(57);
        hs.add(63);
        hs.add(31);
        hs.add(57);
        hs.add(44);
        hs.add(-44);
        System.out.println("Hashset: " + hs);

        // TREESET: a mutable SORTED set that CAN'T contain the same element twice
        Set<Integer> ts = new TreeSet<>();
        ts.add(57);
        ts.add(63);
        ts.add(31);
        ts.add(57);
        ts.add(44);
        ts.add(-44);
        System.out.println("Treeset: " + ts);

        // ARRAYLIST: a mutable ORDERED list that CAN contain the same element twice
        ArrayList<Integer> al = new ArrayList<>();
        al.add(57);
        al.add(63);
        al.add(31);
        al.add(57);
        al.add(44);
        al.add(-44);
        System.out.println("Arraylist: " + al);

        // HASHMAP: an unordered and unsorted map (dictionary)
        HashMap<String, Number> map1 = new HashMap<>();
        map1.put("Jay", 29);
        map1.put("Jeff", 1.5);
        map1.put("Pippa", 13);
        map1.put("Pebbles", 11);
        map1.put("Ant", 3);
        System.out.println("Hashmap: " + map1);
        
        // TREEMAP: a sorted map (dictionary)
        TreeMap<String, Number> map2 = new TreeMap<>();
        map2.put("Jay", 29);
        map2.put("Jeff", 1.5);
        map2.put("Pippa", 13);
        map2.put("Pebbles", 11);
        map2.put("Ant", 3);
        System.out.println("Treemap: " + map2);

        // LINKEDHASHMAP: an ordered map (dictionary)
        LinkedHashMap<String, Number> map3 = new LinkedHashMap<>();
        map3.put("Jay", 29);
        map3.put("Jeff", 1.5);
        map3.put("Pippa", 13);
        map3.put("Pebbles", 11);
        map3.put("Ant", 3);
        System.out.println("LinkedHashMap: " + map3);
    }
}

// SETS:
// A Set is a set of values with no duplicate elements.
// A Set is a non-indexed sequence.
// Sets do not allow position access to elements.
// Sets only allow Null elements to be stored once.
// A HashSet is a set where the elements are UNSORTED and UNORDERED
// A TreeSet is a set where the elements are SORTED.
// A HashSet is much faster and should be used over a Treeset unless ordering is important.

// LISTS:
// A list is a set of values that allow duplicate elements.
// A list is ORDERED.
// A List is an indexed sequence.
// Lists allow elements to be accessed by their position.
// Lists allow multiple Null elements to be stored.
// The main list implementation is ArrayList. There is also List, but it's slower.

// MAPS:
// A map can be thought of as a dictionary; it stores key/value pairs.
// A map cannot store multiple values per key; any new entry will overwrite the previous one.
// A map cannot have the same key twice, but it can have the same value twice.
// A Hashmap is UNORDERED and UNSORTED.
// A Treemap is SORTED.
// A LinkedHashMap is ORDERED.
// A Hashmap is more efficient in general so should be used when order is not important.
// To add multiple values per key to a map, a collection like "Vector" or "ArrayList" will need to be added to the map. 

// CHEATSHEET: https://kaanmutlu.files.wordpress.com/2011/12/collections.png

