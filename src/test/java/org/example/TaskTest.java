package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task1 = new Task("12/11/23", "Купить молоко", "Сходить в магазин и купить молоко");
    Task task2 = new Task("23/1/33", "Помыть окна", "...");

    @Test
    void getName() {
        assertEquals("Купить молоко", task1.getName());
        assertEquals("Помыть окна", task2.getName());
    }

    @Test
    void getDescription() {
        assertEquals("Сходить в магазин и купить молоко", task1.getDescription());
        assertEquals("...", task2.getDescription());
    }

    @Test
    void getData() {
        assertEquals("12/11/23", task1.getData());
        assertEquals("23/1/33", task2.getData());
    }
}