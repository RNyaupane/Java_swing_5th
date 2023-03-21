import javax.swing.*;
public class lab5Qn11   {
    public lab5Qn11() {
        JFrame f =new JFrame();
        JMenuBar menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);

        JMenu normalMenu = new JMenu("Normal Menu");
        JMenu radioMenu = new JMenu("Radio Menu");
        JMenu checkMenu = new JMenu("Check Menu");

        menuBar.add(normalMenu);
        menuBar.add(radioMenu);
        menuBar.add(checkMenu);

        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");

        JRadioButtonMenuItem firstradio = new JRadioButtonMenuItem("Large Font");
        JRadioButtonMenuItem secondradio = new JRadioButtonMenuItem("Medium Font");

        JCheckBoxMenuItem firstcheck= new JCheckBoxMenuItem("First Radio Options");
        JCheckBoxMenuItem secondcheck = new JCheckBoxMenuItem("Second Radio Options");



        ButtonGroup fontGroup = new ButtonGroup();
        fontGroup.add(firstradio);
        fontGroup.add(secondradio);

        normalMenu.add(newMenuItem);
        normalMenu.add(openMenuItem);

        radioMenu.add(firstradio);
        radioMenu.add(secondradio);

        checkMenu.add(firstcheck);
        checkMenu.add(secondcheck);

        f.setTitle("JMenu Demo");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {

        new lab5Qn11();

    };

}