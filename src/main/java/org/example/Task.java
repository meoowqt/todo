package org.example;

public class Task {
    private String name;
    private String description;
    private Data data;

    public class Data {
        private int day;
        private int month;
        private int year;

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getData() {
            return Integer.toString(day) + "." + Integer.toString(month) + "." + Integer.toString(year);
        }
    }

    public Task(Data data, String name, String description) {
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
        return data.getData();
    }

}
