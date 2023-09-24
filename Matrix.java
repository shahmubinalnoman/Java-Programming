import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter the elements for the 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the element at position [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("The entered matrix is:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Close the Scanner
        input.close();
    }
}
