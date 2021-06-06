package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/6 23:17
 */
public class DataTest {
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
    public static void main(String[] args) {
        Data data = new Data();
        DataTest dataTest = new DataTest();
        data.m = 10;
        data.n = 20;
        dataTest.swap(data);
        System.out.println(data.m+"," + data.n);

    }

}

class Data{
    int m;
    int n;
}
