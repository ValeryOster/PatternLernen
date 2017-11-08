package stedition.threads.ballbaunce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class BounceFrame extends JFrame {
    private BallComponent comp;
    public static final int STEP = 10000;
    public static final int DELAY = 3;

    public BounceFrame() {
        setTitle("Bounce");
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", event -> addBall());
        addButton(buttonPanel, "Close", event -> System.exit(0));
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    private void addButton(Container container, String title, ActionListener listener) {
        JButton button = new JButton(title);
        container.add(button);
        button.addActionListener(listener);
    }

    private void addBall() {

            Ball ball = new Ball();
            comp.add(ball);
            Runnable r = () ->{
                try {
                    for (int i = 1; i <= STEP; i++) {
                        ball.move(comp.getBounds());
                        comp.paint(comp.getGraphics());
                        Thread.sleep(DELAY);
                    }
                } catch (InterruptedException e) {

                }
            };
        Thread thread = new Thread(r);
        thread.start();

    }
}
