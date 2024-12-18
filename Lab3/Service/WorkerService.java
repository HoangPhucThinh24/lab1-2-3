package Lab3.Service;

import Lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public Worker inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập lương: ");
        double salary =Double.parseDouble( scanner.nextLine());
        System.out.println("nhap noi lam viec");
        String workPlace = scanner.nextLine();
        return new Worker( name, age, salary, workPlace);
    }

    public void modifySalary(Scanner scanner, ArrayList<Worker>workers, String type){
        System.out.println("MỜi b nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Worker worker = findById(id, workers);
        if(worker == null){
            System.out.println("K tìm thấy công nhân có id: "+id);
        } else {
            if(type.equals("-")){
                System.out.println("Mời b nhập số tiền muốn giảm: ");
                double money =Double.parseDouble( scanner.nextLine());
                worker.setSalary(worker.getSalary() - money);
            } else {
                System.out.println("Mời b nhập số tiền muốn tăng: ");
                double money =Double.parseDouble( scanner.nextLine());
                worker.setSalary(worker.getSalary() + money);
            }

        }
    }

    public Worker findById(int id, ArrayList<Worker> workers){
        for (Worker worker: workers){
            if(worker.getId()==id){
                return worker;
            }
        }
        return null;
    }
}
