import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel() {
        setBackground(new Color(17, 38, 58));  // Achtergrond kleur
        setPreferredSize(new Dimension(200,200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.yellow);
        g.fillOval(0,0,getWidth(),getHeight());
        g.setColor(Color.green);
        g.fillRect(0,0,getWidth()/2, getHeight()/2);


    }



}
