
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int yeartotest = reader.nextInt();

        if ((yeartotest % 4 == 0 && yeartotest % 100 != 0) || yeartotest % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }

}
