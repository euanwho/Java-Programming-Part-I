
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentnumber = reader.nextLine();
            list.add(new Student(name, studentnumber));
        }
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        for (Student student : list) {
            System.out.println("Result: ");
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
