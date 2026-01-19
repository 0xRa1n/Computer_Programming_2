package Access_Modifiers; // ignore

import Access_Modifiers.Public.PublicExample;

public class Main extends PublicExample {
    public static void main(String[] args) {
        PublicExample example = new PublicExample();
        example.display();
    }
}