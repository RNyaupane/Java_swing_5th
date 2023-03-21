
import java.awt.*;

class lab3Qn1{
	public lab3Qn1(){
		Frame jf = new Frame("Label Demo");

		Label l1= new Label("Enter an integer");
		l1.setBounds(100, 50, 100, 20);
		Label l2 = new Label();

		TextField t1=new TextField(70);
		t1.setBounds(100, 100, 100, 20);

        Button b2=new Button("Count Down");
        b2.setBounds(200, 150, 80, 30);

		jf.setLayout(null);

		jf.add(l1);
		jf.add(t1);
		jf.add(b2);
		jf.add(l2);

		jf.setSize(900, 500);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);

	}
	public static void main(String[] args){
		new lab3Qn1(); 
	}
} 
