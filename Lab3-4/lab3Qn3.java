import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class lab3Qn3 extends JFrame implements ActionListener {
    
    JFrame frame;
    JButton red, green, blue, close;
    
    lab3Qn3() {
        
        frame = new JFrame("Colourful window");
        Color c = new Color(255, 255, 255);

        red = new JButton("RED");
        red.setBounds(40, 100, 100, 40);
        red.setBackground(c);
        
        green = new JButton("GREEN");
        green.setBounds(40, 150, 100, 40);
        green.setBackground(c);
        
        blue = new JButton("BLUE");
        blue.setBounds(40, 200, 100, 40);
        blue.setBackground(c);

        close = new JButton("Close");
        close.setBounds(40, 250, 100, 40);
        
        
        frame.add(red);
        frame.add(green);
        frame.add(blue);
        frame.add(close);
        
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        close.addActionListener(this);

        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setSize(650, 600);
        frame.setVisible(true);      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource() == red) 
            frame.getContentPane().setBackground(Color.RED);
        if(ae.getSource() == green)
            frame.getContentPane().setBackground(Color.GREEN);
        if(ae.getSource() == blue)
            frame.getContentPane().setBackground(Color.BLUE);  
        if(ae.getSource() == close)
            System.exit(0);  
    }
    
    public static void main(String[] args) {
        
        new lab3Qn3();
        
    }
    
}