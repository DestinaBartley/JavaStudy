package javaStudy.RandomPractice;
import java.util.*;

public class mapsPractice {
    public static void main(String[] args) {

        String greeting = "Hello and Welcome";

        // loops through greeting and print each letter
        for(char i:greeting.toCharArray()) {
            System.out.println(i);
        }

        // loop through greeting and count characters
        Map map1 = new HashMap();

        for(char i:greeting.toCharArray()) {
            if (map1.containsKey(i)){
                int old = (int) map1.get(i);
                map1.put(i, old+1);
            }
            else {
                map1.put(i, 1);
            }
        }
        System.out.println(map1);


    }
}
