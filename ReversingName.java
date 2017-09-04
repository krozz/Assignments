
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();
        int i = 0;
        int o = 1;
        int k = text.length();
        
        int amount = text.length();
        while (i < amount) {
            k--;
            System.out.print(text.charAt(k));
            i++;
            o++;
            
        }
    }
}
