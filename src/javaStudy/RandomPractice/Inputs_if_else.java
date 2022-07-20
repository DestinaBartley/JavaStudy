package javaStudy.RandomPractice;
import java.util.Scanner;

public class Inputs_if_else {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // gets a string input
        System.out.println("Your First Name: ");
        String name = toCapital(sc.next());

        if (name.equals("Destina")) {
            System.out.println("That's a great name!");
        }
        else if (name.equals("Jay")) {
            System.out.println("No Jays allowed!");
        }
        else {
            System.out.println("Hello " + name + "!");
        }

        // gets an int input
        System.out.println("Your age: ");
        int age = sc.nextInt();

        if (age >= 25 && age < 80) {
            System.out.println("Getting old!");
        }
        else if (age >= 80) {
            System.out.println("Ancient!");
        }
        else {
            System.out.println("A baby!");
        }
    }

    public static String toCapital(String name) {
        // create two substrings from name
        String firstLetter = name.substring(0, 1);
        String remainingLetters = name.substring(1);
        // change the first letter to uppercase
        firstLetter = firstLetter.toUpperCase();
        // join the two substrings
        name = firstLetter + remainingLetters;
        return name;

    }
}

