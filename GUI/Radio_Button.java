package GUI;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Radio_Button {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Radio_Button");
        jf.setSize(800, 600);
        jf.setLocation(200, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);
        Font f = new Font("verdana", Font.BOLD, 30);
        
        // Gender Radio Buttons
        JRadioButton rdmale = new JRadioButton("Male");
        rdmale.setBounds(100, 100, 200, 50);
        rdmale.setFont(f);
        c.add(rdmale);
        
        JRadioButton rdfemale = new JRadioButton("Female");
        rdfemale.setBounds(300, 100, 200, 50);
        rdfemale.setFont(f);
        c.add(rdfemale);
        
        ButtonGroup gender = new ButtonGroup();
        gender.add(rdmale);
        gender.add(rdfemale);
        
        // Cast Radio Buttons
        JRadioButton obc = new JRadioButton("OBC");
        obc.setBounds(50, 200, 200, 50);
        obc.setFont(f);
        c.add(obc);
        
        JRadioButton general = new JRadioButton("General");
        general.setBounds(250, 200, 200, 50);
        general.setFont(f);
        c.add(general);
        
        JRadioButton sc = new JRadioButton("SC");
        sc.setBounds(450, 200, 200, 50);
        sc.setFont(f);
        c.add(sc);
        
        JRadioButton other = new JRadioButton("Other");
        other.setBounds(650, 200, 200, 50);
        other.setFont(f);
        c.add(other);
        
        ButtonGroup cast = new ButtonGroup();
        cast.add(obc);
        cast.add(general);
        cast.add(sc);
        cast.add(other);
        
        jf.setVisible(true);
    }
}