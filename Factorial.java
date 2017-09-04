
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = reader.nextInt();
        int i = 1;

        while (number > 1) {
            
            int mult = number;
            number--;
            i *= mult;

        }
        System.out.println(i);
    }
}
