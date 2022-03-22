package GUI_Rahmen;

import javax.swing.*;
import java.awt.*;

public class GUI_Rahmen_03 extends javax.swing.JFrame{
    private JPanel PanelMain;

     private Font f1 = new Font("Comic Sans MS", Font.BOLD, 20);

    public GUI_Rahmen_03() {

    }
    public static void main(String[] args) {
        GUI_Rahmen_03 frame = new GUI_Rahmen_03();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600,500));
        frame.setContentPane(new GUI_Rahmen_03().PanelMain);
        frame.pack();
        frame.setVisible(true);

    }

    public void paint(Graphics g){

        super.paintComponents(g);

        g.setColor(Color.green);
        g.setFont(f1);
        g.drawString(" Milane :3 ", 50, 70);

        g.setColor(Color.red);
        g.drawString(".< Hier ist die Mitte!: ", 300, 270);
        g.fillOval(295, 265, 10, 10);

        g.setColor(Color.black);
        g.drawLine(10, 270, 600, 270); //x-Achse von x/y zu x2/y2
        g.drawLine(300, 40, 300, 500); //y-Achse
    }
}
