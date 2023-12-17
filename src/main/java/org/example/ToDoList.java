package org.example;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> todoList = new ArrayList<Task>();

    public void add(Task todo) {
        todoList.add(todo);
    }

    public void edit(Task todo, int index) {
        todoList.set(index, todo);
    }

    public void delete(int index) {
        todoList.remove(index);
    }

    public void getTodo() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i).getData() + " " + todoList.get(i).getName() + " " + todoList.get(i).getDescription());
        }
    }

    public int size() {
        return todoList.size();
    }

    public Task get(int index) {
        return todoList.get(index);
    }
}
