package com.fqy.com;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 17:51
 */
public class Person {
    private String name;
    public int age;

    public Person() {
    }

    private Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("你好我是一个人");
    }

    public String showNation(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

}
