package com.fqy.java;

import org.junit.Test;



/**
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 10:59
 */
public class PracticeTest {
    /**
     * super
     * 可用于访问父类中定义的属性
     * 调用父类中定义的成员方法
     * 在子类构造器中调用父类的构造器
     * 子类中所有的构造器默认访问父类中空参数的构造器
     * 子类的构造器必须通过this(参数列表)或者super(参数列表)语句指定
     * 必须放在构造器的首行
     * 通常情况下，我们习惯省略super.
     * 当子类和父类中定义了同名的属性时，必须显式的使用super.属性的方式
     * 当子类重写了父类中的方法以后
     * super的追溯不仅限于直接父类
     * 虽然创建子类对象时，调用了父类的构造器，但是自始至终就创建过一个对象
     */
    @Test
    public void kidsTest() {
        Kids someKid = new Kids(0, 0, 14);

        someKid.manOrWoman();
        someKid.printAge();
        someKid.employeed();


    }

    @Test
    public void CylinderTest() {
        Cylinder cylinder = new Cylinder();
        cylinder.setLength(3);
        cylinder.setRadius(3);
        System.out.println(cylinder.findVolume());
        System.out.println(cylinder.findArea());
        Circle circle = new Circle();
        circle.setRadius(4);
        System.out.println(circle.findArea());

        Cylinder cylinder1 = new Cylinder("red",32,3,4);
        Circle circle1 = new Circle("red",31,2);
        System.out.println("circle1 = " + circle1);
        System.out.println("cylinder1 = " + cylinder1);
    }

    /**
     * 工程应该指模块吧
     *   修饰符      类内部   同一个包    不同包的子类  同一个工程
     *   private      YES
     *   default      yes      yes
     *   protected    yes      yes           yes
     *   public       yes      yes           yes           yes
     */
    @Test
    public void InstanceTest() {
        Person person = new Person();
        Student student = new Student();
        Graduate graduate = new Graduate();
        method(person);
        method(student);
        method(graduate);


    }

    public void method(Person person) {
        if (person instanceof Graduate) {
            System.out.println("a graduated student");
        }
        if (person instanceof Student) {
            System.out.println("a student");
        }

        System.out.println("a person");

    }



    @Test
    public void displayGeometricObject() {
        Circle circle = new Circle();
        Circle circle1 = new Circle();
        circle.setRadius(2);
        circle1.setRadius(3);
        equalsArea(circle1,circle);

        double[] arr = {1.1, 3.4, 3.3};
        System.out.println("arr = " + arr);
    }
    public void equalsArea(GeometricObject go1,GeometricObject go2){
        if (go1.findArea() == go2.findArea()){
            System.out.println("面积相等");
        }else{
            System.out.println("面积不等");
        }
    }

    /**
     * 三元运算类型一致，不一致自动转换
     * 判断下列结果是什么
     */
    @Test
    public void Practice1Test() {


        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println("o1 = " + o1);

        Object o2;
        if (true){
            o2 = new Integer(1);
        }else{
            o2 = new Double(2.0);
        }
        System.out.println("o2 = " + o2);



    }
    /**
     * 面试题：
     * 判断下面的结果
     *
     * 自动装箱
     * 和println差不多
     * ==的引用类型比地址
     * Integer里定义了IntegerCache，都放在一个static，所以地址值是相等的
     */
    @Test
    public void Practice2Test() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        System.out.println( x == y );

    }


    /**
     * 多态的应用
     */
    @Test
    public void employeeTest() {
        Employee jane = new Manager("jane", 2, 23424, 23243);
        jane.work();

    }
}
