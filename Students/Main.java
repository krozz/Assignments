
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String userName = reader.nextLine();

            if (userName.isEmpty()) {
                break;
            } else {
                System.out.print("studentnumber: ");
                String userNum = reader.nextLine();

                list.add(new Student(userName, userNum));
            }
        }

        System.out.println("");
        for (Student std : list) {
            System.out.println(std);
        }

        System.out.println("");
        System.out.print("Give search term: ");
        String userSearch = reader.nextLine();
        System.out.println("Result: ");

        for (Student std : list) {
            String studentName = std.getName();
            if (studentName.contains(userSearch)) {
                System.out.println(std);
            }
        }

    }
}
