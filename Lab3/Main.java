package Lab3;

import Lab3.entities.Worker;
import Lab3.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Worker> workers = new ArrayList<Worker>();
        Menu menu = new Menu();

        do {
            menu.displayMenu(scanner,workers);
        } while (true);

    }
}
