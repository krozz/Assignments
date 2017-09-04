
public class Printing {

    public static void printStars(int amount) {
        //making i the counter.
        int i = 1;
        //print the little stars while it is true
        while (i <= amount) {
            System.out.print("*");
            i++;
           
        }
         System.out.println();
    }

    public static void printSquare(int sideSize) {
        int i = 1;

        while (i <= sideSize) {

            printStars(sideSize);
            
            i++;
        }
    }

    public static void printRectangle(int width, int height) {

        int i = 1;

        while (i <= height) {
            printStars(width);
            i++;
        }

    }

    public static void printTriangle(int size) {

        for (int i = 1; i <= size; i++) {
            printStars(i);
        }

    }

    public static void main(String[] args) {

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println(" ---");  // printing --- to separate the figures
        printSquare(3);
        System.out.println(" ---");
        printRectangle(5,6);
        System.out.println(" ---");
        printTriangle(3);
        System.out.println(" ---");
    }

}
