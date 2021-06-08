package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 10:55
 */
public class ManKind {
    private  int sex;
    private  int salary;

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void manOrWoman(){
        if(1 == sex){
            System.out.println("是男人");
        }else if(0 == sex){
            System.out.println("是女人");
        }else{
            System.out.println("变性人");
        }
    }

    public void employeed(){
        System.out.println("man shoud make money");
    }
}
