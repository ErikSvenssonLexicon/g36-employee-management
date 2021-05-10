package org.example.model;

import java.time.LocalDate;

public abstract class Employee {

    private int id;
    private String name;
    protected double salary;
    private LocalDate dateHired;

    public Employee(int id, String name, double salary, LocalDate dateHired) {
        this.id = id;
        setSalary(salary);
        setDateHired(dateHired);
        setName(name);
    }

    public Employee(int id, String name, LocalDate dateHired) {
        this(id, name, 25000, dateHired);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getSalary();

    private void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }
}
