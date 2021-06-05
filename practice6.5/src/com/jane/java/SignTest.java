package com.jane.java;

import org.junit.Test;

/**
 * 算数运算符：自加、自减
 *
 * @author fan_jennifer
 * @create 2021-06-2021/6/5 18:30
 */
public class SignTest {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        //++运算符没有空格
        int i = i1++;
        System.out.println("i = " + i);//10
        System.out.println("i1 = " + i1);//11
        i = ++i1;
        System.out.println("i = " + i);//12
        System.out.println("i1 = " + i1);//12
        i = i2--;
        System.out.println("i = " + i);//20
        System.out.println("i2 = " + i2);//19
        i = --i2;
        System.out.println("i = " + i);//18
        System.out.println("i2 = " + i2);//18

    }

    /**
     * 思考区别判断结果
     * 赋值运算、自增自减运算
     */
    @Test
    public void test() {
        short s = 3;
        //s = s + 2；编译不通过
        s +=2;//不会改变类型
        System.out.println("s = " + s);//5
        
        int i = 1;
        i *=0.1;//不会改变类型
        System.out.println("i = " + i);//0
        i++;
        System.out.println("i = " + i);//1

        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m = " + m);//3
        System.out.println("n = " + n);//6

        int d = 10;
        d += (d++) + (++d);
        System.out.println("n = " + d);//32




    }

}
