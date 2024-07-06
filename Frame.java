import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame extends JFrame implements KeyListener {


    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

    public Frame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Storm-D&D");
        setLayout(new BorderLayout());

        Panel panel = new Panel();
        add(panel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);

        addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_F11) {
            if (gd.getFullScreenWindow() == null){
                if (gd.isFullScreenSupported()) {
                    gd.setFullScreenWindow(this);

                }
                else {
                    System.err.println("Full screen not supported");
                }
            } else {
                gd.setFullScreenWindow(null);
            }
        }
    }
}
