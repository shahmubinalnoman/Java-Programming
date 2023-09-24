import java.util.Scanner;

public class InputDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a age: ");
        int digit = scanner.nextInt();

        String output = getOutputForDigit(digit);

        System.out.println("Output: " + output);

        scanner.close();
    }

    public static String getOutputForDigit(int digit) {
        String output;
        
        switch (digit) {
            case 0:
                output = "Zero";
                break;
            case 1:
                output = "One";
                break;
            case 2:
                output = "Two";
                break;
            case 3:
                output = "Three";
                break;
            case 4:
                output = "Four";
                break;
            case 5:
                output = "Five";
                break;
            case 6:
                output = "Six";
                break;
            case 7:
                output = "Seven";
                break;
            case 8:
                output = "Eight";
                break;
            case 9:
                output = "Nine";
                break;
            default:
                output = "Invalid input. Please enter a single digit (0-9).";
        }

        return output;
    }
}
