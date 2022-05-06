package javaStudy;

import java.util.HashMap;

public class mapsPractice {
    public static void main(String[] args) {

        HashMap map1 = new HashMap();

        String greeting = "Hello and Welcome";

        // loop through greeting
        for(char x:greeting.toCharyArray()) {
            if (map1.containsKey(x)){
                int old = (int) map1.get(x);
                map1.put(x, old+1);
            }
            else {
                map1.put(x, 1);
            }
        }
        System.out.println(map1);
    }
}
