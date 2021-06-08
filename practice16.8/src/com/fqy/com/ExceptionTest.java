package com.fqy.com;

/**
 * throw的用法：
 *          方法内
 *          用exception还是RuntimeException
 *          可以代替return
 *          只有异常体系才能throw
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 17:28
 */
public class ExceptionTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.regist(-6);
        System.out.println(s);
    }

}

class Student{
    private int id;

    public void regist(int id){
        if (id > 0){
            this.id = id;
        }else{
            throw new MyException("请输入大于0的数据");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
