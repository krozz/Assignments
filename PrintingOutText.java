
import java.util.Scanner;

public class PrintingOutText {

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many tiume? ");
        int x = reader.nextInt();
        int o = 0;
        
                
        
        
        while(o < x){
        printText();
        o++;
        }
    }
}
