package Java_Literals; // ignore
public class floating_point_literal {
    public static void main(String[] args) {
        // Floating-point literal (base 10)
        // allowed digits are 0-9, can include a decimal point and an optional exponent part
        double doubleValue = 3.14;
        System.out.println("Double Value: " + doubleValue);

        float floatValue = 3.14f;
        System.out.println("Float Value: " + floatValue);

        // floating point can be represented in scientific notation
        double scientificValue = 1.5e3; // 1.5 * 10^3
        System.out.println("Scientific Notation Value: " + scientificValue);
    }
}
