import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panel extends JPanel {

    public Panel() {
        setBackground(new Color(17, 38, 58));  // Achtergrond kleur
        setPreferredSize(new Dimension(192,100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        double x = (double) getWidth() /192;
        double y = (double) getHeight() /100;

        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.yellow);
        g.fillOval(0,0,getWidth(),getHeight());
        g.setColor(Color.green);
        g.fillRect(0,0,getWidth()/2, getHeight()/2);
        g.fillRect((int) (96*x), (int) (50*y), (int) (96*x), (int) (50*y));


    }



}
