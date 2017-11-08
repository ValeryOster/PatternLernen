package patterns.structural.adapter;

import java.util.List;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class PrinterAdapter implements PageListPrinter {

    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String text : list) {
            System.out.println(text);
        }
    }
}
