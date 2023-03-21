import java.awt.*;
import java.awt.event.*;

class lab3Qn12  implements ActionListener {
    TextField t1,t2;
    lab3Qn12() {
        Frame f = new Frame("Reverse");
        Label l1 = new Label("Number : ");
        t1 = new TextField(20);
        Label l2 = new Label("Reverse ");
        t2 = new TextField(20);
        Button b = new Button("CHeck");
        b.addActionListener(this);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(500, 400);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str1 = new String(t1.getText());
        int num = Integer.parseInt(str1);
        int rev = 0;
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
          }
          String str2 = String.valueOf(rev);
          t2.setText(str2);
    }
    public static void main(String[] args){
        new lab3Qn12();
    }
}