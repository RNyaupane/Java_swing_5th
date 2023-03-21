
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class lab5Qn4 implements ActionListener {
    JButton b1,b2;
    ImageIcon icon1 = new ImageIcon("onBulb1.jpg");
    Image image = icon1.getImage();
    Image newimg1 = image.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH);
    ImageIcon icon3 = new ImageIcon(newimg1);

    ImageIcon icon2 = new ImageIcon("offBulb1.jpeg");
    Image image2= icon2.getImage();
    Image newimg2 = image2.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH);
    ImageIcon icon4 = new ImageIcon(newimg2);
    JLabel l1,l2;
    public lab5Qn4(){
        JFrame jf = new JFrame("BULB");

        b1 = new JButton("off");
        b1.setBounds(250, 100, 100, 20);
        b2 = new JButton("on");
        b2.setBounds(750, 100, 100, 20);
        b1.addActionListener(this);
        b2.addActionListener(this);

        l1= new JLabel(icon3);
        l1.setBounds(10, 170, 500, 500);

        l2= new JLabel(icon4);
        l2.setBounds(530, 170, 500, 500);

        jf.add(b1);
        jf.add(b2);
        jf.add(l1);
        jf.add(l2);

        
        jf.setSize(1050,700);
        // jf.setLayout(new GridLayout(2,2));
        jf.setLayout(null);
        jf.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
       if(e.getSource()==b1){
            l1.setIcon(icon2);
       }
       if(e.getSource()==b2){
            l2.setIcon(icon1);
       }
    }
    public static void main(String[] args) {
        new lab5Qn4();
    }
    
}
