
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        
        if (number != -1) {
            this.sum += number;
        }
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        double average = 0.0;
        if (this.amountOfNumbers > 0) {
            average = (double) this.sum / (double) this.amountOfNumbers;
        } else {
            return 0;
        }
        return average;   

    }
}
