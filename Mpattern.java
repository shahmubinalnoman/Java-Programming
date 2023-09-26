import java.util.Scanner;

public class Mpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (height of M pattern): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 3) {
            System.out.println("Please enter a value of N that is greater than or equal to 3.");
            return;
        }

        int mid = (n + 1) / 2;

        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (mid - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Print the base of the 'M' pattern
        for (int i = 1; i <= mid - 1; i++) {
            System.out.print("* ");
        }
        System.out.print("*");
    }
}
