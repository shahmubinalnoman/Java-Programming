import java.util.Scanner;

public class Trail {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your marks: ");
    int marks = input.nextInt();

    char Marks = Allmarks(marks);
    System.out.println("The grade is " + Marks);
    input.close();
  }

  public static char Allmarks(int marks) {
    switch (marks / 10) {
      case 10:
        return 'C';
      case 9:
        return 'B';
      default:
        return 'A';
    }

  }
}