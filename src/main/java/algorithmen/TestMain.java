package algorithmen;

import algorithmen.mergesort.MergeMain;
import algorithmen.quicksort.QuickMain;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        int anzahl = 300000;
//        new BubbleMain(anzahl);
//        new InsertionMain(anzahl);
//        new SelectionMain(anzahl);
        new QuickMain(anzahl);
        new MergeMain(anzahl);
    }
}
