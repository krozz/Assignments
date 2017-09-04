
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int i = 0;

        System.out.println("Enter first number: ");
        int first = reader.nextInt();

        System.out.println("Enter the second: ");
        int last = reader.nextInt();

        while (first <= last) {
            i =  i + first;
            first++;

        }

        System.out.println(i);

    }
}
