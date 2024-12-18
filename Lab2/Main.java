package Lab2;

import Lab2.Service.StudentService;
import Lab2.entities.Student;
import Lab2.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService();
        ArrayList<Student> students = new ArrayList<>();

        Menu menu = new Menu();
        menu.menu(scanner,studentService,students);

    }
}
