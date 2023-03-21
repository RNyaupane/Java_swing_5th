import java.awt.*;
import java.awt.event.*;

class lab3Qn11  implements ActionListener {
    TextField t1,t2;
    lab3Qn11() {
        Frame f = new Frame("Prime");
        Label l1 = new Label("Number : ");
        l1.setBounds(100, 50, 60, 30);

        t1 = new TextField(20);
        t1.setBounds(180, 50, 60, 30);

        Label l2 = new Label("Prime ");
        l2.setBounds(100, 100, 60, 30);

        t2 = new TextField(20);
        t2.setBounds(180, 100, 60, 30);

        Button b = new Button("CHeck");
        b.setBounds(150, 150, 60, 30);
        b.addActionListener(this);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.setLayout(null);
        f.setSize(500, 400);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        String str1 = new String(t1.getText());
        int num = Integer.parseInt(str1);
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            t2.setText("Yes");
        else
            t2.setText("No");
    }

    public static void main(String[] args){
        new lab3Qn11();
    }
}