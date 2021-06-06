package com.jane.java;

import org.junit.Test;

import java.util.Scanner;

import static java.lang.Math.random;
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
        int posNum = 0;
        int negNum = 0;
        while (true) {
            System.out.println("请输入一个数：");
            int num = scanner.nextInt();
            if (0 > num) {
                negNum++;
            } else if (0 < num) {
                posNum++;
            } else {
                break;
            }
        }
        System.out.println("负数个数为" + negNum);
        System.out.println("正数个数为" + posNum);


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

    /**
     * 从键盘输入年、月、日，判断这一天时当年的第几天
     */
    @Test
    public void Practice10Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入日期");
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
                if (0 == year % 400) {
                    days += 29;
                } else if ((0 == year % 4) && (0 != year % 100)) {
                    days += 29;
                } else {
                    days += 29;
                }
                ;
            case 2:
                days += 31;
            case 1:
                days += day;
                break;

        }
        System.out.println("days = " + days);


    }

    /**
     * 使用switch语句改写下列if语句
     */
    @Test
    public void Practice11Test() {
        int a = 3;
        int x = 100;
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            default:
                x += 34;
        }
        System.out.println("x = " + x);

    }

    /**
     * 编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级
     */
    @Test
    public void Practice13Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        int score = scanner.nextInt();

        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("等级：D");
                break;
            case 6:
                System.out.println("等级：C");
            case 7:
            case 8:
                System.out.println("等级：B");
            default:
                System.out.println("等级：A");
        }


    }

    /**
     * 编写一个程序，为一个给定的年份找出其对应的中国生肖。
     */
    @Test
    public void Practice12Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = scanner.nextInt();
        switch (year % 12) {
            case 0:
                System.out.println("猴年");
                break;
            case 1:
                System.out.println("鸡年");
                break;
            case 2:
                System.out.println("狗年");
                break;
            case 3:
                System.out.println("猪年");
                break;
            case 4:
                System.out.println("鼠年");
                break;
            case 5:
                System.out.println("牛年");
                break;
            case 6:
                System.out.println("虎年");
                break;
            case 7:
                System.out.println("兔年");
                break;
            case 8:
                System.out.println("龙年");
                break;
            case 9:
                System.out.println("蛇年");
                break;
            case 10:
                System.out.println("马年");
                break;
            default:
                System.out.println("羊年");


        }


    }

    /**
     * 编写程序1循环到150，并在每行打印一个值，另外在每个3的倍数行上打印出”foo“，在每个5的倍数行上打印”biz“，在每个7的倍数
     * 杭商打印baz
     */
    @Test
    public void Practice14Test() {
        for (int i = 1; i < 151; i++) {
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print(" foo");
            }
            if (i % 5 == 0) {
                System.out.print(" biz");
            }
            if (i % 7 == 0) {
                System.out.print(" baz");
            }
            System.out.println();

        }

    }

    /**
     * 输入两个正整数m和n，求其最大公约数和最小公倍数。
     */
    @Test
    public void Practice15Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = scanner.nextInt();
        int maxNum = (num1 > num2) ? num1 : num2;
        int minNum = (num1 < num2) ? num1 : num2;

        for (int i = minNum; i >= 1; i--) {
            if (0 == num1 % i && 0 == num2 % i) {
                System.out.println("最大公约数是：" + i);
                break;

            }

        }
        for (int i = maxNum; true; i++) {
            if (0 == i % num1 && 0 == i % num2) {
                System.out.println("最小公倍数是：" + i);
                break;
            }

        }


    }

    /**
     * 打印1~100间所有奇数和
     */
    @Test
    public void Practice16Test() {
        int num = 0;
        for (int i = 0; i < 101; i++) {
            if (1 == i % 2) {
                num += i;
            }
        }
        System.out.println("奇数和是：" + num);

    }

    /**
     * 打印1~100之间所有是7的倍数的整数的个数及总和
     */
    @Test
    public void Practice17Test() {
        int num = 0;
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (0 == i % 7) {
                num += i;
                count++;
            }

        }
        System.out.println("7的倍数的个数是：" + count);
        System.out.println("7的倍数的综合为 " + num);

    }

    /**
     * 从键盘读入个数不确定的整数，并判读读入的整数和负数的个数，输入为0时结束程序
     */
    @Test
    public void Practice18Test() {
        Scanner scanner = new Scanner(System.in);
        int posNum = 0;
        int negNum = 0;
        while (true) {
            System.out.println("请输入一个数：");
            int num = scanner.nextInt();
            if (0 > num) {
                negNum++;
            } else if (0 < num) {
                posNum++;
            } else {
                break;
            }
        }
        System.out.println("负数个数为" + negNum);
        System.out.println("正数个数为" + posNum);


    }

    /**
     * 九九乘法表
     */
    @Test
    public void Practice19Test() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();


        }


    }

    /**
     * 一百以内的所有质数
     */
    @Test
    public void Practice20Test() {
        System.out.println("一百以内的质数有：");

        for (int i = 1; i < 101; i++) {
            boolean isFlag = true;
            for (int j = 2; j < i; j++) {
                if (0 == i % j) {
                    isFlag = false;
                    break;
                }

            }
            if (isFlag) {
                System.out.print(i + " ");
            }

        }

    }

    /**
     * 结合\n,\t,空格等在控制台打印出如下图示的效果
     */
    @Test
    public void Practice21Test() {
        for (int i = 1; i <= 30; i++) {
            if (i == 3) {
                System.out.print("*");
            } else if (i == 27) {
                System.out.print("*");
            } else if (i == 30) {
                System.out.println();
            } else {
                System.out.print(" ");
            }

        }
        System.out.println("*    *   I Love Java   *    *");
        System.out.println("  *                       *  ");
        System.out.println("    *                   *  ");
        System.out.println("      *               *  ");
        System.out.println("        *           *  ");
        System.out.println("          *       *  ");
        System.out.println("            *   *  ");
        System.out.println("              *          ");


    }

    /**
     * 获取arr数组中所有元素的和
     * 二维数组的声明赋值和调用
     */
    @Test
    public void Practice22Test() {
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[0][2] = 8;
        arr[1] = new int[2];
        arr[1][0] = 12;
        arr[1][1] = 9;
        arr[2] = new int[4];
        arr[2][0] = 7;
        arr[2][1] = 0;
        arr[2][2] = 6;
        arr[2][3] = 4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }
        }
        System.out.println(sum);
    }

    /**
     * 声明：int[] x,y[];在给x，y变量赋值以后，以下选项允许通过编译的是：
     * x是一维数组
     * y是二维数组
     * int[] x   int x[]
     * int[][] y   int[] y[]   int y[][]
     */
    @Test
    public void Practice23Test() {
        /* x[0] = y;         no
           y[0] = x;           yes
           y[0][0] =x;         no
           x[0][0] =y;        no
           y[0][0] =x[0];      no
           x = y;             no  */

    }

    /**
     * 使用二维数组打印杨辉三角
     */
    @Test
    public void Practice24Test() {
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
            for (int j = 0; j < arr[i].length; j++) {
                if (0 == j | i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 定义一个int型的一维数组，包含10个元素，
     * 分别赋一些随机正数，然后求出所有元素的
     * 最大值，最小值，和值，平均值，并输出出来
     */
    @Test
    public void Practice25Test() {
        int[] arr = new int[10];
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(random()*90 + 10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]){
                maxNum = arr[i];
            }
        }
        System.out.println("最大的数：" + maxNum);


    }
    /**
     * 使用简单数组
     * 数组的声明赋值方式，同一个地址
     * 数组复制的方式，两个地址
     */
    @Test
    public void Practice26Test() {
        int arr1[];
        int arr2[];
        arr1 = new int[]{2,3,5,7,11,13,17,19};
        System.out.print("arr1数组：");
        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        arr2 = arr1;
        System.out.print("arr2数组：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            if (0==i%2){
                arr2[i] = i;
            }
        }
        System.out.println();
        System.out.println("修改arr2后：");
        System.out.print("arr2数组：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.print("arr1数组：");
        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i] + " ");
        }


    }

    /**
     * 数组的复制
     */
    @Test
    public void Practice27Test() {
        int arr1[];
        arr1 = new int[]{2,3,5,7,11,13,17,19};
        int arr2[] = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.print("arr1数组：");
        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("arr2数组：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            if (0==i%2){
                arr2[i] = i;
            }
        }
        System.out.println();
        System.out.println("修改arr2后：");
        System.out.print("arr2数组：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.print("arr1数组：");
        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i] + " ");
        }


    }

}

