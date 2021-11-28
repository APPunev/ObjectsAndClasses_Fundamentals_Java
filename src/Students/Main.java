package Students;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //List<String> students = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<Student> students = new ArrayList<>();

        while(!input.equals("end")){
            String[] token = input.split("\\s+");

            String firstname = token[0];
            String lastname = token[1];
            int age = Integer.parseInt(token[2]);
            String city = token[3];

            if(!studentExist(students, firstname, lastname, age, city)){
                Student student = new Student(firstname,lastname,age,city);
                students.add(student);
            }


            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student student : students) {
            if (student.getCity().equals(city)) {
                System.out.println(student);
            }
        }
    }

    private static boolean studentExist(List<Student> students, String firstname, String lastname, int age, String city) {
        for (Student student : students) {
            boolean isFirstNameSame = student.getFirstName().equals(firstname);
            boolean isLastNameEqual = student.getLastName().equals(lastname);
            if (isFirstNameSame && isLastNameEqual) {
                student.setAge(age);
                student.setCity(city);
                return true;
            }
        }
        return false;
    }
}
