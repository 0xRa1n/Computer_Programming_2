package Operators;

public class increment_decrement {
    public static void main(String[] args) {
        int a = 10;

        // Pre-increment operator
        ++a; // equivalent to a = a + 1
        System.out.println("After Pre-Increment: " + a);

        // Post-increment operator
        a++; // equivalent to a = a + 1
        System.out.println("After Post-Increment: " + a);

        // Pre-decrement operator
        --a; // equivalent to a = a - 1
        System.out.println("After Pre-Decrement: " + a);

        // Post-decrement operator
        a--; // equivalent to a = a - 1
        System.out.println("After Post-Decrement: " + a);
    }
}
