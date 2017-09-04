
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
   
        

        while (true) {
            System.out.println("temperature [between -30 and 40] or quit [100]: ");
            double value = Double.parseDouble(reader.nextLine());
            if (value == 100) {
                break;
            }

            if (value >= -30 && value <= 40) {
                Graph.addNumber(value);
            } else {
                System.out.println("Out of range. \n");
            }
        }

    }
}
