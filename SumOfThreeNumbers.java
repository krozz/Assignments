
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        System.out.println("Enter first number: ");
        read = reader.nextInt();
        sum = read;
        System.out.println("Enter another ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.println("last one: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.println("Sum: " + sum);
    }
}
