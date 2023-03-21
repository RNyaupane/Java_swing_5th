import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class AWTCounter {

    int currentNum = 0;

    Label promptLabel;
    TextArea countArea;
    Button startButton;

    public AWTCounter() {

        Frame frame = new Frame("AWT Counter");
        frame.setLayout(new GridLayout(1, 1));
        Label l = new Label();
        Timer timer = new Timer();

        promptLabel = new Label("Enter an integer");
        countArea = new TextArea();
        startButton = new Button("Countdown");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNum = Integer.parseInt(countArea.getText());
                currentNum++;
                countArea.setText(currentNum + "");
            }
        });

        frame.add(promptLabel);
        frame.add(countArea);
        frame.add(startButton);
        frame.add(l);

        frame.setSize(300, 200);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new AWTCounter();
    }
}

