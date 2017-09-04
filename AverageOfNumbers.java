
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int totallist = list.size() + 1;
        int total = 0;
        for (int i : list) {
            total += i;
        }
        return total;
    }

    public static double average(ArrayList<Integer> list) {
        // write code here
        double numerator = sum(list) * 1.0;
        double denominator = list.size() * 1.0;

        double average = numerator / denominator;

        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
