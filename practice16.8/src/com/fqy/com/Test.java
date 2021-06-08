package com.fqy.com;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 内部类的使用，不怎么用，先了解，以后碰到了再复习
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 17:13
 */
public class Test {
    public Test(){
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        s2.a = 20;
        Test.Inner s3 = new Inner();
        System.out.println(s1.a);
        System.out.println(s2.a);
        System.out.println(s3.a);


    }
    class Inner{
        public int a = 5;
    }

    public static void main(String[] args) {
        Test t = new Test();
        Inner r = t.new Inner();
        System.out.println(r.a);

    }
}
