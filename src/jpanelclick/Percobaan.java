package jpanelclick;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Percobaan {

    private JPanel panelMain;
    private JPanel panelKata;
    private JLabel txtLabel;
    private JPanel panelKlik;

    public Percobaan() {
        this.initComponent();
    }

    void initComponent() {
        panelKlik.setCursor(new Cursor(Cursor.HAND_CURSOR));

        panelKlik.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                txtLabel.setText("Halo");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                panelKlik.setBackground(new Color(120, 120, 120));
                panelKlik.revalidate();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                panelKlik.setBackground(new Color(150, 150, 150));
                panelKlik.revalidate();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                panelKlik.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                panelKlik.revalidate();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                panelKlik.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
                panelKlik.revalidate();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Percobaan");
        frame.setContentPane(new Percobaan().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
