package Operators;

public class relational_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Relational Operators
        boolean greaterThan = a > b;
        boolean lessThan = a < b;
        boolean greaterThanOrEqual = a >= b;
        boolean lessThanOrEqual = a <= b;
        boolean equalTo = a == b;
        boolean notEqualTo = a != b;

        System.out.println("a > b (is A greater than B): " + greaterThan);
        System.out.println("a < b (is A less than B): " + lessThan);
        System.out.println("a >= b (is A greater than or equal to B): " + greaterThanOrEqual);
        System.out.println("a <= b (is A less than or equal to B): " + lessThanOrEqual);
        System.out.println("a == b (is A equal to B): " + equalTo);
        System.out.println("a != b (is A not equal to B): " + notEqualTo);

    }
}
