
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int secondcompare = 0;
        int greatest = 0;
        if (number1 > number2) {
            secondcompare = number1;
        } else {
            secondcompare = number2;
        }
        if (secondcompare > number3) {
            greatest = secondcompare;
        } else {
            greatest = number3;
        }

        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
