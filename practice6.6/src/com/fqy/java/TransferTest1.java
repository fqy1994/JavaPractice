package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/6 23:28
 */
public class TransferTest1 {
    public static void main(String[] args) {
        TransferTest1 test = new TransferTest1();
        test.first();
    }
    public void first() {
        int i = 5;
        Value v = new Value();
        v.i =25;
        second(v,i);
        System.out.println(v.i);


    }
    public void second(Value v, int i){
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i);

    }
}
class Value{
    int i = 15;
}
