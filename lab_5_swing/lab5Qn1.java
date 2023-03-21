import javax.swing.*;
import javax.swing.event.*;

public class lab5Qn1{
    public lab5Qn1(){
        JFrame jf = new JFrame("Icon Image Demo ");

        ImageIcon icon = new ImageIcon("javaLogo.png");

        JLabel l1 = new JLabel("Java Programming ");
        l1.setBounds(50, 10, 100, 30);

        JLabel l2 = new JLabel(icon);
        l2.setBounds(10, 40, 200, 200);

        JLabel l3 = new JLabel("Try it");
        l3.setBounds(50, 300, 80, 30);

        jf.add(l1);
        jf.add(l2);
        jf.add(l3);

        jf.setDefaultCloseOperation(1);
        jf.setLayout(null);
        jf.setSize(300,400);
        jf.setVisible(true);

    }
    public static void main(String[] args) {
        new lab5Qn1();
    }
}