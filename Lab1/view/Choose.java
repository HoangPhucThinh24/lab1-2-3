package Lab1.view;

import Lab1.Service.StudentService;
import Lab1.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Choose {
    public void choose(Scanner scanner, StudentService studentService, ArrayList<Student> students) {
        do {
            Student student = studentService.inputInfoStudent(scanner);
            students.add(student);
            System.out.println("ban co muon nhap nua khong? (yes/no)");
            String choose = scanner.nextLine();
            if (choose.equals("no")) {
                break;
            }
        } while (true);

        System.out.println(students);
    }
}
