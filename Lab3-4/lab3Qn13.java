import java.awt.*;
import java.awt.event.*;

class lab3Qn13 extends Frame implements ActionListener {
    TextField t1,t2;
    Label l2;
    lab3Qn13() {
        Frame f = new Frame("Aramstong");
        Label l1 = new Label("Number : ");
        l1.setBounds(100, 50, 60, 30);

        t1 = new TextField(20);
        t1.setBounds(180, 50, 60, 30);

        l2 = new Label();
        l2.setBounds(400, 100, 60, 30);

        Button b = new Button("CHeck");
        b.setBounds(150, 150, 60, 30);
        b.addActionListener(this);

        f.add(l1);
        f.add(t1);
        
        f.add(b);
        f.add(l2);
        f.setLayout(null);
        f.setSize(500, 400);
        f.setVisible(true);

    }
    public static void main(String[] args){
        new lab3Qn13();
    }
    double re;
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        String str1 = new String(t1.getText());
        int num = Integer.parseInt(str1);
        int orginalNum= num,rem;
        
        while(orginalNum!=0){
            rem = orginalNum%10;
            re = re+Math.pow(rem,3);
            orginalNum /= 10;
        }
        if (re== num){
            l2.setText("Numbmer is an Armstrong");
        }
        else{
            l2.setText("Numbmer is not an Armstrong");
        }
    }
}