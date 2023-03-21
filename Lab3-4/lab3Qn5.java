
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab3Qn5 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private Container con = getContentPane();
	JLabel prompt = new JLabel("Number 1");
	JLabel prompt2 = new JLabel("Number 2");
	JLabel result = new JLabel("Result");
    JTextField jtf = new JTextField(25);
	
	JTextField input = new JTextField(20);
	JTextField input2 = new JTextField(20);
	
	JButton add = new JButton("+");
	JButton subtract = new JButton("-");
	JButton multiply = new JButton("*");
	JButton divide = new JButton("/");

	
	public lab3Qn5(){
		
		setSize(300,300);
		con.setLayout(new FlowLayout());
	
		
		con.add(prompt);
		con.add(input);
		con.add(prompt2);
		con.add(input2);
		con.add(add);
		con.add(subtract);
		con.add(multiply);
		con.add(divide);
		con.add(result);
        con.add(jtf);
	
		
		//action listeners
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
	}
	
	public static void main(String[] args){
		
		lab3Qn5 demo = new lab3Qn5();
		demo.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		if(source == add)
		{
			String ans1 = input.getText();
			int num1 = Integer.parseInt(ans1);
			String ans2 = input2.getText();
			int num2 = Integer.parseInt(ans2);	
			
			int RESULT = num1 + num2;
			String res = new Integer(RESULT).toString();
			jtf.setText(res);
			
				
		}
		
		if(source == subtract)
		{
			String ans1 = input.getText();
			int num1 = Integer.parseInt(ans1);
			String ans2 = input2.getText();
			int num2 = Integer.parseInt(ans2);	
			
			int RESULT = num1 - num2;
			String res = new Integer(RESULT).toString();
			jtf.setText(res);	
		}
		
		if(source == multiply)
		{
			String ans1 = input.getText();
			int num1 = Integer.parseInt(ans1);
			String ans2 = input2.getText();
			int num2 = Integer.parseInt(ans2);	
			
			int RESULT = num1 * num2;
			String res = new Integer(RESULT).toString();
			jtf.setText(res);
		}
		
		if(source == divide)
		{
			String ans1 = input.getText();
			double num1 = Double.parseDouble(ans1);
			String ans2 = input2.getText();
			double num2 = Double.parseDouble(ans2);	
			
			Double RESULT = num1 / num2;
			String res = new Double(RESULT).toString();
			jtf.setText(res);		
		}
		
	}

}