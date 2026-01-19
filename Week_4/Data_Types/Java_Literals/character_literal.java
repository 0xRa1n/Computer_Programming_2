package Java_Literals; // ignore
public class character_literal {
    public static void main(String[] args) {
        // Character literal
        // It represents a single Unicode character. It is a 16-bit value.
        // Enclosed in single quotes
        char charValue = 'A';
        System.out.println("Character Value: " + charValue);

        // For special characters, escape sequences are used
        char newLineChar = '\n'; // new line
        System.out.println("New Line Character:" + newLineChar + "This text is after a new line.");

        char tabChar = '\t'; // tab
        System.out.println("Tab Character:" + tabChar + "This text is after a tab.");

        char carriageReturnChar = '\r'; // carriage return
        System.out.println("Carriage Return Character:" + carriageReturnChar + "This text is after a carriage return.");
    }
}