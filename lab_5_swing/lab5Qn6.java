
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab5Qn6 implements ActionListener {
    JFrame jf;
    JLabel l1, l2;
    JRadioButton jb1, jb2, jb3, jb4;
    JButton btn;
    ButtonGroup bg;

    public lab5Qn6() {
        jf = new JFrame("QN6");

        l1 = new JLabel("Choose Your Payment");
        l1.setBounds(100, 50, 180, 30);

        jb1 = new JRadioButton("Credit Card");
        jb1.setBounds(10, 100, 150, 30);
        jb1.addActionListener(this);

        jb2 = new JRadioButton("Wallet");
        jb2.setBounds(160, 100, 150, 30);
        jb2.addActionListener(this);

        jb3 = new JRadioButton("Bank Transfer");
        jb3.setBounds(10, 140, 150, 30);
        jb3.addActionListener(this);

        jb4 = new JRadioButton("Cash on Delivery");
        jb4.setBounds(160, 140, 150, 30);
        jb4.addActionListener(this);

        btn = new JButton("ok");
        btn.setBounds(10, 180, 80, 40);
        btn.addActionListener(this);

        l2 = new JLabel("Result");
        l2.setBounds(100, 240, 200, 20);

        bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);
        bg.add(jb4);

        jf.add(l1);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(btn);
        jf.add(l2);

        jf.setLayout(null);
        jf.setSize(300, 300);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jb1) {
                l2.setText("You have selected Credit wallet");
            }
            if (e.getSource() == jb2) {
                l2.setText("You have selected Wallet");
            }
            if (e.getSource() == jb3) {
                l2.setText("You have selected bank transfer");
            }
            if (e.getSource() == jb4) {
                l2.setText("You have selected Cash on Delivery");
            }
        }

    public static void main(String[] args) {
        new lab5Qn6();
    }

}
