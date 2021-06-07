package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/7 22:16
 */
public class Student extends Person {
    private long number;
    private int math;
    private int english;
    private int computer;

    public Student(int age, String name, char sex, long number, int math, int english, int computer) {
        super(age, name, sex);
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public double aver(){
        return 0;

    }
    public int max(){
        return 0;
    }
    public int min(){
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", math=" + math +
                ", english=" + english +
                ", computer=" + computer +
                '}';
    }
}






