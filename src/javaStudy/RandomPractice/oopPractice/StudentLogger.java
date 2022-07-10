package javaStudy.RandomPractice.oopPractice;
import java.util.ArrayList;
import java.util.LinkedHashMap;


public class StudentLogger {

    // attributes
    private final String firstName;
    private final String lastName;
    private final int yearBorn;
    private final String course;
    private static final ArrayList<LinkedHashMap<String, java.io.Serializable>> studentList = new ArrayList<>();


    // constructor
    public StudentLogger(String firstName, String lastName, int yearBorn, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
        this.course = course;
        this.welcomeMessage();
        this.addToList();
    }

    // methods
    public void welcomeMessage() {
        System.out.printf("Hello %s %s! Welcome to your course, %s!\n", firstName, lastName, course);
    }

    private void addToList() {
        // creates a dictionary of each entry
        LinkedHashMap<String, java.io.Serializable> studentMap = new LinkedHashMap<>();
        studentMap.put("First Name", firstName);
        studentMap.put("Last Name", lastName);
        studentMap.put("Year Born", yearBorn);
        studentMap.put("Course", course);

        // adds each dict entry to the list
        studentList.add(studentMap);
    }

    public static ArrayList getStudentList() {
        //publicly returns the list
        return studentList;
    }
}
