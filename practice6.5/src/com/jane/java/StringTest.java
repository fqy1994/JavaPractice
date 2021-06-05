package com.jane.java;

/**
 * 简单
 * 字符串的拼接运算结果判断
 * @author fan_jennifer
 * @create 2021-06-2021/6/5 16:51
 */
public class StringTest {
    public static void main(String[] args) {
        int no = 10;
        //字符串在常量池里
        String str = "abcdef";
        //运算符左右两边空格
        //字符串与数值型拼为字符串,包括boolean型
        //字符串不能改变，赋值的是地址值
        String str1 = str + "xyz" + no;

        str1 = str1 + "123";
        char c = '国';

        double pi = 3.14159;
        str1 = str1 + pi;
        boolean b = false;
        str1 = str1 + b;
        str1 = str1 + c;

        System.out.println("str1 = " + str1);//abcdefxyz101233.14159false国



    }

}
