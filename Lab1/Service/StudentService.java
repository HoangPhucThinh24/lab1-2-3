package Lab1.Service;

import Lab1.entities.Student;

import java.util.Scanner;

public class StudentService {
    public Student inputInfoStudent(Scanner scanner) {
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap dia chi");
        String address = scanner.nextLine();
        return new Student(name, address);
    }
}
