package com.jane.java;

/**
 * 简单
 * 判断变量赋值的结果
 * @author fan_jennifer
 * @create 2021-06-2021/6/5 16:19
 */
//类名格式XxxXxxXxx
//必须有且只有一个public class
public class VariableTest {
    public static void main(String[] args) {
        //声明但未初始化变量
        int number1;
        //初始化变量，存在栈里
        //堆里存放new出来的变量
        number1 = 10;
        int number2;
        number2 = 20;

        int number3;
        number3 = number1 + number2;
        System.out.println("number3 = " + number3);//30

        int number4 = 50;
        int number5 = number4 - number3;
        System.out.println("number5 = " + number5);//20

    }
}
