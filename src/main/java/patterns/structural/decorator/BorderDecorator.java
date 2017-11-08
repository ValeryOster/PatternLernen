package patterns.structural.decorator;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class BorderDecorator extends Decorator{

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("....added border");
    }
}
