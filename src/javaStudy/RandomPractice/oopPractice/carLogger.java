package javaStudy.RandomPractice.oopPractice;

public class carLogger {
    String make;
    int year;
    String color;

    // constructor
    public carLogger(String carMake, int carYear, String carColor) {
        make = carMake;
        year = carYear;
        color = carColor;
    }
    // method
    public void carDescription() {
        System.out.print("A " + this.make + " from the year " + this.year + " in " + this.color +".");
    }
    // main
    public static void main(String[] args) {
        carLogger honda = new carLogger("Honda Civic", 1992, "red");
        honda.carDescription();
        }
    }
