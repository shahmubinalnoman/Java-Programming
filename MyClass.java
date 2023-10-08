class Person {
    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class MyClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Rabby";
        person1.age = 22;

        Person person2 = new Person();
        person2.name = "Shihab";
        person2.age = 18;

        person1.displayDetails();
        person2.displayDetails();
    }
}




