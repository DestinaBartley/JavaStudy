package javaStudy.RandomPractice.oopPractice;

public class StudentLoggerMain {

    public static void main(String[] args) {

        StudentLogger student1 = new StudentLogger("Destina", "Bartley", 1993, "Software Development");
        StudentLogger student2 = new StudentLogger("Martyn", "Rapson", 1999, "Humanity Studies");
        StudentLogger student3 = new StudentLogger("Sam", "Pepper", 1995, "Geography");

        System.out.println(StudentLogger.getStudentList());

    }
}
