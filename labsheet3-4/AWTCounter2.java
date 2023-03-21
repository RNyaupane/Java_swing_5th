import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class AWTCounter2 {

    int currentNum = 0;

    Label promptLabel;
    TextArea countArea;
    Button upButton, downButton, resetButton;

    public AWTCounter2() {

        Frame frame = new Frame("AWT Count");
        frame.setLayout(new GridLayout(1, 1));

        promptLabel = new Label("Enter an integer");
        countArea = new TextArea();
        upButton = new Button("Up");
        downButton = new Button("Down");
        resetButton = new Button("Reset");

        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNum = Integer.parseInt(countArea.getText());
                currentNum++;
                countArea.setText(currentNum + "");
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNum = Integer.parseInt(countArea.getText());
                currentNum--;
                countArea.setText(currentNum + "");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNum = 0;
                countArea.setText(currentNum + "");
            }
        });

        frame.add(promptLabel);
        frame.add(countArea);
        frame.add(upButton);
        frame.add(downButton);
        frame.add(resetButton);

        frame.setSize(300, 200);
        frame.setVisible(true);

    }



    public static void main(String[] args) {
        new AWTCounter2();
    }
}

