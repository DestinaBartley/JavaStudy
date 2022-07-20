package javaStudy.Udemy.section3;

public class dataTypes {

    public static void main(String[] args) {

        // String is a class
        String greeting = "Hello World";
        System.out.println(greeting);

        // Primitive data types - byte , short , int , long , float , double , boolean and char.

        // boolean is ture or false (1 bit)
        boolean isTrue = true;
        boolean isfalse = false;

        // Char is one character (16 bits)
        char myChar = 'D';
        System.out.println(myChar);
        char myUnicodeChar = '\u00A9';
        System.out.println(myUnicodeChar);

        // Byte is a whole number between -128 & 127 (8 bits)
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("\nByte minimum value = " + minByteValue);
        System.out.println("Byte maximum value = " + maxByteValue);

        // Short is a whole number between -32,768 & 32,767 (16 bits)
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("\nShort minimum value = " + minShortValue);
        System.out.println("Short maximum value = " + maxShortValue);

        // Int is a whole number between -2,147,483,648 & 2,147,483,647 (32 bits)
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("\nInt minimum value = " + minIntValue);
        System.out.println("Int maximum value = " + maxIntValue);

        // Long is a whole number between -9,223,372,036,854,775,808 & 9,223,372,036,854,775,807 (64 bits)
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("\nLong minimum value = " + minLongValue);
        System.out.println("Long maximum value = " + maxLongValue);
        long longNumber = 5000L;   // you have to put L at the end else Java assumes it's an int

        // Float is a decimal value up to 7 digits of precision (32 bits)
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("\nFloat minimum value = " + minFloatValue);
        System.out.println("Float maximum value = " + maxFloatValue);

        // Double is a decimal values up to 16 digits of precision (64 bits)
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("\nDouble minimum value = " + minDoubleValue);
        System.out.println("Double maximum value = " + maxDoubleValue);

    }
}
