package com.jane.java;

import org.junit.Test;

import java.util.Scanner;
//import sun.applet.Main;

/**
 * 注意：""、""、的拼接char的运算
 *
 * @author fan_jennifer
 * @create 2021-06-2021/6/5 17:10
 */
public class PracticeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入号数");
        int day = scanner.nextInt();
        int days = 0;
        switch (month) {
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                days += 28;
            case 2:
                days += 31;
            case 1:
                days += day;
                break;

        }
        System.out.println("days = " + days);


    }


    /**
     * 测试单元名以test结尾、判断对错与拼接结果
     */
    @Test
    public void Practice1Test() {
        //错误的代码，右边没有引号，左边应该为数值型
        //String str1 = 4;
        String str1 = "";//正确
        String str2 = 3.5f + "";//正确
        System.out.println("str1 = " + str1);//"null"
        System.out.println("str2 = " + str2);//str2 = 3.5
        //从左往右运算
        System.out.println(3 + 4 + "Hello!");//7Hello!
        System.out.println("Hello!" + 3 + 4);//Hello!34
        System.out.println('a' + 1 + "Hello!");//98Hello!
        System.out.println("Hello" + 'a' + 1);//Helloa1
        System.out.println('a' + 'b');//195


    }


    /**
     * 判断是否通过编译,与整型变量类型有关
     */
    @Test
    public void Practice2Test() {
        short s = 5;
        //s = s-2;//不通过，因为s是short，二2默认是int，运算不能自动转为short

        byte b = 3;
        //b = b + 4;//不通过，因为b是byte，二4默认是int，运算不能自动转为byte
        b = (byte) (b + 4);//通过，强转为byte
        System.out.println("b = " + b);

        char c = 'a';
        int i = 5;
        float d = .314F;
        double result = c + i + d;//通过，自动转为double
        System.out.println("result = " + result);

        byte b1 = 5;
        short s1 = 3;
        //short t = s1 + b1;//不通过，byte和short自动为int


    }

    /**
     * 随意给出一个整数，打印显示它的个位数，十位数，百位数的值
     * 格式如下：
     * 个位数：
     * 十位数
     * 百位数
     */
    @Test
    public void Practice3Test() {
        //test不能输入控制台
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输出一个三位数:");
        int num = scanner.nextInt();
        int singleDigit = num % 10;
        int tenDigit = num % 100 / 10;
        int hunDigit = num / 100;
        System.out.println("个位数：" + singleDigit);
        System.out.println("十位数：" + tenDigit);
        System.out.println("个位数：" + hunDigit);


    }

    /**
     * 注意x++==2和++x==2
     * if语句请写出每题的输出结果
     */
    @Test
    public void Practice4Test() {
        int x = 1;
        int y = 1;
        if (x++ == 2 & ++y == 2) {
            x = 7;
        }
        System.out.println("x = " + x);//2
        System.out.println("y = " + y);//2

        int m = 1;
        int n = 1;
        if (m++ == 2 && ++n == 2) {
            m = 7;
        }
        System.out.println("m = " + m);//2
        System.out.println("n = " + n);//1

        int x1 = 1;
        int y1 = 1;
        if (x1++ == 2 | ++y1 == 2) {
            x1 = 7;
        }
        System.out.println("x1 = " + x1);//7
        System.out.println("y1 = " + y1);//2

        int m1 = 1;
        int n1 = 1;
        if (m1++ == 2 || ++n1 == 2) {
            m1 = 7;
        }
        System.out.println("m1 = " + m1);//7
        System.out.println("n1 = " + n1);//2


    }

    /**
     * 面试题自增自减输出结果
     */
    @Test
    public void Practice5Test() {
        boolean x = true;
        boolean y = false;
        short z = 42;
        //if(y == true)
        if ((z++ == 42) && (y = true)) z++;
        if ((x = false) || (++z == 45)) z++;

        System.out.println("z = " + z);//46


    }

    /**
     * 获取两个数中的较大数
     * 获取三个数中的较大数
     * 用到三元运算符
     * scanner要在main方法中用
     */
    @Test
    public void Practice6Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输出第一个数");
        int num1 = scanner.nextInt();
        System.out.println("请输出第二个数");
        int num2 = scanner.nextInt();
        System.out.println("请输出第三个数");
        int num3 = scanner.nextInt();
        int numMax = (num1 > num2) ? num1 : num2;
        numMax = (numMax > num3) ? numMax : num3;
        System.out.println("numMax = " + numMax);


    }

    /**
     * 语法相同合并case
     * 用switch把小写类型的char型转换为大写。只转换a,b,c,d,e.其他的类型为other
     */
    @Test
    public void Practice7Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个小写字母");
        char lowerChar = scanner.next().charAt(0);
        Boolean isFlag = true;
        char upperChar = '0';
        switch (lowerChar) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                lowerChar -= 32;
                upperChar = lowerChar;
                break;
            default:
                System.out.println("other");
                isFlag = false;
        }
        if (isFlag) {
            System.out.println(upperChar);
        }
    }

    /**
     * 根据用于指定月份，打印该月份所属的季节
     */
    @Test
    public void Practice8Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
        }


    }

    /**
     * 编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序输出输入的日期为2019年的第几天
     */
    @Test
    public void Practice9Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入号数");
        int day = scanner.nextInt();
        int days = 0;
        switch (month) {
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                days += 28;
            case 2:
                days += 31;
            case 1:
                days += day;
                break;

        }
        System.out.println("days = " + days);


    }
}