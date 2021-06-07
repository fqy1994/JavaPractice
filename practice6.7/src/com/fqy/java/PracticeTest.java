package com.fqy.java;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/7 20:53
 */
public class PracticeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int sum = 1;
        int n = scanner.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("结果为：" + n);

        } else {
            for (int i = 1; i < n + 1; i++) {
                sum *= i;
            }
            System.out.println("结果为： " + sum);

        }
    }

    /**
     * 判断是否打印地址值
     * 多理解
     */
    @Test
    public void Practice1Test() {
        int[] arr = new int[10];
        System.out.println(arr);//地址值

        char[] arr1 = new char[10];
        System.out.println(arr1);//  涉及方法的重载，方法体是遍历数组


    }

    @Test
    public void Practice2Test() {
        Circle circle = new Circle();
        PassObject passObject = new PassObject();
        int time = 15;
        passObject.printAreas(circle, time);


    }

    /**
     * 计算n的阶层
     */
    @Test
    public void Practice3Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int sum = 1;
        int n = scanner.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("结果为：" + n);

        } else {
            for (int i = 1; i < n + 1; i++) {
                sum *= i;
            }
            System.out.println("结果为： " + sum);

        }


    }

    /**
     * 练习递归、
     */
    @Test
    public void Practice4Test() {


        int y1 = f1(20);
        System.out.println("y1 = " + y1);

        for (int i = 1; i < 11; i++) {
            int y = f(i);

            System.out.println("y = " + y);
        }
    }

    public int f(int x) {
        if (0 == x) {
            return 1;
        } else if (1 == x) {
            return 4;
        } else {
            return f(x - 2) + 2 * f(x - 1);
        }
    }

    public int f1(int x) {
        if (20 == x) {
            return 1;
        } else if (21 == x) {
            return 4;
        } else {
            return f(x + 2) - 2 * f(x + 1);
        }
    }

    @Test
    public void PersonTest() {
        Person b = new Person();
        System.out.println("age1 = " + b.getAge());
        b.setAge(13);
        int age2 = b.getAge();
        System.out.println("age2 = " + age2);
        System.out.println("b = " + b);


    }
}
