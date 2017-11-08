package stedition.hash;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Player player1 = new Player();
        player.age = 23;
        player.name = "Georgij";
        player.weight = 74;
        player1.age = 13;
        player1.name = "öalsdifjGeorgij";
        player1.weight = 74;

        System.out.println(player.hashCode());
        System.out.println(player1.hashCode());
        System.out.println(player1.name.hashCode());

    }
}
