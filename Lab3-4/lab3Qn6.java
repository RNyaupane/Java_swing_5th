import java.awt.*;
import java.awt.event.*;

class lab3Qn6 extends Frame implements ActionListener
{
	TextField tf,tf1,r;
	Button b;
	Label n, l, Lresult, f;
	lab3Qn6()
	{  
        Frame fr = new Frame("Factorial");
		l = new Label("Number");
		r = new TextField(50);
        Lresult = new Label("Factorial");
		tf = new TextField(50);
		b = new Button("Calculate"); 
        f = new Label("factorial");
        tf1 = new TextField(50); 

		fr.add(l);
		fr.add(r);
        fr.add(Lresult);
		fr.add(tf);
		fr.add(b);
        fr.add(f);
        fr.add(tf1);

		fr.setSize(500,1000);
		fr.setLayout(new FlowLayout()); 
		fr.setVisible(true);

		b.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{  
            public void windowClosing(WindowEvent e)
            {  
                dispose();  
            }  
        });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			int num = Integer.parseInt(tf.getText());
			r.setText("Factorial of "+num+" is "+getFactorial(num));
		}
	}

	public int getFactorial(int x)
	{
		int rsl = 1;
		for(int i = x; i > 0; --i)
		{
			rsl *= i;
		}
		return(rsl);
	}

	public static void main(String[] args)
	{
		 new lab3Qn6();
	}
}