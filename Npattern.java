import java.util.Scanner;

public class Npattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("N");
                } else {
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
    }
}
