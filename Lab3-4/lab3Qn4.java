import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab3Qn4 implements ActionListener{
    TextField t1;
    Label l;
    public lab3Qn4(){
        Frame frame=new Frame("TextField");
       
        t1=new TextField(15);
        t1.setBounds(100, 50, 80, 30);
       
        Button b1=new Button("Submit");
        b1.setBounds(100, 100, 80, 30);
        b1.addActionListener(this);

        l = new Label();
       
        frame.add(t1);
        frame.add(b1);
        frame.add(l);
       
        frame.setLayout(null);
        frame.setSize(650, 600);
        frame.setVisible(true);      
      
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String str1 = new String();
        str1=t1.getText();
        l.setText(str1);
    }

    public static void main(String[] args) {
        new lab3Qn4();
    }
}
    