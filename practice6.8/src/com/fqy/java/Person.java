package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 11:33
 */
public class Person {
    protected String name = "person";
    protected int age = 50;
    public String getInfo(){
        return "Name: " + name + "\n" + "age: " + age;
    }
}
