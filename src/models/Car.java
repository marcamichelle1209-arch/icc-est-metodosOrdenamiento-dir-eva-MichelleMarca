package models;

public class Car {
    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getBrand() {  // ← cambió de getName() a getBrand()
        return name;
    }

    public void setBrand(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", year=" + year + "]";
    }
}