package stedition.generics;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Pocket <T extends Number>{
    private T value;

    public Pocket() {
    }

    public Pocket(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public void empty() {
        value = null;
    }
}
