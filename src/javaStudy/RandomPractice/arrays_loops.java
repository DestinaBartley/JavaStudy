package javaStudy.RandomPractice;

public class arrays_loops {
    public static void main(String[] args) {
        // string array
        String[] names = {"Destina", "Tulin", "Izak", "Dee", "Jay"};

        // for loop to find if an entry exists
        for (String name : names) {
            if (name.equals("Jay")) {
                System.out.println("Jay was found");
            }
        }

        // int array
        int[] ages = {28, 28, 22, 52, 29};

        for (int age : ages) {
            if (age > 50) {
                System.out.println("Someone is older than 50.");
            }
        }
    }
}
