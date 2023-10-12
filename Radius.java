import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        final double pi = 3.1415;
        Scanner input = new Scanner(System.in);
        System.out.print("Plese Enter the Radius: ");
        double radius = input.nextDouble();

        radius = pi * radius * radius;
        System.out.println("The area of circle is: " + radius);

        input.close();

    }
}
