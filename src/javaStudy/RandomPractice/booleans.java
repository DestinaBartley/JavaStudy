package javaStudy.RandomPractice;

public class booleans {
    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        String z = "hello";
        String a = "goodbye";

        // returns true
        boolean compare = x < y && a != z;
        System.out.println(compare);

        // returns false
        boolean compare2 = x > y && z == a ;
        System.out.println(compare2);
    }
}
