package javaStudy.Udemy.section3;

public class challenge {
    public static void main(String[] args) {


        double num1 = 20.00;
        double num2 = 80.00;

        double answer = (num1 + num2) * 100.00;
        System.out.println(answer);
        double remainder = answer % 45.00;
        System.out.println(remainder);

        // if the remainder is greater than 0 then true, else false
        boolean isRemainder = (remainder > 0) ? true: false;

        if (!isRemainder) {
            System.out.println("No remainder");
        }
        else {
            System.out.println("There is a remainder");
        }



    }
}