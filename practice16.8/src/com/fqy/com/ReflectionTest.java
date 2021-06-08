package com.fqy.com;

import org.junit.Test;

/**
 * 步骤
 *      获取类对象Class的实例
 *      调用类对象的构造器
 *      通过调用的构造器创建实例
 *      调用属性，并给通过调用的属性给通过调用的构造器创建的实例赋值
 *      调用方法，并对创建的实例使用调用的方法
 *      调用由返回值的方法
 *      调用private的结构，并使用赋值
 *      .setAccessiblie(true)
 *Class是反射的源头
 *
 * 构造器里的string。class?
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 17:50
 */
public class ReflectionTest {
    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        System.out.println("clazz = " + clazz);//输出person类的地址值、路径
        Person person = clazz.newInstance();

    }

}
