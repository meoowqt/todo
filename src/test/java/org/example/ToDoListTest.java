package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @org.junit.jupiter.api.Test
    void add() {
        ToDoList todoList = new ToDoList();
        Task task1 = new Task("12/11/23", "Купить молоко", "Сходить в магазин и купить молоко");
        Task task2 = new Task("23/1/33", "Помыть окна", "...");
        todoList.add(task1);
        todoList.add(task2);
        assertEquals(task1, todoList.getTask(0));
        assertEquals(task2, todoList.getTask(1));
    }

    @org.junit.jupiter.api.Test
    void edit() {
        ToDoList todoList = new ToDoList();
        Task task1 = new Task("12/11/23", "Купить молоко", "Сходить в магазин и купить молоко");
        Task task2 = new Task("23/1/33", "Помыть окна", "...");
        todoList.add(task1);
        todoList.add(task2);
        todoList.edit(task2, 0);
        todoList.edit(task1, 1);
        assertEquals(task1, todoList.getTask(1));
        assertEquals(task2, todoList.getTask(0));
    }

    @org.junit.jupiter.api.Test
    void delete() {
        ToDoList todoList = new ToDoList();
        Task task1 = new Task("12/11/23", "Купить молоко", "Сходить в магазин и купить молоко");
        Task task2 = new Task("23/1/33", "Помыть окна", "...");
        todoList.add(task1);
        todoList.add(task2);
        todoList.delete(0);
        assertEquals(1, todoList.size());
        assertEquals("Помыть окна", todoList.getTask(0).getName());
    }


    @org.junit.jupiter.api.Test
    void size() {
        ToDoList todoList = new ToDoList();
        Task task1 = new Task("12/11/23", "Купить молоко", "Сходить в магазин и купить молоко");
        Task task2 = new Task("23/1/33", "Помыть окна", "...");
        todoList.add(task1);
        todoList.add(task2);
        assertEquals(2, todoList.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        ToDoList todoList = new ToDoList();
        Task task1 = new Task("12/11/23", "Купить молоко", "Сходить в магазин и купить молоко");
        Task task2 = new Task("23/1/33", "Помыть окна", "...");
        todoList.add(task1);
        todoList.add(task2);
        assertEquals(task1, todoList.getTask(0));
        assertEquals(task2, todoList.getTask(1));
    }
}