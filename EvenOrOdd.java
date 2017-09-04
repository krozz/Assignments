
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = reader.nextInt();

        double test = number % 2;
        
        if (test < 0){
            test = test * -1;
        }
        if (test == 0) {
            System.out.println("Number" + " " + number + " " + "is even.");
        }
        if (test == 1) {
            System.out.println("Number" + " " + number + " " + "is odd.");
        }
        
    }
}
