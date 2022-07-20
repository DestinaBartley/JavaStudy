package javaStudy.Udemy.section3;

public class ifStatements {
    public static void main(String[] args) {


//        // is not
//        boolean isAlien = false;
//        if (!isAlien) {
//            System.out.println("It is not an alien!");
//            System.out.println("Thank goodness!");
//        }
//        else {
//            System.out.println("RUN!");
//        }
//
//
//        boolean hasPassed = true;
//        if (!hasPassed) {
//            System.out.println("Better luck next time...");
//        } else {
//            System.out.println("Congratulations, you've passed!");
//        }
//
//
//        int topScore = 98;
//        int myScore = 97;
//
//        // greater than, less than, equal to
//        if (myScore > topScore) {
//            System.out.println("You've got the top score");
//        }
//        else if (myScore == topScore){
//            System.out.println("You're drawing with the top score");
//        }
//        else if (myScore < topScore) {
//            System.out.println("You have not beaten the top score");
//        }
//
//
//        // Logical AND operator (true or false)
//        if ((topScore > myScore) && (topScore < 100)) {
//            System.out.println("Less than top score and less than 100");
//        }
//
//
//        // Logical OR operator (true or false)
//        if ((topScore > 90) || (myScore <= 90)) {
//            System.out.println("Either or both of the conditions are true");
//        }
//
//        int newValue = 50;
//        if (newValue == 50) {
//            System.out.println("it's 50");
//
//        }


        // Ternary operator
        boolean isCar = false;

        // is wasCar true? If not, it's false
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is True");
        }
        else {
            System.out.println("wasCar is False");
        }
    }
}
