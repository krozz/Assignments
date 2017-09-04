
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string

        int l = text.length();
        int i = 0;
        String help = "";
        String reversed = "";
        while (i < l) {
            reversed = text.substring(l - i - 1, l - i);
            help = help + reversed;
            i++;
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
