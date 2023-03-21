import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class lab5Qn7 extends JFrame{
    JFrame jf;
    JLabel l1,l2;
    JTextArea jta;
    JButton btn;
    JCheckBox jcb1,jcb2,jcb3,jcb4;
    JPanel p1,p2,p3;
    Container c1;
    public lab5Qn7(){
        jf = new JFrame("JTabbedPane Example");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane jtp = new JTabbedPane();
        jtp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        jtp.setBounds(3,3,400,300);

        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();

        l1 = new JLabel("Welcome to IOC");
        l1.setBounds(1,0,100,20);
        // c1=getContentPane();
        p1.setLayout(null);
        p1.add(l1);

        jcb1 = new JCheckBox("C");
        jcb2= new JCheckBox("C++");
        jcb3 = new JCheckBox("Java");
        jcb4 = new JCheckBox("PHP");
        btn = new JButton("submit");
        p2.add(jcb1);
        p2.add(jcb2);
        p2.add(jcb3);
        p2.add(jcb4);
        p2.add(btn);
        p2.setLayout(new GridLayout(4,1));
        
        l2 = new JLabel("Leave a COmment");
        l2.setBounds(10,20,150,30);
        jta = new JTextArea("");
        jta.setBounds(10,40,200,200);
        p3.add(l2);
        p3.add(jta);
        p3.setLayout(new GridLayout(2,1));

        jtp.addTab("Dashboard", p1);
        jtp.addTab("Courses", p2);
        jtp.addTab("Comment", p3);

        jf.add(jtp, BorderLayout.CENTER);
        jf.setSize(450, 350);
        jf.setLayout(null);
        jf.setVisible(true);

    }
    public static void main(String[] args) {
        new lab5Qn7();
    }
}
