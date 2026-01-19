public class data_types {
    public static void main(String[] args) {
        boolean boolValue = true; // can only be true or false (or 1 and 0)
        char charValue = 'Z'; // also known as textual-char, it is a single 16-bit Unicode character enclosed in single quotes.
        int intValue = 100;
        short shortValue = 10;
        int integerValue = 200;
        long longValue = 1000L;
        double doubleValue = 99.99;
        float floatValue = 19.99f;

        // integral types: byte, short, int, long, char
        // integral data types in Java use three forms: decimal, octal, or hexadecimal
        // integral types have int as the default data type. You can use suffixes L or l for long literals and C or c for char literals.

        // floating point types: float, double  
        // floating point types can be represented in decimal or scientific notation. The default data type is double. You can use suffixes F or f for float literals. You can also use E or e to represent the exponent part in scientific notation. Double literals can optionally have suffixes D or d.

        System.out.println("Boolean Value: " + boolValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Float Value: " + floatValue);
    }
}
