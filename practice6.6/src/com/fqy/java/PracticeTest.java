package com.fqy.java;

import org.junit.Test;

import java.lang.annotation.Target;
import java.util.Random;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/6 22:17
 */
public class PracticeTest {

    public static void main(String[] args) {

        PracticeTest practiceTest = new PracticeTest();
        System.out.println(practiceTest.rectangle(12, 11));
    }


    public int rectangle(int lenghth, int width) {
        for (int i = 0; i < lenghth; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return lenghth * width;
    }

    @Test
    public void StudentTest() {
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i, (int) (Math.random() * 6 + 1), (int) (Math.random() * 101));
        }
        for (int i = 0; i < students.length; i++) {
            if (3 == students[i].state) {
                System.out.println("students = " + students[i]);
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("使用冒泡排序后：");

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;

                }

            }

        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }



    }
    @Test
    public void myDateTest(){
        MyDate myDate = new MyDate(1994, 6, 22);
        MyDate bfDate = new MyDate(1994, 8, 31);
        System.out.println("bfDate = " + bfDate);
        System.out.println("myDate = " + myDate);
    }

    /**
     * 判断题，是否构成重载
     */
    @Test
    public void tfTest() {
        /*void show(int a , char b, double c){}

        *void show(int x, char y ,double z){}
        *int show(int a ,double c,char b)
        *void show(int a, double c,char b)
        *boolean show(int c, char b)
        *void show(double c)
        *double show(int x,char y,double z)
        *boid shows()
        * */

    }
}
