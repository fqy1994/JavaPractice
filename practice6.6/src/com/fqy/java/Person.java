package com.fqy.java;


/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/6 21:43
 */
public class Person {
    String name = "Jane";
    int age = 29;
    int sex =0;

    public void study() {
        System.out.println("studying");

    }

    public void showAge() {
        System.out.println("年龄：" + age);


    }

    public int addAge(int i) {
        System.out.print("修改后的年龄：");
        return age + i ;

    }

}
