package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Список команд:\s
                1. LIST — выводит дела с их порядковыми номерами;\s
                2. ADD — добавляет дело в конец списка;\s
                3. EDIT — заменяет дело с указанным номером;\s
                4. DELETE — удаляет;\s
                5. EXIT - выход;\s
                Вызовите команду:""");

        ToDoList todo = new ToDoList();

        Scanner scan = new Scanner(System.in);

        while (true) {
            String command = scan.nextLine();
            if (command.equals("LIST")) {
            } else if (command.equals("ADD")) {
            } else if (command.equals("DELETE")) {
            } else if (command.equals("EDIT")) {
            } else if (command.equals("EXIT")) {
                break;
            }

        }
    }
}
