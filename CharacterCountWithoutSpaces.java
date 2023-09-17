import java.util.Scanner;

public class CharacterCountWithoutSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove spaces from the input string
        String stringWithoutSpaces = inputString.replaceAll(" ", "");

        // Calculate the length of the string without spaces
        int characterCountWithoutSpaces = stringWithoutSpaces.length();

        System.out.println("Character count without spaces: " + characterCountWithoutSpaces);
        scanner.close();
    }

}
