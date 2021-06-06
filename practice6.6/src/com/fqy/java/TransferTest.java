package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/6 23:06
 */
public class TransferTest {
    public void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap方法里，a的值是" + a + ";变量b的值是" + b);
    }

    public static void main(String[] args) {
        TransferTest test = new TransferTest();
        int a = 5;
        int b = 10;
        test.swap(a,b);
        System.out.println("交换结束后，变量a的值时" + a + ";变量b的值是" + b);

        }
}
