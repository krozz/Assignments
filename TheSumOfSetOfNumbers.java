
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter limit: ");

        int limit = reader.nextInt();

        int i = 0;
        
        int result = 0;
        int o = limit;
        int a = o;
        while (i < limit) {
            o--;
            a = a + o;
            i++;
            
        }

        System.out.println(a);

    }
}
