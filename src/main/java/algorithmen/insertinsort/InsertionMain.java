package algorithmen.insertinsort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class InsertionMain {
    public InsertionMain(int zahl) {
        List<Integer> arrayList = IntStream.generate(() ->{
            return (int) (Math.random() * 100);
        }).limit(zahl).boxed().collect(Collectors.toList());
//        for (Integer x : arrayList) {
//            System.out.print(x + ", ");
//        }
//        System.out.println();
        long timeStart = System.currentTimeMillis();
        insertionSort(arrayList);
        long timeEnd = System.currentTimeMillis();

        System.out.println("Insertion Sort requires " + (timeEnd-timeStart));
    }

    private List<Integer> insertionSort(List<Integer> arrayList) {
        int key, i, temp;

        for (int j = 1; j < arrayList.size(); j++) {
            key = arrayList.get(j);
            i = j-1;
            while (i >= 0 && arrayList.get(i) > key) {
                temp = arrayList.get(i + 1);
                arrayList.set(i + 1, arrayList.get(i) );
                arrayList.set(i , temp);
                i=i-1;
            }
//            System.out.println("Interration " + j);
//            for (Integer x : arrayList) {
//                System.out.print(x + ", ");
//            }
//            System.out.println();
//            System.out.println();
        }

        return arrayList;
    }

    public static void main(String[] args) {

        new InsertionMain(30);
    }
}
