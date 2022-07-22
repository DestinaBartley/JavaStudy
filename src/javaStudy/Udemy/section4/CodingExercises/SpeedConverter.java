package javaStudy.Udemy.section4.CodingExercises;

//1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
// This method needs to return the rounded value of the calculation of type long.

//If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to
// indicate an invalid value.

//Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion
// and rounding, check the notes in the text below.

//2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.

//This method should not return anything (void) and it needs to calculate milesPerHour from the
// kilometersPerHour parameter.

//Then it needs to print a message in the format "XX km/h = YY mi/h".

//If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        return Math.round(kilometersPerHour * 0.62137119223733);
    }


    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour <= 0) {
            System.out.println("Invalid Value");
        }
        System.out.println(kilometersPerHour + " KPH = " + toMilesPerHour(kilometersPerHour) + " MPH");
    }


    public static void main(String[] args) {

        printConversion(6);
    }
}
