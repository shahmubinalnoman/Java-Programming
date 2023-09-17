import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single digit (0-9): ");
        int digit = scanner.nextInt();

        String word = convertToWord(digit);

        if (word != null) {
            System.out.println("Word representation: " + word);
        } else {
            System.out.println("Invalid input. Please enter a single digit (0-9).");
        }

        scanner.close();
    }

    public static String convertToWord(int digit) {
        switch (digit) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return null;
        }
    }
}
