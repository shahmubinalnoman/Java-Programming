
import java.util.*;

public class StudentAge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of peoples ages you want to enter: ");
        // int num = 10;
        // inp.nextInt();
        int i;
        int[] age;
        age = new int[10];

        System.out.println("Enter the ages:");
        input.close();
        for (i = 0; i < 10; i++) {
            age[i] = input.nextInt();
        }

        int min = age[0];
        int max = age[0];

        for (i = 1; i < 10; i++) {
            if (min > age[i]) {
                min = age[i];
            }
            if (max < age[i]) {
                max = age[i];
            }
        }

        System.out.println("The smallest entered age is: " + min);
        System.out.println("The largest entered age is: " + max);

    }

}