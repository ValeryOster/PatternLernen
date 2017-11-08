package patterns.structural.decorator;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Main {
    private Component window;

    public Main() {
        window = new ColorDecorator(new BorderDecorator(new Window()));
        window.draw();
    }

    public static void main(String[] args) {

        new Main();


    }
}
