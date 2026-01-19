package Access_Modifiers.Private;

public class PrivateExample {
    private void display() {
        System.out.println("Hello world! I am from PrivateExample class.");
    }

    public static void main(String[] args) {
        PrivateExample example = new PrivateExample();
        example.display(); // Accessing private method within the same class
    }
}
