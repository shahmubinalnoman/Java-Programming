class Student2 {
    String name;
    int rollNumber;

    public void getData(String studentName, int studentRollNumber) {
        name = studentName;
        rollNumber = studentRollNumber;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Lab_2 {
    public static void main(String[] args) {

        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.getData("Rabby", 101);
        s2.getData("Shihab", 102);

        System.out.println("Student 1 Data:"); 
        s1.printData();

        System.out.println("\nStudent 2 Data:");
        s2.printData();

    }
}
