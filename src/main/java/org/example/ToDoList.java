package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private ArrayList<Task> todoList;

    public void add(Task todo) {
        todoList.add(todo);
    }

    public void edit(Task todo, int index) {
        todoList.set(index, todo);
    }

    public void delete(int index) {
        todoList.remove(index);
    }

    public ArrayList<Task> getTodos() {
        return todoList;
    }

    public int size() {
        return todoList.size();
    }

    public Task get(int index) {
        return todoList.get(index);
    }
}
