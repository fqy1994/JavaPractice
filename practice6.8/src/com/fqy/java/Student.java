package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 11:34
 */
public class Student extends Person{
    protected String school = "pku";
    @Override
    public String getInfo(){
        return "Name:" + name + "\nage: " + age + "\nschool: " + school;
    }
}
