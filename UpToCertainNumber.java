
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 1;
        int read = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the limit: ");
        while(number <= read){
            
        
           System.out.println(number);
           number++;
        }
    }
}
