package com.fqy.com;

import org.junit.Test;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 15:00
 */
public class PracticeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前月份：");
        int month = scanner.nextInt();

        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("jane",1,new MyDate(1994,5,4),1234);
        employees[1] = new HourlyEmployee("jay",2,new MyDate(1984,3,2),35,80);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            if (month == employees[i].getBirthday().getMonth()){
                System.out.println(" 生日快乐奖励100" );
            }

        }

    }

    /**
     * 对象数组的应用
     * 多态的体现
     * 父类抽象
     * calendar的使用
     */
    @Test
    public void PayrollSystem() {
        Calendar instance = Calendar.getInstance();
        int month = instance.get(Calendar.MONTH);
        System.out.println("month = " + month);


        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("jane",1,new MyDate(1994,6,4),1234);
        employees[1] = new HourlyEmployee("jay",2,new MyDate(1984,3,2),35,80);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            if (month +1  == employees[i].getBirthday().getMonth()){
                System.out.println(" 生日快乐奖励100" );
            }

        }





    }

    /**
     * 接口练习
     * public abstract、public abstract可以省略
     * throw 代替return
     */
    @Test
    public void comparableCircleTest() {

        ComparableCircle c1 = new ComparableCircle(1);
        ComparableCircle c2 = new ComparableCircle(4);

        int compareValue = c1.compareTo(c2);
        if (compareValue>0){
            System.out.println("c1大"+compareValue+"cm");
        }else if (compareValue==0){
            System.out.println("一样大");
        }else{
            System.out.println("c2大" + (-compareValue)+"cm");
        }


    }
}
