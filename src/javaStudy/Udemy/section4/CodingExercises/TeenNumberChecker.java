package javaStudy.Udemy.section4.CodingExercises;


// We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

//Write a method named hasTeen with 3 parameters of type int.

//The method should return boolean and it needs to return true if one of the
// parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

public class TeenNumberChecker {

    public static boolean hasTeen (int num1, int num2, int num3) {

        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static boolean isTeen (int num4) {

        return (num4 >= 13 && num4 <= 19);
    }

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

    }
}
