import java.applet.*;

import java.awt.*;

/*

<applet code="GraphicsDemo.class" width=350 height=400>

</applet>

*/

public class test extends Applet{

public void paint(Graphics g){

//draw lines

g.drawLine(0,0,100,90);

g.drawLine(0,90,100,10);

g.drawLine(40,25,250,80);

//Draw Rectangles

g.drawRect(10,150,60,50);

g.fillRect(100,150,60,50);

g.drawRoundRect(190,150,60,50,15,15);

g.fillRoundRect(280,150,60,50,30,40);

//draw Ellipses and Circles

g.drawOval(10,250,50,50);

g.fillOval(90,250,75,50);

g.drawOval(190,260,100,40);

//Draw Arcs

g.drawArc(10,350,70,70,0,180);

g.fillArc(60,350,70,70,0,35);

}

}