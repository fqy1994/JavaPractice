package com.fqy.com;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 14:32
 */
public class SalariedEmployee extends Employee{

    private  int monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int id, MyDate birthday, int monthlySalary) {
        super(name, id, birthday);
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int earnings() {
        return monthlySalary;

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySalary=" + monthlySalary +
                '}' +super.toString();
    }
}
