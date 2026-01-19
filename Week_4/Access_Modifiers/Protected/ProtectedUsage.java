package Access_Modifiers.Protected; // ignore

public class ProtectedUsage extends ProtectedExample {
    public static void main(String[] args) {
        // Now create an instance of ProtectedUsage
        ProtectedUsage example = new ProtectedUsage();

        
        // And call the display method, which it inherited from ProtectedExample
        example.display();
    }
}