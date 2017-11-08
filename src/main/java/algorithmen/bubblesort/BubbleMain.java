package algorithmen.bubblesort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class BubbleMain {
    public static void main(String[] args) {
        new BubbleMain(30);
    }

    public BubbleMain(int anzahl) {
        List<Integer> integers = IntStream.generate(() -> {
            return (int) (Math.random() * 100);
        }).limit(anzahl).boxed().collect(Collectors.toList());

//        for (Integer i : integers) {
//            System.out.print(i+", ");
//        }

        System.out.println();
        final long timeStart = System.currentTimeMillis();
        bubbleSort(integers);
        final long timeEnd = System.currentTimeMillis();

        System.out.println("Bubble Sort requires " + (timeEnd-timeStart));
    }

    public void bubbleSort(List<Integer> array) {
        Integer temp;
        for (int i = 1; i < array.size(); i++) {
            for (int j = 0; j < array.size() -1; j++) {
                if (array.get(j) > array.get(j+1)) {
                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);

                }
            }
        }
    }

}
