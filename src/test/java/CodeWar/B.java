package CodeWar;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
class A {
    int i = 0;
    public int increment() {
        return ++i;
    }
}

public class B extends A{
    int i = 2;

    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        A b = (A) new B();

        System.out.println(b.increment());
    }
}
