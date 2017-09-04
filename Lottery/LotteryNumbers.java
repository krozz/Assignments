
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        int addnumber = 0;
        while (i < 7) {
            addnumber = this.random.nextInt(39) + 1;

            if (!containsNumber(addnumber)) {
                numbers.add(addnumber);
                i++;
            } 
        } 
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
