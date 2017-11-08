package stedition.Collections.list.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class main {
    public static void main(String[] args) {
        new main();
    }

    main() {
        List<String> list = new LinkedList<>();

        fill(list);
        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);
    }

    private void fill(List<String> list) {
        list.add("Anna");
        list.add("Katja");
        list.add("Elisabethe");
    }
}
