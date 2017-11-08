package stedition.threads.ballbaunce;

import javax.swing.*;
import java.awt.*;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Bounce {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            JFrame frame = new BounceFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });

    }
}
