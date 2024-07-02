import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel() {
        setBackground(new Color(17, 38, 58));  // Achtergrond kleur
        setPreferredSize(new Dimension(100,100));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.black);
        g.fillRect(0,0,1000,100);
    }
}
