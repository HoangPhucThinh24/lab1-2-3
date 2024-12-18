package Lab1;

import Lab1.Service.StudentService;
import Lab1.entities.Student;
import Lab1.view.Choose;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        StudentService studentService = new StudentService();
        Choose choose = new Choose();
        choose.choose(scanner,studentService,students);
    }
}
