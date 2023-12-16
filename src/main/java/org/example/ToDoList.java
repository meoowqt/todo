package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private final ArrayList<String> todoList = new ArrayList<>();
    public void add(String todo) {
        todoList.add(todo);
    }

    public void add(int index, String todo) {
        todoList.add(index, todo);
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
}
