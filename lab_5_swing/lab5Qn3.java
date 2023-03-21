
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class lab5Qn3 implements ActionListener {
    JButton b1,b2,b3,b4;
    JLabel result,l1;
    public lab5Qn3(){
        JFrame jf = new JFrame("Guess The Answer");
        l1 = new JLabel("Who is the founder of java ?");
        l1.setBounds(200, 50, 160, 20);

        b1 = new JButton("Dennis Ritchie");
        b1.setBounds(200, 100, 100, 50);
        b2 = new JButton("James Gosling");
        b2.setBounds(300, 100, 100, 50);
        b3 = new JButton("Guido Van Rossum");
        b3.setBounds(200, 150, 100, 50);
        b4 = new JButton("Patrick Naughton");
        b4.setBounds(300, 150, 100, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        result =new JLabel("");
        result.setBounds(250, 250, 200, 50);

        jf.add(l1);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(result);
        
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            result.setText("you are incorrect");
        }
        if(e.getSource()==b2){
            result.setText("you are correct");
        }
        if(e.getSource()==b3){
            result.setText("you are incorrect");
        }
        if(e.getSource()==b4){
            result.setText("you are incorrect");
        }
    }
    public static void main(String[] args) {
        new lab5Qn3();
    }
    
}
