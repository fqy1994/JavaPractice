package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 11:36
 */
public class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor: " + major;
    }
}
