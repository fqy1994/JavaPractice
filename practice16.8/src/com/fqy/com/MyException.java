package com.fqy.com;

/**
 * 自定义异常类
 * 常量值和构造器
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 17:38
 */
public class MyException extends RuntimeException{

    static final long serialVersionUID = -7034897430745766939L;

    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}
