package Operators;

public class logical_operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND operator
        boolean andResult = a && b;
        System.out.println("a && b: " + andResult);

        // Boolean logical AND operator
        boolean bitwiseAndResult = a & b;
        System.out.println("a & b: " + bitwiseAndResult);

        // Logical OR operator
        boolean orResult = a || b;
        System.out.println("a || b: " + orResult);

        // Boolean logical inclusive OR operator
        boolean bitwiseOrResult = a | b;
        System.out.println("a | b: " + bitwiseOrResult);

        // Boolean logical exclusive OR
        boolean xorResult = a ^ b;
        System.out.println("a ^ b: " + xorResult);

        // Logical NOT operator
        boolean notA = !a;
        boolean notB = !b;
        System.out.println("!a: " + notA);
        System.out.println("!b: " + notB);
    }
}
