import java.util.ArrayList;
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        ArrayList<Bird> birdList = new ArrayList<Bird>();
        

        while (true) {
            System.out.print("? ");
            String command = reader.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                
                birdList.add(new Bird (name, latinName));
            } else if (command.equals("Observation")) {
                // Search through arraylist for name, if found, return the observation count of that object
                System.out.print("What was observed:? ");
                String searched = reader.nextLine();
                
                boolean haveBird = false;
                
                for (Bird bird : birdList) {
                    if (bird.getName().equals(searched)) {
                        bird.observeCount();
                        haveBird = true;
                    } 
                }
                
                if (!haveBird) {
                    System.out.println("Is not a bird!");
                }
            } else if (command.equals("Show")) {
                System.out.print("What? ");
                String searched = reader.nextLine();
                for (Bird bird: birdList) {
                    if (bird.getName().equals(searched)) {
                        System.out.println(bird.toString());
                    }
                }
            } else if (command.equals("Statistics")) {
                for (Bird bird : birdList) {
                    System.out.println(bird.toString());
                }
            } else if (command.equals("Quit")) {
                break;
            } else {
                System.out.println("?");
            }
        }     
    }
}