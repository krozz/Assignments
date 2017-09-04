
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = reader.nextInt();
        int number = 2;
        int power = 0;
        int sum = 0;
        
        while(power <= n)
        {
        int result = (int)Math.pow(number, power);
        
        power++;
         sum += result;
        
        }
        System.out.println(sum);
        
    }
}
