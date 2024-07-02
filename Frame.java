import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Storm-D&D");

        setLayout(new BorderLayout());
        Panel panel = new Panel();
        add(panel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);


    }

}
