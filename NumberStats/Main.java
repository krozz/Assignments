
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        int scanned = 0;
        System.out.println("Type numbers: ");

        while (scanned != -1) {

            scanned = reader.nextInt();

            if (scanned != -1) {
                all.addNumber(scanned);
            }
            if (scanned % 2 == 0) {
                even.addNumber(scanned);

            }
            if (scanned % 2 == 1) {
                odd.addNumber(scanned);
            }

        }

        System.out.println("sum: " + all.sum());

        System.out.println("sum of even: " + even.sum());

        System.out.println("sum of odd:  " + odd.sum());

    }
}
