import java.util.Scanner;

public class Gradefc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();

        String grade = CalculateGrade(marks);
        System.out.println("Your grade is " + grade);

        scanner.close();
    }

    public static String CalculateGrade(int marks) {
        switch (marks / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}
