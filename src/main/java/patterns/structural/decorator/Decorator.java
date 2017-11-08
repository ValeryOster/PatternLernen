package patterns.structural.decorator;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
