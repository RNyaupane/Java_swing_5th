import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class test extends Applet implements ActionListener {

    private static final long serialVersionUID = 1L;
    private TextField field_a, field_b;
    private Label label_sum;
    private Button button;

    @Override
    public void init() {
        field_a = new TextField(4);
        field_b = new TextField(4);
        label_sum = new Label();
        button = new Button("Process");
        setLayout(new BorderLayout());
        Panel panel, subpanel;
        panel = new Panel(new BorderLayout());
        subpanel = new Panel(new GridLayout(2, 1));
        subpanel.add(new Label("Enter the value of a:"));
        subpanel.add(new Label("Enter the value of b:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new Panel(new GridLayout(2, 1));
        subpanel.add(field_a);
        subpanel.add(field_b);
        panel.add(subpanel);
        add(panel, BorderLayout.NORTH);
        panel = new Panel(new FlowLayout());
        panel.add(button);
        add(panel);
        panel = new Panel(new BorderLayout());
        subpanel = new Panel(new GridLayout(1, 1));
        subpanel.add(new Label("Value of sum:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new Panel(new GridLayout(1, 1));
        subpanel.add(label_sum);
        panel.add(subpanel);
        add(panel, BorderLayout.SOUTH);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        double a, b, sum;
        try {
            a = Double.parseDouble(field_a.getText());
            b = Double.parseDouble(field_b.getText());
        } catch (NumberFormatException numberFormatException) {
            return;
        }
        sum=a+b;
        label_sum.setText(String.valueOf(sum));
    }
    public static void main(String[] args) {
        new test();
    }

}
