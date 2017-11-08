package tests;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
class Box{
    protected int b, w;

     Box(int b, int w) {
        this.b = b;
        this.w = w;
    }
}

public class MyBox extends Box {

    MyBox() {
        super(10, 15);
        System.out.println(b + " " + w);
    }

    static public void main(String args[]) {
        MyBox myBox = new MyBox();
    }
}
