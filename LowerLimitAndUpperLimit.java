
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int lowerlimit = reader.nextInt();
        System.out.println("Enter higher limit: ");
        int higherlimit = reader.nextInt();
        
        int start = lowerlimit;
        
        while(start <= higherlimit)
        {
            System.out.println(start);
            start++;
        }
        
        
        // write your code here

    }
}
