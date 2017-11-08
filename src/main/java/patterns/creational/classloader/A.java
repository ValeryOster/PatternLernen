package patterns.creational.classloader;

import java.util.Date;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class A {
    static String s = new Date().toString();

    public static void main(String[] args) {
        B b = new B();

        System.out.println(System.getProperty("os.name"));
        System.getProperties().list(System.out);
    }
}

class B {
    A a;
}