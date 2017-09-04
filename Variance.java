import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int totallist = list.size()+ 1;
        int total = 0;
        for (int i : list){
            total += i;
            
        } return total;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
         double numerator = sum(list) * 1.0;
        double denominator = list.size() * 1.0;

        double average = numerator / denominator;

        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double avg = average(list);
        double var = 0;
        for (int i : list) {
            var += (double)Math.pow((i) - avg, 2);
        }
        var /= (list.size()-1); 
        return var;        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
