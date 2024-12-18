package Lab2.Service;

import Lab2.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner) {
        System.out.println("nhap ten");
        String name = scanner.next();
        System.out.println("nhap diem toan");
        double scoreMath = Double.parseDouble(scanner.next());
        System.out.println("nhap diem vat ly");
        double scorePhysic = Double.parseDouble(scanner.next());
        System.out.println("nhap diem hoa");
        double scoreChemistry = Double.parseDouble(scanner.next());
        return new Student (name,scoreMath,scorePhysic,scoreChemistry);
    }

    public String classify(Student student) {
        double avgscore = (student.getScoreMath()+student.getScoreChemistry()+student.getScorePhysic()) / 3;
        if (avgscore >= 8) {
            return "A";
        } else if (avgscore >= 6.5) {
            return "B";
        } else {
            return "C";
        }
    }

    public void displayPercent(ArrayList<Student> students) {
        double countA=0,countB=0, countC =0 ;
        for (Student student : students) {
            String type = classify(student);
            if (type.equals("A")) {
                countA++;
            } else if (type.equals("B")) {
                countB++;
            } else countC++;
        }
        System.out.println("% hoc sinh loai A: "+(countA/students.size())*100+"%");
        System.out.println("% hoc sinh loai B: "+(countB/students.size())*100+"%");
        System.out.println("% hoc sinh loai C: "+(countC/students.size())*100+"%");
    }

}
