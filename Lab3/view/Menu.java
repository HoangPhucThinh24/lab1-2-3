package Lab3.view;

import Lab3.Service.WorkerService;
import Lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    WorkerService workerService = new WorkerService();
    public void displayMenu(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("Worker Management");
        System.out.println("1- Tạo công nhân");
        System.out.println("2- Tăng/Giảm lương");
        System.out.println("3- Hiển thị thoogn tin");
        System.out.println("Mời b lựa chọn");
        selectMenu(scanner, workers);
    }

    public void selectMenu(Scanner scanner, ArrayList<Worker> workers){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Worker worker = workerService.inputInfo(scanner);
                workers.add(worker);
                break;
            case 2:
                workerService.modifySalary(scanner, workers, "+,-");
                break;
            case 3:
                System.out.println(workers);
                break;
            default:
                System.exit(0);
        }
    }
}
