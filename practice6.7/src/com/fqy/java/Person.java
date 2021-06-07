package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/7 21:53
 */
public class Person {
    private int age;
    private String name;
    private char sex;


    public Person() {
        this.age = 18;
        this.name = "jane";
    }

    public Person(int age, String name, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if(0 <= age && 100 >= age) {
            this.age = age;
        }else{
            System.out.println("请输入0~130的数字");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
