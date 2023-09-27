class Student {
  int roll;
  String name;

  void insertRecord(int r, String n) {
    roll = r;
    name = n;
  }

  void displayInformation() {
    System.out.println("\n" + "Name:" + name + "\n" + "Roll No:" + roll);
    System.out.println();
  }
}

public class Taj {
  public static void main(String args[]) {
    Student s1 = new Student();
    Student s2 = new Student();
    s1.insertRecord(111, "Taj");
    s1.displayInformation();

    s2.insertRecord(222, "Noman");
    s2.displayInformation();
  }
}