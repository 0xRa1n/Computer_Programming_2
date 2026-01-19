package Access_Modifiers.Private;

public class PrivateUsage extends PrivateExample {
    public static void main(String[] args) {
        // Now create an instance of PrivateUsage
        PrivateUsage example = new PrivateUsage();

        // The following line would cause a compile-time error because
        // display() is private in PrivateExample and not accessible here.
        // example.display();
    }
    
}
