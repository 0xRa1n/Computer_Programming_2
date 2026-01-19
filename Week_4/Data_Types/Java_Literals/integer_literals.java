package Java_Literals; // ignore
public class integer_literals {
    public static void main(String[] args) {
        // Hexadecimal literal (base 16)
        // allowed digits are 0-9 and A-F (or a-f), prefixed with 0x or 0X
        int hexValue = 0x2A;
        System.out.println("Hexadecimal Value: " + hexValue);

        // Decimal literal (base 10)
        // allowed digits are 0-9
        int decimalValue = 42;
        System.out.println("Decimal Value: " + decimalValue);

        // Octal literal (base 8)
        // allowed digits are 0-7, prefixed with 0
        int octalValue = 052;
        System.out.println("Octal Value: " + octalValue);

        // Binary literal (base 2)
        // From 1.7 onward, the literal value can be specified even in binary form
        // allowed digits are 0 and 1, prefixed with 0b or 0B
        int binaryValue = 0b101010;
        System.out.println("Binary Value: " + binaryValue);
    }
}