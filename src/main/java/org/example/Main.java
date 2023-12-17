package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();

        Scanner scan = new Scanner(System.in);

        label:
        while (true) {
            System.out.println("""
                    Список команд:\s
                    1. LIST — выводит задачи с их индексами;\s
                    2. ADD — добавляет задачи в конец списка;\s
                    3. EDIT — заменяет задачу с указанным индексом;\s
                    4. DELETE — удаляет задачу с указанным индексом;\s
                    5. EXIT - выход;\s
                    Вызовите команду:""");

            String command = scan.nextLine();

            switch (command) {
                case "LIST":
                    todo.getTodo();
                    break;
                case "ADD": {
                    System.out.println("Введите дату задачи:");
                    String data = scan.next();
                    System.out.println("Введите название задачи");
                    String name = scan.next();
                    System.out.println("Введите описание задачи");
                    String description = scan.next();
                    Task task = new Task(data, name, description);
                    todo.add(task);
                    System.out.println("Задача успешно добавлена!");
                    break;
                }
                case "DELETE": {
                    System.out.println("Введите индекс задачи:");
                    String index = scan.next();
                    todo.delete(Integer.parseInt(index));
                    break;
                }
                case "EDIT": {
                    System.out.println("Введите индекс задачи");
                    String index = scan.next();
                    System.out.println("Введите новую дату задачи:");
                    String data = scan.next();
                    System.out.println("Введите новое название задачи");
                    String name = scan.next();
                    System.out.println("Введите новое описание задачи");
                    String description = scan.next();
                    Task task = new Task(data, name, description);
                    todo.edit(task, Integer.parseInt(index));
                    break;
                }
                case "EXIT":
                    break label;
            }

        }
    }
}
