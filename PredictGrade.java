import java.util.Scanner;
public class PredictGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the subjective mark (out of 100): ");
        int subjectiveMark = scanner.nextInt();

        String grade = predictGrade(subjectiveMark);

        System.out.println("Predicted Grade: " + grade);

        scanner.close();
    }

    public static String predictGrade(int mark) {
        if (mark >= 90 && mark <= 100) {
            return "A+";
        } else if (mark >= 80 && mark < 90) {
            return "A";
        } else if (mark >= 70 && mark < 80) {
            return "B";
        } else if (mark >= 60 && mark < 70) {
            return "C";
        } else if (mark >= 50 && mark < 60) {
            return "D";
        } else if (mark >= 0 && mark < 50) {
            return "F";
        } else {
            return "Invalid input";
        }
    }
}
