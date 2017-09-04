
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int finish = array.length - 1;
        for(int i = 0; i <= finish; i++){
            
            if(i < finish){
            System.out.print(array[i] + ", ");
            }
            else{
                System.out.print(array[i]);
            }
        }
    }
}
