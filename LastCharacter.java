
import java.util.Scanner;

public class LastCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();
        lastCharacter(text);
    }

    public static char lastCharacter(String text) {
        int lengthofname = text.length();
        int length = lengthofname - 1;
        char name = text.charAt(length);
        System.out.println("Last character: " + name);

        return name;

    }
}
