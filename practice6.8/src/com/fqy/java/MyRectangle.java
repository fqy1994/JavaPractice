package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 12:31
 */
public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return width*height;
    }
}
