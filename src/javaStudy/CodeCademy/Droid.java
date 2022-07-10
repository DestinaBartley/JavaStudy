package javaStudy.CodeCademy;

public class Droid {

    // attributes
    String name;
    int batteryLevel;

    //constructor
    public Droid (String name) {
        this.name = name;
        this.batteryLevel = 100;
        this.greeting();
    }

    public void performTask(String task) {
        System.out.println(name + " is performing the task: " + task);

    }

    public void updateBattery() {
        batteryLevel -= 10;
        System.out.println(name +"'s battery level is: " + batteryLevel);

    }

    public void greeting() {
        System.out.println("Hello, I'm the droid: " + name);
        System.out.println("My battery level is: " + batteryLevel);
    }

    public static void main(String[] args) {
        Droid droid1 = new Droid("Neil");
        droid1.performTask("Hoovering the stairs");
        droid1.updateBattery();
        droid1.performTask("Doing the dishes");
        droid1.updateBattery();


    }
}