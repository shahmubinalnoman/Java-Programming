import java.util.Scanner;

public class FtoC {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

System.out.print("Enter your temperature in Farhenight: ");
double far=input.nextDouble();
double Celcius=5.0/9*(far-32);
System.out.println("The result in Celcius is: "+Celcius);

input.close();
    }
}