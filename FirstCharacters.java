
import java.util.Scanner;

public class FirstCharacters {

    public static char threeCharacters(String text) {
        char letter1 = text.charAt(0);
        char letter2 = text.charAt(1);
        char letter3 = text.charAt(2);
        System.out.println("1. character: " + letter1);
        System.out.println("2. character: " + letter2);
        System.out.println("3. character: " + letter3);
        return letter1;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();
        if (text.length() > 3) {
            threeCharacters(text);
        } 
        
        
    }

}
