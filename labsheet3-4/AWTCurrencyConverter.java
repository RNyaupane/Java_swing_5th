import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class AWTCurrencyConverter {

    public AWTCurrencyConverter() {
        Frame frame = new Frame("Currency Converter");
        frame.setLayout(new GridLayout(3,2));

        Label l1 = new Label("USD");
        Label l2 = new Label("NPR");
        Label l3 = new Label("EUR");

        TextField df = new TextField();
        TextField nf = new TextField();
        TextField ef = new TextField();


        df.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                double dollarVal = Double.parseDouble(df.getText());
                ef.setText(0.97 * dollarVal + "");
                nf.setText(129.57 * dollarVal + "");
            }
        });

        nf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                double nprVal = Double.parseDouble(nf.getText());
                ef.setText(nprVal * 0.0075 + "");
                df.setText(nprVal * 0.0077 + "");
            }
        });

        ef.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                double euroVal = Double.parseDouble(ef.getText());
                nf.setText(euroVal * 133.73 + "");
                df.setText(euroVal * 1.03 + "");
            }
        });




        frame.add(l1);
        frame.add(df);
        frame.add(l2);
        frame.add(nf);
        frame.add(l3);
        frame.add(ef);



        frame.setSize(600, 200);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new AWTCurrencyConverter();
    }

}
