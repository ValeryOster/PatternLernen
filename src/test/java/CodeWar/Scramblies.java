package CodeWar;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Scramblies {
    public Scramblies() {

        System.out.println(search("scriptjavx","javascript"));
    }

    public boolean search(String a, String b) {

        for (char z : b.toCharArray()) {

            if (a.indexOf(z) < 0) {
                return false;
            }
            a = a.replaceFirst(Character.toString(z), "");
        }
        return true;
    }

    public static void main(String[] args) {
        new Scramblies();
    }
}
