import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTCalculator {

    public AWTCalculator() {

        Frame frame = new Frame("Calculator");




        frame.setLayout(new GridLayout(2,1));
        Panel mainPanel = new Panel(new GridLayout(3,2));
        Panel buttonPanel = new Panel(new GridLayout(1,4));

        Label n1 = new Label("Number 1");
        Label n2 = new Label("Number 2");
        Label n3 = new Label("Result");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();

        mainPanel.add(n1);
        mainPanel.add(t1);
        mainPanel.add(n2);
        mainPanel.add(t2);
        mainPanel.add(n3);
        mainPanel.add(t3);

        Button addBtn = new Button("+");
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t3.setText(Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText()) + "");
            }
        });

        Button subBtn = new Button("-");
        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t3.setText(Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText()) + "");
            }
        });

        Button mulBtn = new Button("*");
        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t3.setText(Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText()) + "");
            }
        });


        Button divBtn = new Button("/");
        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t3.setText(Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText()) + "");
            }
        });

        buttonPanel.add(addBtn);
        buttonPanel.add(subBtn);
        buttonPanel.add(mulBtn);
        buttonPanel.add(divBtn);

        frame.add(mainPanel);
        frame.add(buttonPanel);
        frame.setSize(600, 200);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new AWTCalculator();
    }
}
