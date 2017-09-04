
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void printDistributed(int[] grades) {
        int n = 0;
        int totalgrades = 0;
        
        System.out.println("Grade distribution:");
        String[] stargrades = {"", "", "", "", "", "",};
        for (int i = 0; i < grades.length; i++) {
            int numberOfTimes = grades[i];
            int o = 0;
            while (o < numberOfTimes) {
                stargrades[i] += "*";
                o++;
            }
        }
        System.out.println("");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.println(i + ":" + stargrades[i]);
        }

        for (int i = grades.length - 1; i >= 0; i--) {
            totalgrades += stargrades[i].length();

        }

        for (int i = grades.length - 1; i >= 1; i--) {
            n += stargrades[i].length();
        }
        
        double percentage = 100* (double) n/(double)totalgrades; //used float because double was being rounded down, im not even sure i shouldve used float.
        System.out.println("Acceptance percentage: " + percentage);
    }

    public static void main(String[] args) {
        int[] graded = {0, 0, 0, 0, 0, 0};
        ArrayList<Integer> grades = new ArrayList();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        Boolean bool = true;
        while (bool) {
            int grade = Integer.parseInt(reader.nextLine());
            if (grade <= 60 && grade >= 0) {
                grades.add(grade);
            }
            if (grade == -1) {

                bool = false;

                for (int points : grades) {
                    if (points < 30) {
                        graded[0] += 1;
                    } else if (points < 35) {
                        graded[1] += 1;
                    } else if (points < 40) {
                        graded[2] += 1;
                    } else if (points < 45) {
                        graded[3] += 1;
                    } else if (points < 50) {
                        graded[4] += 1;
                    } else {
                        graded[5] += 1;
                    }
                }
                printDistributed(graded);
            }
        }
    }
}
