package javaStudy.PlymCollege;
import java.util.Scanner;

public class week02 {
    public static void main(String[] args) {

        // 1. Print the sum (addition), multiply, subtract, divide and remainder of two user inputted numbers.

//        Scanner reader = new Scanner(System.in);     // reading from system.in
//        System.out.println("Enter number 1: ");
//        int num1 = reader.nextInt();                 // scans the next input as an int
//        System.out.println("Enter number 2: ");
//        int num2 = reader.nextInt();
//
//        System.out.println("Added: " + (num1 + num2));
//        System.out.println("Multiplied: " + (num1 * num2));
//        System.out.println("Subtracted: " + (num1 - num2));
//        System.out.println("Divided: " + (num1 / num2));


        // 2. Take five numbers as input then calculate & print their mean average.

//        Scanner reader2 = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int num3 = reader2.nextInt();
//        System.out.println("Enter number 2: ");
//        int num4 = reader2.nextInt();
//        System.out.println("Enter number 3: ");
//        int num5 = reader2.nextInt();
//        System.out.println("Enter number 4: ");
//        int num6 = reader2.nextInt();
//        System.out.println("Enter number 5: ");
//        int num7 = reader2.nextInt();
//
//        int meanAverage = (num3 + num4 +num5 + num6 + num7) / 5;
//        System.out.println("The mean average is: " + meanAverage);


        // 3. Swap the values contained within two variables
//        String value1 = "Jeff";
//        String value2 = "Pip";
//        String temp = "";
//
//        temp = value1;    // Jeff
//        value1 = value2;  // Pip
//        value2 = temp;    // Jeff
//
//        System.out.println(value1);
//        System.out.println(value2);


        // 4. Get number from user and print if it's positive or negative

//        Scanner reader3 = new Scanner(System.in);
//        System.out.println("Input a number: ");
//        int num8 = reader3.nextInt();
//
//        if (num8 > 0) {
//            System.out.println("It's a positive number");
//        } else if (num8 < 0) {
//            System.out.println("It's a negative number");
//        } else {
//            System.out.println("It's 0");
//        }


        // 5. Take three numbers from the user and print the greatest number

//        Scanner reader4 = new Scanner (System.in);
//
//        System.out.println("Enter Number 1: ");
//        int num9 = reader4.nextInt();
//        System.out.println("Enter Number 2: ");
//        int num10 = reader4.nextInt();
//        System.out.println("Enter Number 3: ");
//        int num11 = reader4.nextInt();
//
//        int greatestNumber = 0;
//
//        if ((num9 > num10) && (num9 > num11)) {
//            greatestNumber = num9;
//        }
//        else if ((num10 > num9) && (num10 > num11)) {
//            greatestNumber = num10;
//        }
//        else {
//            greatestNumber = num11;
//        }
//
//        System.out.println("Greatest number is: " + greatestNumber);
//
//
//        // 6. Take a number as an input and print its multiplication table up to 10

        Scanner reader5 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num13 = reader5.nextInt();

        // int i = 0; <- iterator
        // i < 10; <- range(1, 11)
        // i++;
        for (int i = 1; i < 11; i++) {
            System.out.println(i * num13);
        }


    }
}
