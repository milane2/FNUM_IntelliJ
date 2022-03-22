package GUI_Rahmen_12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Rahmen_12 extends JFrame {
    private JPanel PanelMain;
    private JButton buttonEnde;
    private JButton buttonZeichne;
    private JTextField textFieldax2;
    private JTextField TextFieldbx;
    private JTextField textFieldc;
    private JPanel ax2;
    private JLabel bx;
    private JLabel c;
    private MyFrame frame;

    public GUI_Rahmen_12(){

    }
    public GUI_Rahmen_12(MyFrame frame) {
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
        return PanelMain; }
}
