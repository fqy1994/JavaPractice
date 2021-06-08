package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 11:09
 */
public class Cylinder extends Circle {

    private double length;

    public Cylinder() {
    }

    public Cylinder(String color, double weight, double radius, double length) {
        super(color, weight, radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return super.findArea()*length;
    }

    @Override
    public double findArea(){
        return 2*getRadius()*3.14;

    }


}
