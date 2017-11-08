package patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("text 1");
        list.add("text 2");
        list.add("text 3");
        list.add("text 4");

        PrinterAdapter adapter = new PrinterAdapter();
        adapter.print(list);
    }
}
