import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        double Celcicus, Fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Fahrenheit");
        Fahrenheit = input.nextDouble();

        Celcicus = ((Fahrenheit - 32) * 5) / 9;
        System.out.println("The temperature in celcius is " + Celcicus);
        input.close();
    }
   
}
