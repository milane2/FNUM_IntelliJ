package GUI_Rahmen_12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Rahmen_12 extends JFrame {
    private JPanel PanelMain;
    private JButton buttonEnde;
    private JButton buttonZeichne;
    private JTextField textFieldax2;
    private JTextField textFieldbx;
    private JTextField textFieldc;
    private JLabel bx;
    private JLabel c;
    private JLabel ax2;
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
        return PanelMain;
    }

    private void validateAndPaint() {
        String strA = textFieldax2.getText();
        String strB = textFieldbx.getText();
        String strC = textFieldc.getText();
        try {
            if (strA.isEmpty() != true) {
                frame.setA(Double.parseDouble(textFieldax2.getText().replace(',', '.')));
            } if (strB.isEmpty() != true) {
                frame.setB(Double.parseDouble(textFieldbx.getText().replace(',', '.')));
            }
            if (strC.isEmpty() != true) {
                frame.setC(Double.parseDouble(textFieldc.getText().replace(',', '.')));}
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ungültige Eingabe", "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
        } frame.repaint();
    }
}
