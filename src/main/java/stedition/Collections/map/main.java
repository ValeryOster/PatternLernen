package stedition.Collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class main {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(1, "RED");
        hashMap.put(2, "GREEN");
        hashMap.put(3, "BLUE");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
