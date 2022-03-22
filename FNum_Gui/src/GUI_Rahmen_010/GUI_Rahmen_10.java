package GUI_Rahmen_010;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Rahmen_10 extends  JFrame{

public GUI_Rahmen_10(){

}

    private JPanel panelMain;
    private JButton buttonZeichne;
    private JButton buttonEnde;
    private MyFrame frame;

    public GUI_Rahmen_10(MyFrame frame) {
        buttonZeichne.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
            frame.setjButtenZeichnenIsSelected(true);
            frame.repaint(); }
        });
        buttonEnde.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }





    public JPanel getPanelMain() {
        return panelMain; }

    //private Font f1 = new Font("Comic Sans MS", Font.BOLD, 20);
    //    private Font f2 = new Font("Tahoma", Font.BOLD, 12);
    //    private int sizeX;
    //    private int sizeY;
    //    public JPanel Panelmain;
    //    private JButton buttonZeichne;
    //    private JButton buttonEnde;
    //
    //    public GUI_Rahmen_10() {
    //
    //    }
    //
    //    public static void main(String[] args) {
    //        GUI_Rahmen_10 frame = new GUI_Rahmen_10();
    //        frame.setContentPane(new GUI_Rahmen_10().Panelmain);
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        frame.setPreferredSize(new Dimension(600, 550));
    //        frame.pack();
    //        frame.setVisible(true);
    //    }
    //    public void paint(Graphics g) {
    //        sizeX = this.getWidth();
    //        sizeY = this.getHeight();
    //        super.paintComponents(g);
    //
    //        g.setColor(Color.green);
    //        g.setFont(f1);
    //        g.drawString(" Milane :3 ", 50, 70);
    //
    //        g.setColor(Color.red);
    //        g.drawString(".< Hier ist die Mitte!: ", 300, 270);
    //        g.fillOval(295, 265, 10, 10);
    //
    //        g.setColor(Color.black); g.drawLine(10, sizeY / 2 + 20, sizeX, sizeY / 2 + 20);
    //        g.drawLine(sizeX / 2, 40, sizeX / 2, sizeY);
    //        g.setFont(f2); g.drawString("x", sizeX - 20, sizeY / 2 + 20);
    //        for (int i = -10; i <= 10; i++) {
    //            if (i != 0) {
    //
    //                g.drawString("|" + i, sizeX / 2 + i * sizeX / 12, sizeY / 2 + 10 + 20);
    //            }
    //        }
    //        g.drawString("y", sizeX / 2 + 15, 50);
    //        for (int i = 10; i >= -10; i--) {
    //            if (i != 0) {
    //
    //                g.drawString("-" +i, sizeX/2,((-i*sizeX/12)+ sizeY/2+20));
    //            }
    //        }
    //
    //    }
}
