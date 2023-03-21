
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class lab3Qn8 {
  
    public lab3Qn8()
    {
  

        JFrame f = new JFrame("Simple Interest");

        JLabel l1, l2,l3,resultLabel;
        JTextField t1, t2,t3;
        JButton b1, b3;
  

        l1 = new JLabel("ENter Principle:");
        l1.setBounds(100, 100, 90, 30);
        t1 = new JTextField("");
        t1.setBounds(200, 100, 90, 30);

        l2 = new JLabel("Enter Time in year:");
        l2.setBounds(100, 140, 90, 30);
        t2 = new JTextField("");
        t2.setBounds(200, 140, 90, 30);

        l3 = new JLabel("Enter Rate:");
        l3.setBounds(100, 180, 90, 30);
        t3 = new JTextField("");
        t3.setBounds(200, 180, 90, 30);
   

        b1 = new JButton("Calculate");
        b1.setBounds(100, 220, 100, 30);

        resultLabel =new JLabel("Result Goes here : ");
        resultLabel.setBounds(100, 260, 100, 30);

  
        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               
                double d= Double.parseDouble(t1.getText());
                double d1= Double.parseDouble(t2.getText());
                double d2= Double.parseDouble(t3.getText());
  
                double d4 = ((d*d1*d2)/100);
  

                String str1 = String.valueOf(d4);

                resultLabel.setText(str1);
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
        f.add(l3);
        f.add(t3);

        f.add(b1);
        f.add(resultLabel);
   
  
        f.setLayout(null);
        f.setSize(600, 600);
        f.setVisible(true);
    }
  
    // Driver code
    public static void main(String args[])
    {
        new lab3Qn8();
    }
}