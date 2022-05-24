package javaStudy.CodeCademy;

public class Calculator {

    // this class doesn't need a constructor because it's nice and simple

    // methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    // main
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(15, 10));
        System.out.println(myCalculator.subtract(15, 10));
        System.out.println(myCalculator.divide(15, 10));
        System.out.println(myCalculator.modulo(15, 10));
    }
}
