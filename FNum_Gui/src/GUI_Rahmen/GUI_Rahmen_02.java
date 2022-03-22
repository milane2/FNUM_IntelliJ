package GUI_Rahmen;

import javax.swing.*;
import java.awt.*;

public class GUI_Rahmen_02 {
    private JPanel PanelMain;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rahmen_02");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      frame.setPreferredSize(new Dimension(600,500));
        frame.setContentPane(new GUI_Rahmen_02().PanelMain);
        frame.pack();
    }
    public GUI_Rahmen_02() {

    }
}
