
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int numberOfTimes = array[i];
            int o = 0;
            while (o < numberOfTimes) {
                System.out.print("*");
                o++;
            }
            System.out.println("");
        }

    }
}
