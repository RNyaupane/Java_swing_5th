import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTFactorialCalculator {
    public AWTFactorialCalculator() {

        Frame frame = new Frame("Factorial");
        frame.setLayout(new GridLayout(1, 5));

        Label numLabel = new Label("Number");
        frame.add(numLabel);

        TextField tf = new TextField();
        frame.add(tf);

        Label fact = new Label("Factorial");
        TextField ans = new TextField();

        Button calcBtn = new Button("Calculate");
        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int enteredNum = Integer.parseInt(tf.getText());
                int prod = 1;
                for(int i = enteredNum; i>0; --i) {
                    prod *= i;
                }
                ans.setText(prod + "");
            }
        });
        frame.add(calcBtn);
        frame.add(fact);
        frame.add(ans);
        frame.setSize(500, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTFactorialCalculator();
    }
}
