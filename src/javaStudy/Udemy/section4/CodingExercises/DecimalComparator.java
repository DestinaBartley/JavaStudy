package javaStudy.Udemy.section4.CodingExercises;

// Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){

        int numCheck1 = (int)(number1 * 1000);
        int numCheck2 = (int) (number2 * 1000);

        return numCheck1 == numCheck2;

    }

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
