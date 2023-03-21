import java.awt.*;  
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.event.*;

import javax.swing.plaf.ColorUIResource;  

public class lab3Qn10 extends Frame implements MouseListener{  
    Label l,l2,l3;  
    Button b1;
    lab3Qn10(){  
        addMouseListener(this);  
        
        l2=new Label("Mouse Listener");
        l2.setBounds(20,50,100,20);  

        b1= new Button("Welcome to mouse event demo");
        b1.setBounds(20,100,200,20);  
        Color c = new ColorUIResource(205, 51, 204);
        b1.setBackground(c);

        l3=new Label("Mouse Clicked :");  
        l3.setBounds(20,305,150,20);  

        add(l2); 
        add(b1); 
        add(l3);
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x = (int) b1.getY();
        int y = (int) b1.getY();
        // int x = (int) ((MouseEvent) b1).getClickCount();
        // int y = (int) ((MouseEvent) b1).getClickCount();
        String strx = String.valueOf(x);
        String stry = String.valueOf(y);
        l3.setText(strx +","+ stry );  

    }  
    public void mouseEntered(MouseEvent e) {  
        e.getPoint();
    }  
    public void mouseExited(MouseEvent e) {  
        // l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        // l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        // l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new lab3Qn10();  
}  
} 