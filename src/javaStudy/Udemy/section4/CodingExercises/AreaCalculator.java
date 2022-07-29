package javaStudy.Udemy.section4.CodingExercises;

public class AreaCalculator {

    public static double area(double radius){
        if (radius < 0) {
            return -1;
        }
        return (radius * (radius * 3.14159265359));
    }

    public static double area(double x, double y){
        if (x < 0 || y <0){
            return -1;
        }
        return(x*y);
    }
    public static void main(String[] args) {
        System.out.println(area(-1));
        System.out.println(area(5, 5));

    }
}
