package javaStudy.PlymCollege;

import java.util.Scanner;

public class week03 {
    public static void main(String[] args) {


        // 1. Compare two numbers against all the Logical Operators and print out all that are TRUE.

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int num1 = reader.nextInt();
//        System.out.println("Enter number 2: ");
//        int num2 = reader.nextInt();
//
//        if (num1 == num2 )
//            System.out.println(num1 + " == " + num2);
//        if (num1 != num2)
//            System.out.println(num1 + " != " + num2);
//        if (num1 < num2)
//            System.out.println(num1 + " < " + num2);
//        if (num1 > num2)
//            System.out.println(num1 + " > " + num2);
//        if (num1 <= num2)
//            System.out.println(num1 + " <= " + num2);
//        if (num1 >= num2)
//            System.out.println(num1 + " >= " + num2);


        // 2. Accept three integers from the user and return true if the second number is greater than first number and
        //    third number is greater than second number. If "abc" is true, second number does not need to be greater
        //    than first number.

//        Scanner reader2 = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int a = reader2.nextInt();
//        System.out.println("Enter number 2: ");
//        int b = reader2.nextInt();
//        System.out.println("Enter number 3: ");
//        int c = reader2.nextInt();
//
//        System.out.println(question2(a, b, c));


        // 3. Convert seconds to hour, minute and seconds
        Scanner reader3 = new Scanner(System.in);
        System.out.println("Enter number of seconds: ");
        int seconds = reader3.nextInt();

        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);
    }









        // class for question 2
//    public static boolean question2(int num1, int num2, int num3) {
//
//        // returning a boolean
//        return ((num1 > num2) && (num3 > num2));
//    }
}
