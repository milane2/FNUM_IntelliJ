package GUI_Rahmen;

import javax.swing.*;
import java.awt.*;

public class GUI_Rahmen_04_Milane extends JFrame {

    private Font f1 = new Font("Comic Sans MS", Font.BOLD, 20);
    private Font f2 = new Font("Tahoma", Font.BOLD, 12);
    private JPanel PanelMain;


    public GUI_Rahmen_04_Milane() {

    }

    public static void main(String[] args) {
        GUI_Rahmen_04_Milane frame = new GUI_Rahmen_04_Milane();
        frame.setContentPane(new GUI_Rahmen_04_Milane().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 500));
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {

        super.paintComponents(g);

        g.setColor(Color.green);
        g.setFont(f1);
        g.drawString(" Milane :3 ", 50, 70);
        // Mittelpunkt einkreisen
        g.setColor(Color.red);
        g.drawString(".< Hier ist die Mitte!: ", 300, 270);
        g.fillOval(295, 265, 10, 10);
        // Koordinatenkreuz zeichnen
        g.setColor(Color.black);
        g.drawLine(10, 270, 600, 270); //x-Achse von x/y zu x2/y2
        g.drawLine(300, 40, 300, 500); //y-Achse

        g.setFont(f2);
        g.drawString("x", 580, 290);
        //Bezeichnung
        for (int i = -5; i <= 5; i++) {
            String str = String.valueOf(i);
            if (i != 0) {
                g.drawString("|" + str, 298 + i * 50, 280);
            }
        }
        g.drawString("y", 290, 60);
        // Bezeichnung
        for (int i = 4; i >= -4; i--) {
            if (i != 0) {
                g.drawString("-" + i, 300, ((-i * 50) + 280));
            }
        }
        //g.setFont(fGraph);
        //        for (double x = -5; x <= 5; x = x + 0.001) {
        //            double y = x * x - 1;
        //            g.drawString(".", sizeX / 2 + (int) (x * sizeX / 12), sizeY / 2 + 20 - (int) (y * sizeX / 12));
        //        }
    }
}
