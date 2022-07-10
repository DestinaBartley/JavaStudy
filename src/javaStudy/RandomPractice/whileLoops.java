package javaStudy.RandomPractice;
import java.util.Scanner;

public class whileLoops {

    public static void main(String[] args) {

    //  METHOD 1
    Scanner sc = new Scanner(System.in);
    int x = 0;
    int count = 0;
    while (x != 10) {      // while x does != 10 keep guessing
        System.out.print("Guess a number: ");
        x = sc.nextInt();
        count ++;          // adds 1 to count every loop
    }
    System.out.println("You guessed the number in " + count + " tries.");

    // METHOD 2
    Scanner sc2 = new Scanner(System.in);
    int y = 0;
    int count2 = 0;
    do {                   // do this...
        System.out.print("Guess a number: ");
        y = sc2.nextInt();
        count2 ++;
    } while (y != 10);    // ...while x != 10
    System.out.println("You guessed the number in " + count2 + " tries.");
    }
}
