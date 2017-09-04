
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();
        int i = 0;
        int o = 1;
        int amount = text.length();
        while (i < amount) {

            System.out.println(o + ". character: " + text.charAt(i));
            i++;
            o++;
        }
    }
}
