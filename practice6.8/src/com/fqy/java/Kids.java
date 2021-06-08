package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 10:58
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("岁数为：" + yearsOld);
    }

    @Override
    public void employeed(){
        super.employeed();
        System.out.println("kids shoud study and no job ");
    }

}
