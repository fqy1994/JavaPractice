package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/6 22:25
 */
public class Student {
    int number;
    int state;
    int score;

    public Student(int number, int state, int score) {
        this.number = number;
        this.state = state;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
