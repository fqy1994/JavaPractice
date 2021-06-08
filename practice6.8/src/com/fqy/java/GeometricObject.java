package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 12:24
 */
public class GeometricObject {
    String color;
    double weight;

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0;
    }



}
