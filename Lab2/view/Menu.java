package Lab2.view;

import Lab2.Service.StudentService;
import Lab2.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void menu(Scanner scanner,StudentService studentService,ArrayList<Student> students) {
        System.out.println("nhap so luong hoc sinh");
        int numberStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberStudents; i++) {
            System.out.println("nhap thong tin hoc sinh thu "+(i+1));
            Student student = studentService.inputInfo(scanner);
            students.add(student);
        }
        System.out.println(students);
        studentService.displayPercent(students);
    }
}
