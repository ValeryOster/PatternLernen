package algorithmen.selectionsort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class SelectionMain {
    public SelectionMain(int anzahl) {
        List<Integer> list = IntStream.generate(() -> {
            return (int) (Math.random() * 100);
        }).limit(anzahl).boxed().collect(Collectors.toList());

//        for (Integer a : list) {
//            System.out.print(a + ", ");
//        }
//        System.out.println();

        long timeStart = System.currentTimeMillis();
        selectionSort(list);
        long timeEnd = System.currentTimeMillis();

        System.out.println("Selection Sort requires " + (timeEnd-timeStart));

    }

    private List<Integer> selectionSort(List<Integer> list) {

        int min, temp;
        for (int i = 0 ; i < list.size()-1; i++) {
            min=i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            temp = list.get(min);
            list.set(min, list.get(i));
            list.set(i, temp);

//            System.out.println();
//            for (Integer a : list) {
//                System.out.print(a + ", ");
//            }

        }

        return list;
    }

    public static void main(String[] args) {
        new SelectionMain(10);

    }
}
