package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 13:57
 */
public abstract class Employee {
    private String name;
    private  int id;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }*///视频里没有

    public abstract void work();

}
