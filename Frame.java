import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Panel panel = new Panel();

    public Frame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Storm-D&D");

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }


}
