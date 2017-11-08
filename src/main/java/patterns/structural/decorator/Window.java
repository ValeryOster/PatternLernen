package patterns.structural.decorator;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Window implements Component {
    @Override
    public void draw() {
        System.out.println("draw window");
    }
}
