
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int points = reader.nextInt();
        if (points >= 0 && points <= 29) {
            System.out.println("failed");
        }
        if (points >= 30 && points <= 34) {
            System.out.println("1");
        }
        if (points >= 35 && points <= 39) {
            System.out.println("2");
        }
        if (points >= 40 && points <= 44) {
            System.out.println("3");
        }
        if (points >= 45 && points <= 49) {
            System.out.println("4");

        }
        if (points >= 50 && points <= 60) {
            System.out.println("5");

        }

    }
}