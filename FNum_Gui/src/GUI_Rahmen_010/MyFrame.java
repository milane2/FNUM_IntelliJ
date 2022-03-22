package GUI_Rahmen_010;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private int sizeX;
    private int sizeY;
    private Font f1 = new Font("Comic Sans MS", Font.BOLD, 20);
    private Font f2 = new Font("Tahoma", Font.BOLD, 12);
    private Font fGraph = new Font("New Times Roman", Font.PLAIN, 5);
    private boolean jButtenZeichneIsSelected = false;

    public MyFrame() {
        setContentPane(new GUI_Rahmen_10(this).getPanelMain());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Funktionszeichner");
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        GUI_Rahmen_10 frame = new GUI_Rahmen_10();
        frame.setContentPane(new GUI_Rahmen_10());
        frame.setPreferredSize(new Dimension(600, 550));
        frame.setVisible(true);

    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        paint(g);
    }

    public void setjButtenZeichnenIsSelected(boolean jButtenZeichneIsSelected) {
        this.jButtenZeichneIsSelected = jButtenZeichneIsSelected;
    }
    public void paint(Graphics g) {
        sizeX = this.getWidth();
        sizeY = this.getHeight();
        super.paintComponents(g);

        g.setColor(Color.green);
        g.setFont(f1);
        g.drawString(" Milane :3 ", 50, 70);
        // Mittelpunkt einkreisen
        g.setColor(Color.red);
        g.drawString(".< Hier ist die Mitte!: ", 300, 270);
        g.fillOval(295, 265, 10, 10);
        // Koordinatenkreuz zeichnen
        g.setColor(Color.black); g.drawLine(10, sizeY / 2 + 20, sizeX, sizeY / 2 + 20);
        // x-Achse: Warum nicht sizeY/2
        g.drawLine(sizeX / 2, 40, sizeX / 2, sizeY);
        //y-Achse
        // Beschriftung der Achsen

        g.setFont(f2); g.drawString("x", sizeX - 20, sizeY / 2 + 20);
        for (int i = -10; i <= 10; i++) {
            if (i != 0) {
                // sizeX/12 = 50 ==> alle 50 Pixel


                g.drawString("|" + i, sizeX / 2 + i * sizeX / 12, sizeY / 2 + 10 + 20);
            }
        }
        g.drawString("y", sizeX / 2 + 15, 50);
        //Bezeichnung
        for (int i = 10; i >= -10; i--) {
            if (i != 0) {
                // sizeX/12 = 50 ==> alle 50 Pixel
                g.drawString("-" +i, sizeX/2,((-i*sizeX/12)+ sizeY/2+20));
            }
        }
        g.setFont(fGraph);
        for (double x = -5; x <= 5; x = x + 0.001) {
            double y = x * x - 1;
            g.drawString(".", sizeX / 2 + (int) (x * sizeX / 12), sizeY / 2 + 20 - (int) (y * sizeX / 12));
        }
        if (jButtenZeichneIsSelected) {
            g.setFont(fGraph);
            for (double x = -5; x <= 5; x = x + 0.001) {
                double y = x * x - 1;
                g.drawString(".", sizeX / 2 + (int) (x * sizeX / 12), sizeY / 2 + 20 - (int) (y * sizeX / 12));
            }
        }
    }
}
