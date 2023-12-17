package org.example;

public class Task {
    private String name;
    private String description;
    private String data;


    public Task(String data, String name, String description) {
        this.data = data;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getData() {
        return data;
    }

}
