package javaStudy;
import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // gets a string input
        System.out.println("Type a string: ");
        String stringInput = sc.next();
        System.out.println(stringInput);

        // gets an int input
        System.out.println("Type an int: ");
        int intInput = sc.nextInt();
        System.out.println(intInput);

        // gets a double input
        System.out.println("Type a double: ");
        double doubleInput = sc.nextDouble();
        System.out.println(doubleInput);

    }
}

