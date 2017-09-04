
import static java.lang.Math.abs;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            copied[i] = array[i];

        }
        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversed = new int[array.length];
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            length--;
            if (length >= 0) {
                reversed[i] = array[length];
            }

        }
        return reversed;
    }

}
