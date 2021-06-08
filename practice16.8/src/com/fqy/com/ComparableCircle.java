package com.fqy.com;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 16:37
 */
public class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle() {
    }

    public ComparableCircle(int radius) {
        super(radius);
    }

    @Override
    //若返回值是0，代表相等；若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        } else if (o instanceof ComparableCircle) {
            ComparableCircle o1 = (ComparableCircle) o;
            return this.getRadius() - o1.getRadius();
        }else{
            throw new RuntimeException("传入的数据类型不匹配");
        }
    }
}
