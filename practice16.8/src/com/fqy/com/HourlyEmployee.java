package com.fqy.com;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 14:57
 */
public class HourlyEmployee extends Employee  {
    private int wage;
    private int hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int id, MyDate birthday, int wage, int hour) {
        super(name, id, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public int earnings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + earnings() +
                '}' + super.toString();
    }
}
