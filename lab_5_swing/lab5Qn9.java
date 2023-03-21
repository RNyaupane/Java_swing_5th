import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
 
public class lab5Qn9 extends JFrame implements ActionListener{
 
    JLabel message;
    JLabel nameLabel, genderLabel;
    JTextField nameField;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;
 
    JLabel addLabel, mobileNoLabel,mailLabel;
    JTextField addField, mobileNoField,mailField;
 
    JLabel programLabel;
    JComboBox<String> programList;
 
    JButton add,reset,cancel;
    Container container;

    JOptionPane pane;
 
    public lab5Qn9() {
        message = new JLabel("Student Info Form");
        message.setFont(new Font("Courier", Font.BOLD, 20));
        nameLabel = new JLabel("Name: ");
        nameField = new JTextField();
 
        addLabel = new JLabel("Address: ");
        addField = new JTextField();
 
        genderLabel = new JLabel("Gender: ");
        genderMale = new JRadioButton("Male", true);
        genderFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);
 
        programLabel = new JLabel("Program: ");
        programList = new JComboBox<String>();
 
        programList.addItem("BIM");
        programList.addItem("BCIS");
        programList.addItem("BBA-BI");

        mobileNoLabel = new JLabel("Phone: ");
        mobileNoField = new JTextField();
 
        mailLabel = new JLabel("Email: ");
        mailField = new JTextField();
 
        add = new JButton("Add");
        reset = new JButton("Reset");
        cancel = new JButton("Cancel");
        add.addActionListener(this);
        reset.addActionListener(this);
        cancel.addActionListener(this);

        container = getContentPane();
        container.setLayout(null);
        setBounds();
        addComponents();
        
        
        
 
    }
 
    public void setBounds() {
        nameLabel.setBounds(50, 20, 100, 30);
        nameField.setBounds(130, 20, 200, 30);

        addLabel.setBounds(50, 60, 100, 30);
        addField.setBounds(130, 60, 200, 30);
 
        genderLabel.setBounds(50, 100, 100, 30);
        genderMale.setBounds(130, 100, 100, 30);
        genderFemale.setBounds(240, 100, 100, 30);

        programLabel.setBounds(50, 140, 100, 30);
        programList.setBounds(130, 140, 200, 30);
 
        mobileNoLabel.setBounds(50, 180, 100, 30);
        mobileNoField.setBounds(130, 180, 200, 30);
 
       
        mailLabel.setBounds(50, 220, 100, 30);
        mailField.setBounds(130, 220, 200, 30);
 
        add.setBounds(20, 260, 100, 30);
        reset.setBounds(130, 260, 100, 30);
        cancel.setBounds(240, 260, 100, 30);
    }
 
    public void addComponents() {
        container.add(nameLabel);
        container.add(nameField);
        container.add(addLabel);
        container.add(addField);
        container.add(genderLabel);
        container.add(genderMale);
        container.add(genderFemale);
        container.add(programLabel);
        container.add(programList);

        container.add(mobileNoLabel);
        container.add(mobileNoField);
        container.add(mailLabel);
        container.add(mailField);
       
        container.add(add);
        container.add(reset);
        container.add(cancel);
    }
 
    public static void main(String[] args) {
        lab5Qn9 frame = new lab5Qn9();
        frame.setTitle("Student Register Form");
        frame.setVisible(true);
        frame.setBounds(500, 100, 400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
 
    }
    String g,program;
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // String name = nameField.getText();
        program = programList.getItemAt(programList.getSelectedIndex());
        if(genderMale.isSelected()){
             g = new String("Male");
        }
        else if(genderFemale.isSelected()){
             g = new String("Female");
        }


        if(e.getSource()==add){
            pane = new JOptionPane("Student Information");
            JOptionPane.showMessageDialog(null, e, "Name: "+"\t\t"+
            nameField.getText()+"\n"+ "Address : " + "\t\t"+ addField.getText() + 
            "\n" + "Gender" + "\t\t"+ g + "\n Program: \t\t"+ program +
             "\nMobile Number: \t\t" + mobileNoLabel.getText() + "\n Email: \t\t"+
             mailField.getText(), JOptionPane.INFORMATION_MESSAGE); 
             JOptionPane.showMessageDialog(null, e, "\n address" +addField.getText(), ABORT);

        }
        if(e.getSource()== reset){
            nameField.setText("");
            addField.setText("");
            genderMale.setSelected(false);
            genderFemale.setSelected(false);
            programList.setSelectedIndex(0);
            mobileNoField.setText("");
            mailField.setText("");
        }
        if(e.getSource()== cancel){
            System.exit(1);
        }
    }
 
}