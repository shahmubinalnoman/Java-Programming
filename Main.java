import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks as your wish:");
        int subjectivemark = input.nextInt();
        String grade = marksheet(subjectivemark);
        System.out.println("The grade is " + grade);
        input.close();
    }

    public static String marksheet(int mark) {
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