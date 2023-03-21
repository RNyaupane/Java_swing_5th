
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class lab3Qn7 {
  
    public lab3Qn7()
    {
  

        JFrame f = new JFrame("Currency converter");

        JLabel l1, l2;
        JTextField t1, t2;
        JButton b1, b3;
  

        l1 = new JLabel("Dollar:");
        l1.setBounds(100, 100, 90, 30);
        t1 = new JTextField("0");
        t1.setBounds(200, 100, 90, 30);

        l2 = new JLabel("Neplease:");
        l2.setBounds(100, 140, 90, 30);
        t2 = new JTextField("0");
        t2.setBounds(200, 140, 90, 30);
   

        b1 = new JButton("Convert");
        b1.setBounds(100, 180, 90, 30);
        b3 = new JButton("close");
        b3.setBounds(100, 180, 90, 30);
  
        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               
                double d= Double.parseDouble(t1.getText());
  
                double d1 = (d*127);
  

                String str1 = String.valueOf(d1);

                t2.setText(str1);
            }
        });
  
    
  
        // Action listener to close the form
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        // Adding the created objects
        // to the form
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b3);
  
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }
  
    // Driver code
    public static void main(String args[])
    {
        new lab3Qn7();
    }
}