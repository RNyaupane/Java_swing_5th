import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Lab5Qn2 implements ActionListener{

    JTextField t1,t2;
    JLabel l1,l2,l3,result;
    public Lab5Qn2(){
        JFrame jf = new JFrame("Largest ");
        JPanel panel = new JPanel();

        l1 = new JLabel("Find The Largest One ");

        l2 = new JLabel("first number");

        l3 = new JLabel("second number");

        t1 = new JTextField(50);
        t2 = new JTextField(50);

        JButton b = new JButton("Check");
        b.addActionListener(this);

        result = new JLabel("");

        panel.add(l2);
        panel.add(t1);
        panel.add(l3);
        panel.add(t2);
        panel.add(b);
        panel.add(result);
        jf.add(l1);
        jf.add(panel);
        
        

        jf.setDefaultCloseOperation(1);
        panel.setLayout(new GridLayout(4,2));
        jf.setSize(500,500);
        jf.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String str1 = new String(t1.getText());
        String str2 = new String(t2.getText());
        int n1=Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);

        if(n1>n2){
            result.setText(str1+"is the Largest");
        }
        else{
            result.setText(str2 + "is the Largest");
        }
    }

    public static void main(String[] args) {
        new Lab5Qn2();
    }
}