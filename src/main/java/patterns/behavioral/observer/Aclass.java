package patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Aclass implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("Observabel " + ((Amount)o).getClass().getName() + " object - " + ((Amount) o).getAmount());
    }
}
