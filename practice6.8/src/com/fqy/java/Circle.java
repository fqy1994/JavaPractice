package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 11:06
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;

    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return radius * radius * 3.14;
    }

    public boolean equals(Object obj) {
        Circle obj1 = (Circle) obj;
        if (radius == obj1.radius) {
            System.out.println("相等");
            return true;
        } else {
            System.out.println("不等");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
