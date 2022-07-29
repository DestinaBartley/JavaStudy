package javaStudy.Udemy.section4.CodingExercises;

// method overloading
public class GetDurationString {

    public static String getDurationString(long mins, long secs) {

        if (!(mins >= 0) || !(secs >= 0 && secs<=59)) {
            return "Invalid Value";
        }

        long hours = mins / 60;
        long remainingMins = mins % 60;

        return hours + "h " + remainingMins + "m " + secs + "s";
    }

    public static String getDurationString(long secs) {

        if (!(secs >= 0)) {
            return "Invalid Value";
        }

        long mins = secs / 60;
        long remainingSecs = secs % 60;

        return getDurationString(mins, remainingSecs);

    }
    public static void main(String[] args) {
        System.out.println(getDurationString(126, 55));
        System.out.println(getDurationString(3495));
    }
}
