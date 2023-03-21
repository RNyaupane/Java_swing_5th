import java.applet.*;
import java.awt.Graphics;

/**
 * <applet code="SimpleApplet.class" width="200" height="300"></applet>
 */

public class SimpleApplet extends Applet {
    // public lab5Qn1(){
    public void paint(Graphics g)
    {
      g.drawString("Hello World!",20,20);
    }

}