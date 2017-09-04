
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int total = 0;
        int numberscounted = 0;
        double average = 0;
        int evennumbers = 0;
        int oddnumbers = 0;
        
        

        while (number != -1) {
            if (number % 2 == 0) {
                evennumbers++;
            }
            if (number % 2 == 1) {
                oddnumbers++;
            }

            numberscounted++;
            sum += number;
            average = sum;
            number = Integer.parseInt(reader.nextLine());
            
            

            if (number == -1) {
                average /= numberscounted;
                System.out.println("Thank you and see you later! ");
                break;
            }

            
            
            
            
            
            
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numberscounted);
        System.out.println("Average: " + average);
        System.out.println("Even Numbers: " + evennumbers);
        System.out.println("Odd Numbers: " + oddnumbers);
    }
}
