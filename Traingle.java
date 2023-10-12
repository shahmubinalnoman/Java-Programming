import java.util.Scanner;

public class Traingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base of traingle: ");
        double base = input.nextDouble();
        System.out.print("Please enter the height of traingle: ");
        double height = input.nextDouble();

        double traingle = .5 * base * height;
        System.out.println("The area of traingle is " + traingle);

        input.close();
    }
}
