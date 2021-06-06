package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/6 21:49
 */
public class PersonTest {
    public static void main(String[] args) {
        Person jane = new Person();
        jane.study();
        jane.showAge();
        System.out.println(jane.addAge(2));

    }
}
