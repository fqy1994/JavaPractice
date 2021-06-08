package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 13:59
 */
public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {

        System.out.println("manger is wroking");
    }
}
