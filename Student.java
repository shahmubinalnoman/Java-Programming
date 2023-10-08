public class Student {
    public static void main(String[] args) {

        Main1 s1 = new Main1("Rabbi", "Rajshahi", 22);
        Main1 s2 = new Main1("Shihab", "Dhaka", 18);

        System.out.println("Student 1 Data:");
        s1.printData();

        System.out.println("\nStudent 2 Data:");
        s2.printData();
    }
}

class Main1 {

    String name;
    String city;
    int age;

    public Main1(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public void printData() {
        System.out.println("Student Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}
