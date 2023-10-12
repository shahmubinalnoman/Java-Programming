class Student {
  int roll;
  String name;

  void insertRecord(int roll, String name) {
    this.roll = roll;
    this.name = name;
  }

  void displayInformation() {
    System.out.println("\n" + "Name:" + name + "\n" + "Roll No:" + roll);
    System.out.println();
  }
}

public class Taj2 {
  
  public static void main(String args[]) {
    Student s1 = new Student();
    Student s2 = new Student();
    s1.insertRecord(111, "Taj");
    s1.displayInformation();

    s2.insertRecord(222, "Noman");
    s2.displayInformation();
  }
}