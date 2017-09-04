
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String person1 = reader.nextLine();
        System.out.println("Type your age: ");
        int age1 = reader.nextInt();
        reader.nextLine();
        System.out.println("Type your name: ");
        String person2 = reader.nextLine();
        System.out.println("Type your age: ");
        int age2 = reader.nextInt();
        
        int total = age1 + age2;
        
        
        System.out.println(person1 + " " + "and" + " " + person2 + " " + "are" + " "+ total + " " + "years old in total.");
    }
}
