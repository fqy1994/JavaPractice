package com.fqy.java;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/7 21:15
 */
public class PassObject {
    public void printAreas(Circle c, int time) {
        System.out.println("Raidus              Area");
        for (int i = 1; i < time + 1; i++) {
                c.radius = i;
            if(i>=1 && i <10) {
                System.out.println(i + "                   " + c.findArea());
            }else {
                System.out.println(i + "                  " + c.findArea());
            }
        }
    }
}
