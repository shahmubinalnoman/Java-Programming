import java.util.Scanner;

public class GradeSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();

        switch (marks / 10) {
            case 10:
                System.out.println("Your grade is A+");
                break;
            case 9:
                System.out.println("Your grade is A");
                break;
            case 8:
                System.out.println("Your grade is B");
                break;
            case 7:
                System.out.println("Your grade is C");
                break;
            case 6:
                System.out.println("Your grade is D");
                break;
            default:
                System.out.println("Your grade is F");
        }
        scanner.close();
    }
}
