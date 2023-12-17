package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private ArrayList<String> todoList;

    public void add(String todo) {
        todoList.add(todo);
    }

    public void edit(String todo, int index) {
        todoList.set(index, todo);
    }

    public void delete(int index) {
        todoList.remove(index);
    }

    public ArrayList<String> getTodos() {
        return todoList;
    }

    public int size() {
        return todoList.size();
    }

    public String get(int index) {
        return todoList.get(index);
    }
}
