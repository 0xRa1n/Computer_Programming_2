public class reference_vs_primitive {
    public static void main(String[] args) {
        // Primitive data type
        // stores data in the actual memory location
        int primitiveValue = 10;
        System.out.println("Primitive Value: " + primitiveValue);

        // Reference data type
        // stores the address in memory
        String referenceValue = new String("Hello, World!");
        System.out.println("Reference Value: " + referenceValue);
    }
}
