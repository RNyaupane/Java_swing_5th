import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTPrinter {

    Frame frame;
    Label textLabel;
    Button submit;
    TextField mainField;

    public AWTPrinter() {
        frame = new Frame("");
        textLabel = new Label("");
        submit = new Button("Submit");
        mainField = new TextField();
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setText(mainField.getText());
            }
        });

        frame.setLayout(new GridLayout(1, 3));
        frame.add(mainField);
        frame.add(submit);
        frame.add(textLabel);

        frame.setSize(500, 300);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new AWTPrinter();
    }
}
