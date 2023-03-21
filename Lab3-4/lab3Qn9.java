import java.awt.*;    
import java.awt.event.*;    
  
public class lab3Qn9 extends Frame implements KeyListener {    

 Label l;    
    TextArea area;   
    
    TextField t1;

lab3Qn9() {    
  
        l = new Label("ENter Text : ");    

        l.setBounds (20, 50, 100, 20);    

        t1 = new TextField();    

        t1.setBounds (20, 80, 300, 30);    

        t1.addKeyListener(this);  

        add(l);  
        add(t1);    

        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    

    public void keyPressed (KeyEvent e) {    
        // String str =new String(t1.getText());
        // l.setText (str);    
    }    
    @Override
    public void keyTyped(KeyEvent e) { 
        // String str =new String(t1.getText());
        // l.setText (str);  
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String str =new String(t1.getText());
        l.setText (str); 
    } 

    public static void main(String[] args) {    
        new lab3Qn9();    
    }

       

}
