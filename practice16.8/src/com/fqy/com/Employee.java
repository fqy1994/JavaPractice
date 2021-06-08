package com.fqy.com;



/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 14:27
 */
public abstract class Employee {
    private String name;
    private int id;
    private  MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int id, MyDate birthday) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    public String getName() {
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract int earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birthday=" + birthday.toDateString() +
                '}';
    }
}
