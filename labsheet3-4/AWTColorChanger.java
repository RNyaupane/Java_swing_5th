import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTColorChanger {

    Frame frame;
    Panel panel;
    Button redButton, greenButton, blueButton, closeButton;

    public AWTColorChanger() {
        frame = new Frame("Choose a color");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                System.exit(0);
            }
        });


        panel = new Panel();
        panel.setLayout(new FlowLayout());

        redButton = new Button("Red");
        redButton.addActionListener(new ColorActionListener(Color.red, panel));

        blueButton = new Button("Blue");
        blueButton.addActionListener(new ColorActionListener(Color.blue, panel));

        greenButton = new Button("Green");
        greenButton.addActionListener(new ColorActionListener(Color.green, panel));

        closeButton = new Button("Exit");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(redButton);
        panel.add(greenButton);
        panel.add(blueButton);
        panel.add(closeButton);

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new AWTColorChanger();
    }


}

class ColorActionListener implements ActionListener {

    Color bgColor;
    Panel panel;

    public ColorActionListener(Color bgColor, Panel panel) {
        this.bgColor = bgColor;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setBackground(bgColor);
    }
}
