package com.fqy.com;

/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 15:55
 */
public interface CompareObject {
    //若返回值是0，代表相等；若为正数，代表当前对象大；负数代表当前对象小
    int compareTo(Object o);
}
