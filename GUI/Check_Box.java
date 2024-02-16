package GUI;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Check_Box {
    public static void main(String[] args){
        JFrame jf= new JFrame("This is an Advanced Java Class");
        jf.setSize(800,600);
        jf.setLocation(200,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setLayout(null);

        JCheckBox chbox1 = new JCheckBox("High School");
        JCheckBox chbox2 = new JCheckBox("Intermediate");
        JCheckBox chbox3 = new JCheckBox("Undergraduate");
        JCheckBox chbox4 = new JCheckBox("Post Graduation");
        JCheckBox chbox5 = new JCheckBox("PhD");

        chbox1.setBounds(100,100,200,50);
        chbox2.setBounds(100,150,200,50);
        chbox3.setBounds(100,200,200,50);
        chbox4.setBounds(100,250,200,50);
        chbox5.setBounds(100,300,200,50);

        c.add(chbox1);
        c.add(chbox2);
        c.add(chbox3);
        c.add(chbox4);
        c.add(chbox5);
        chbox1.setSelected(true);
        // chbox3.setEnabled(false);

        jf.setVisible(true);
    }
}