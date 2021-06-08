package com.fqy.com;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 了解类的加载器
 * properties配置文件的加载，用来读取配置文件
 * test单元的源路径再哪
 *          一个是src下
 *          一个是module下
 * @author fan_jennifer
 * @create 2021-06-2021/6/8 18:29
 */
public class ClassLoaderTest {
    @Test
    public void test() {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);

        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println("classLoader1 = " + classLoader1);

        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println("classLoader2 = " + classLoader2);

        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println("classLoader3 = " + classLoader3);
    }

    /**
     * 需要掌握
     * test再module路径下
     */
    @Test
    public void test1() throws IOException {

        Properties pos = new Properties();
        //读取配置文件方式一
        /*FileInputStream fis = new FileInputStream("jdbc.properties");
        pos.load(fis);*/

        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        pos.load(is);

        String user = pos.getProperty("user");
        String password = pos.getProperty("password");
        System.out.println("user : " + user);
        System.out.println("password : " + password);


    }
}
