import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int number = reader.nextInt();
        System.out.println("Type the second number: ");
        int number2 = reader.nextInt();
        
        if (number > number2) {
            System.out.println("Greater number: " + number);
        }
         if (number < number2) {
            System.out.println("Greater number: " + number2);
        }
          if (number == number2) {
            System.out.println("The numbers are equal!");
        }
        
        
        
        
    }
}
