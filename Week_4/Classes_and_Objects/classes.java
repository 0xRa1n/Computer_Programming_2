package Classes_and_Objects;

public class classes {
    // class definition example
    public class StudentRecord {
        // empty class body
    }

    // constructor example
    public class Dog {
        String name;

        // Constructor
        public Dog(String dogName) {
            name = dogName;
        }
    }

    // instance attribute example
    public class Car {
        String color; // instance attribute, meaning that each call to Car will have its own color attribute. To make this static, use the static keyword after String.
    }

    // accessor method example
    public static class Person {
        private String name; // private attribute

        // accessor method to get the value of name
        public String getName() {
            return name;
        }
    }

    // mutator method example
    public static class PersonWithMutator {
        private String name; // private attribute

        public void setName(String name) {
            this.name = "Not Bob";
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        // below is the example of accessor method usage
        Person person = new Person();

        person.name = "Alice";
        System.out.println("Person's Name: " + person.getName());
        // end of example

        // below is the example of mutator method usage
        PersonWithMutator person2 = new PersonWithMutator();
        person2.setName("Bob");
        System.out.println("Person's Name: " + person2.getName());
        // end of example
    }

}
